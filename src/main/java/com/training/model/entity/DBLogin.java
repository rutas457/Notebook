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
        for (DBLogin usedLogin : DBLogin.values()) {
            if (login.equals(usedLogin)) {
                throw new NotUniqueException(View.bundle.getString(Messages.NOT_UNIQUE_OUT));
            }
        }
    }
}
