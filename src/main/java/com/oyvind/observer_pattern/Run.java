package main.java.com.oyvind.observer_pattern;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sender sender = new Sender();
        Receiver receiver = new Receiver(sender);
        sender.addObserver(receiver);

        System.out.print("Enter Message: ");
        String mess = scanner.nextLine();
        sender.setMessage(mess);
    }
}
