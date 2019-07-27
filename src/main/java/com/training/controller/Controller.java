package main.java.com.training.controller;

import main.java.com.training.model.Model;
import main.java.com.training.model.entity.DBLogin;
import main.java.com.training.model.entity.NotUniqueException;
import main.java.com.training.view.View;

import java.util.Date;
import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        InputNoteNotebook inputNoteNoteBook =
                new InputNoteNotebook(view, sc);
        inputNoteNoteBook.inputNote();

        model.setName(inputNoteNoteBook.getName());
        model.setPatronymic(inputNoteNoteBook.getPatronymic());
        model.setSurname(inputNoteNoteBook.getSurname());

        model.setNickname(inputNoteNoteBook.getNickname());

        model.setComment(inputNoteNoteBook.getComment());
        model.setHomePhoneNumber(inputNoteNoteBook.getHomePhoneNumber());
        model.setMobilePhoneNumber(inputNoteNoteBook.getMobilePhoneNumber());
        model.setSecondMobilePhoneNumber(inputNoteNoteBook.getSecondMobilePhoneNumber());
        model.setEmail(inputNoteNoteBook.getEmail());
        model.setSkype(inputNoteNoteBook.getSkype());
        model.setAddress(view.concatenationString(
                inputNoteNoteBook.getIndex() + " ",
                inputNoteNoteBook.getCity() + " ",
                inputNoteNoteBook.getStreet() + " ",
                inputNoteNoteBook.getHouseNumber() + " ",
                inputNoteNoteBook.getApartmentNumber() + " "
        ));
        model.setStatus();
        model.setCreationDate(new Date(System.currentTimeMillis()));
        model.setChangeDate(new Date(System.currentTimeMillis()));

        System.out.println(model.toString());
    }
}

