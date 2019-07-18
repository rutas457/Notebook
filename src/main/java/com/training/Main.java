package main.java.com.training;

import main.java.com.training.controller.Controller;
import main.java.com.training.model.Model;
import main.java.com.training.view.View;

public class Main {

    public static void main(String[] args) {

        Controller controller =
                new Controller(new Model(), new View());

        controller.processUser();
    }
}
