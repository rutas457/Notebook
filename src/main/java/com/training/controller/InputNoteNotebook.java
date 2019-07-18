package main.java.com.training.controller;

import main.java.com.training.view.View;

import java.util.Scanner;
import main.java.com.training.view.Messages;

public class InputNoteNotebook {
    private View view;
    private Scanner sc;

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
    private String index;
    private String city;
    private String street;
    private String houseNumber;
    private String apartmentNumber;

    public InputNoteNotebook(View view, Scanner sc) {
        this.view = view;
        this.sc = sc;
    }

    public void inputNote() {
        UtilityController utilityController =
                new UtilityController(sc, view);
        this.name =
                utilityController.inputStringValueWithScanner
                        (Messages.INPUT_NAME, Regex.NAME);
        this.patronymic =
                utilityController.inputStringValueWithScanner
                        (Messages.INPUT_PATRONYMIC, Regex.NAME);
        this.surname =
                utilityController.inputStringValueWithScanner
                        (Messages.INPUT_SURNAME, Regex.NAME);
        this.nickname =
                utilityController.inputStringValueWithScanner
                        (Messages.INPUT_NICKNAME, Regex.NICKNAME);
        this.comment =
                utilityController.inputStringValueWithScanner
                        (Messages.INPUT_COMMENT, Regex.COMMENT );
        this.homePhoneNumber=
                utilityController.inputStringValueWithScanner
                        (Messages.INPUT_HOME_PHONE_NUMBER, Regex.PHONE_NUMBER);
        this.mobilePhoneNumber =
                utilityController.inputStringValueWithScanner
                        (Messages.INPUT_MOBILE_PHONE_NUMBER, Regex.PHONE_NUMBER);
        this.secondMobilePhoneNumber =
                utilityController.inputStringValueWithScanner
                        (Messages.INPUT_SECOND_MOBILE_PHONE_NUMBER, Regex.PHONE_NUMBER_OPTIONAL);
        this.email =
                utilityController.inputStringValueWithScanner
                        (Messages.INPUT_EMAIL, Regex.EMAIL );
        this.skype=
                utilityController.inputStringValueWithScanner
                        (Messages.INPUT_SKYPE, Regex.SKYPE);
        this.index =
                utilityController.inputStringValueWithScanner
                        (Messages.INPUT_INDEX, Regex.INDEX);
        this.city =
                utilityController.inputStringValueWithScanner
                        (Messages.INPUT_CITY, Regex.CITY);
        this.street =
                utilityController.inputStringValueWithScanner
                        (Messages.INPUT_STREET, Regex.STREET);
        this.houseNumber =
                utilityController.inputStringValueWithScanner
                        (Messages.INPUT_HOUSE_NUMBER, Regex.HOUSE_NUMBER);
        this.apartmentNumber =
                utilityController.inputStringValueWithScanner
                        (Messages.INPUT_APARTMENT_NUMBER, Regex.APARTMENT_NUMBER);
    }

    public View getView() {
        return view;
    }

    public Scanner getSc() {
        return sc;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public String getNickname() {
        return nickname;
    }

    public String getComment() {
        return comment;
    }

    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public String getSecondMobilePhoneNumber() {
        return secondMobilePhoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getSkype() {
        return skype;
    }

    public String getIndex() {
        return index;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }
}
