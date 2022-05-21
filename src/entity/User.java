package entity;

import java.time.LocalDate;
import java.util.List;

public class User {
    private int id;
    private String name;
    private String surName;
    private String fatName;
    private LocalDate birthDate;
    private String city;
    private String address;
    private String idSeria;
    private Integer idNumber;
    private String finCode;
    private String phoneNumber;
    private String email;
    private UserBankAccount bankAccountInfo;

    private List<UserBankAccount> userBankAccountList;

    public User() {
    }

    public User(int id) {
        this.id = id;
    }

    public User(String name, String surName, String fatName, String finCode, UserBankAccount bankAccountInfo) {
        this.name = name;
        this.surName = surName;
        this.fatName = fatName;
        this.finCode = finCode;
        this.bankAccountInfo = bankAccountInfo;
    }

    public User(String name, String surName, String fatName, LocalDate birthDate, String city, String address, String idSeria, Integer idNumber, String finCode, String phoneNumber, String email) {
        this.name = name;
        this.surName = surName;
        this.fatName = fatName;
        this.birthDate = birthDate;
        this.city = city;
        this.address = address;
        this.idSeria = idSeria;
        this.idNumber = idNumber;
        this.finCode = finCode;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public User(int id, String name, String surName, String fatName, LocalDate birthDate, String city, String address, String idSeria, Integer idNumber, String finCode, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.fatName = fatName;
        this.birthDate = birthDate;
        this.city = city;
        this.address = address;
        this.idSeria = idSeria;
        this.idNumber = idNumber;
        this.finCode = finCode;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public User(String finCode) {
        this.finCode = finCode;
    }

    public User(String name, String surName, String fatName, String finCode) {
        this.name = name;
        this.surName = surName;
        this.fatName = fatName;
        this.finCode = finCode;
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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
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

    public String getIdSeria() {
        return idSeria;
    }

    public void setIdSeria(String idSeria) {
        this.idSeria = idSeria;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
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

    public UserBankAccount getBankAccountInfo() {
        return bankAccountInfo;
    }

    public void setBankAccountInfo(UserBankAccount bankAccountInfo) {
        this.bankAccountInfo = bankAccountInfo;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", fatName='" + fatName + '\'' +
                ", birthDate=" + birthDate +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", idSeria='" + idSeria + '\'' +
                ", idNumber=" + idNumber +
                ", finCode='" + finCode + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", userBankAccountList=" + userBankAccountList +
                '}';
    }

    public String toStringForFinCodeSearching() {
        return "User{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", fatName='" + fatName + '\'' +
                ", finCode='" + finCode + '\'' +
                ", bankAccountInfo=" + bankAccountInfo.toString() +
                '}';
    }
}

