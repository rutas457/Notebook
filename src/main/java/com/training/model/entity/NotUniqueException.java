package main.java.com.training.model.entity;

public class NotUniqueException extends Exception {

    public NotUniqueException(String message) {
        super(message);
        printStackTrace();
    }
}
