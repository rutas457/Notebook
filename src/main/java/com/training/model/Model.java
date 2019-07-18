package main.java.com.training.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Model {

    private String name;
    private String patronymic;
    private String surname;

    private String nickname;

    private String comment;

    private String homePhoneNumber;
    private String mobilePhoneNumber;
    private String secondMobilePhoneNumber;

    private String email;
    private String skype;

    private String address;

    private Date creationDate;
    private Date changeDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    public void setHomePhoneNumber(String homePhoneNumber) {
        this.homePhoneNumber = homePhoneNumber;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public String getSecondMobilePhoneNumber() {
        return secondMobilePhoneNumber;
    }

    public void setSecondMobilePhoneNumber(String secondMobilePhoneNumber) {
        this.secondMobilePhoneNumber = secondMobilePhoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Date changeDate) {
        this.changeDate = changeDate;
    }

    @Override
    public String toString() {
        return "Model{" +
                "name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", surname='" + surname + '\'' +
                ", nickname='" + nickname + '\'' +
                ", comment='" + comment + '\'' +
                ", homePhoneNumber='" + homePhoneNumber + '\'' +
                ", mobilePhoneNumber='" + mobilePhoneNumber + '\'' +
                ", secondMobilePhoneNumber='" + secondMobilePhoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", skype='" + skype + '\'' +
                ", address='" + address + '\'' +
                ", creationDate=" + new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z").format(creationDate) +
                ", changeDate=" + changeDate +new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z").format(changeDate)
        ;
    }
}
