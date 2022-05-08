package entity;

import java.sql.Date;
import java.util.List;

public class User {
    private int id;
    private String name;
    private String surName;
    private String fatName;
    private Date birthDate;
    private Integer idNumber;
    private String finCode;
    private String city;
    private String address;
    private Integer phoneNumber;
    private String email;
    private List<UserBankAccount> userBankAccountList;

    public User(){}

    public User(int id, String name, String surName, String fatName, Date birthDate, Integer idNumber, String finCode, String city, String address, Integer phoneNumber, String email, List<UserBankAccount> userBankAccountList) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.fatName = fatName;
        this.birthDate = birthDate;
        this.idNumber = idNumber;
        this.finCode = finCode;
        this.city = city;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.userBankAccountList = userBankAccountList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getFatName() {
        return fatName;
    }

    public void setFatName(String fatName) {
        this.fatName = fatName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(Integer idNumber) {
        this.idNumber = idNumber;
    }

    public String getFinCode() {
        return finCode;
    }

    public void setFinCode(String finCode) {
        this.finCode = finCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<UserBankAccount> getUserBankAccountList() {
        return userBankAccountList;
    }

    public void setUserBankAccountList(List<UserBankAccount> userBankAccountList) {
        this.userBankAccountList = userBankAccountList;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", fatName='" + fatName + '\'' +
                ", birthDate=" + birthDate +
                ", idNumber=" + idNumber +
                ", finCode='" + finCode + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", userBankAccountList=" + userBankAccountList +
                '}';
    }
}

