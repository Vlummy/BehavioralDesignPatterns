package main.java.com.oyvind.observer_pattern;

import java.util.Observable;
import java.util.Observer;

public class Receiver implements Observer {
    private Sender sender = null;

    public Receiver(Sender sender) {
        this.sender = sender;
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o == sender) {
            System.out.println("Received message: " + sender.getMessage());
        }
    }
}
