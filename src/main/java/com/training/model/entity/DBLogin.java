package main.java.com.training.model.entity;

import main.java.com.training.view.Messages;
import main.java.com.training.view.View;

public enum DBLogin {
    NOTE_ONE("rutas457"),
    NOTE_TWO("admin"),
    NOTE_THREE("qwerty");


    private String login;
    DBLogin(String login) {
        this.login = login;
    }

    public static void isAlreadyTaken(String login) throws NotUniqueException {
        for (DBLogin note : DBLogin.values()) {
            if (note.login.equals(login)) {
                throw new NotUniqueException(Messages.NOT_UNIQUE_OUT);
            }
        }
    }
}
