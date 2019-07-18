package main.java.com.training.controller;

import main.java.com.training.view.View;

import java.util.Scanner;

public class UtilityController {
    private Scanner scanner;
    private View view;

    public UtilityController(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    String inputStringValueWithScanner(String message, String regex) {
        String res;
        view.printStringInput(message);
        while( !(scanner.hasNext() &&
                (res = scanner.next()).matches(View.bundle.getString(regex)))) {
            view.printWrongStringInput(message);
        }
        return res;
    }

}
