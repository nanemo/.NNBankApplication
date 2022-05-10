package services.impl;

import entity.User;
import mysqlservice.ConnectionService;
import services.UserService;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.HashMap;

public class UserServiceImpl extends ConnectionService implements UserService {

    public User getUser() {
        return null;
    }

    @Override
    public User getByIdIndex(Integer idIndex) {
        User user = null;
        try (Connection c = connect()) {
            Statement stmt = c.createStatement();
            stmt.execute();

            return stmt.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean addUser(User u) {
        try (Connection c = connect()) {
            PreparedStatement stmt = c.prepareStatement("INSERT INTO user_list(name, surName, fatName, birtDate, idNumber, finCode, city, address, phoneNumber, email) values(?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, u.getName());
            stmt.setString(2, u.getSurName());
            stmt.setString(3, u.getFatName());
            stmt.setDate(4, Date.valueOf(u.getBirthDate()));
            stmt.setInt(5, u.getIdNumber());
            stmt.setString(6, u.getFinCode());
            stmt.setString(7, u.getCity());
            stmt.setString(8, u.getAddress());
            stmt.setInt(9, u.getPhoneNumber());
            stmt.setString(10, u.getEmail());
            return stmt.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean remove(String idIndex) {
        return false;
    }

    @Override
    public boolean update(User u) {
        return false;
    }
}
