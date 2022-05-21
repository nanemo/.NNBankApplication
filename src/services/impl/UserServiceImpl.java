package services.impl;

import entity.User;
import entity.UserBankAccount;
import mysqlservice.ConnectionService;
import services.UserService;
import java.sql.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;

public class UserServiceImpl extends ConnectionService implements UserService {

    private User getUser(ResultSet rs) throws Exception {
        int id = rs.getInt("id");
        String name = rs.getString("name");
        String surname = rs.getString("surname");
        String fatherName = rs.getString("father_name");
        LocalDate birthDate = rs.getDate("birth_date").toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        String city = rs.getString("city");
        String address = rs.getString("address");
        String idSeria = rs.getString("id_seria");
        int idNumber = rs.getInt("id_number");
        String finCode = rs.getString("fin_code");
        String phoneNumber = rs.getString("phone_number");
        String email = rs.getString("email");

        return new User(id, name, surname, fatherName, birthDate, city, address, idSeria, idNumber, finCode, phoneNumber, email);
    }

    public User checkUserFinCodeIsExist(ResultSet rs) throws Exception{
        String name = rs.getString("name");
        String surname = rs.getString("surname");
        String fatherName = rs.getString("father_name");
        String finCode = rs.getString("fin_code");

        return new User(name, surname, fatherName, finCode);
    }

    public User getUserForFinCode(ResultSet rs) throws Exception {
        String name = rs.getString("name");
        String surname = rs.getString("surname");
        String fatherName = rs.getString("father_name");
        String finCode = rs.getString("fin_code");
        long bankaccount = rs.getLong("bank_account");
        String currency = rs.getString("currency");
        double balance = rs.getDouble("balance");

        UserBankAccount userBankAccount = new UserBankAccount(bankaccount, currency, balance);

        return new User(name, surname, fatherName, finCode, userBankAccount);
    }

    @Override
    public User getByFinCode(String finCode) {
        User result = null;
        List<User> resultAsList = null;
        try (Connection c = connect()) {
            Statement stmt = c.createStatement();
            stmt.execute("SELECT name, surname, father_name, fin_code, bankaccount, currency, balance" +
                    " FROM user_list " +
                    " INNER JOIN user_bank_account_list ON user_list.fin_code = user_bank_account_list.associated_fincode " +
                    " WHERE user_list.fin_code =" + "'" + finCode + "'");
            ResultSet rs = stmt.getResultSet();

            while (rs.next()) {
                result = (getUserForFinCode(rs));
                System.out.println(result.toStringForFinCodeSearching());
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }


        return result;
    }

    @Override
    public boolean addUser(User u) {
        try (Connection c = connect()) {
            PreparedStatement stmt = c.prepareStatement("INSERT INTO user_list(name, surname, father_name, bith_date, city, address, id_seria, id_number, fin_code, phone_number, email) values(?,?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, u.getName());
            stmt.setString(2, u.getSurName());
            stmt.setString(3, u.getFatName());
            stmt.setDate(4, Date.valueOf(u.getBirthDate()));
            stmt.setString(5, u.getCity());
            stmt.setString(6, u.getAddress());
            stmt.setString(7, u.getIdSeria());
            stmt.setInt(8, u.getIdNumber());
            stmt.setString(9, u.getFinCode());
            stmt.setString(10, u.getPhoneNumber());
            stmt.setString(11, u.getEmail());
            return stmt.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
