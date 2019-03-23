package main.java.com.oyvind.observer_pattern;

import java.util.Observable;

public class Sender extends Observable {
    private String message;
    public Sender(){}

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        setChanged();
        notifyObservers();
    }
}
