package de.pizzamanager;
import javax.swing.*;
public class Main { public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> new PizzaFrame().setVisible(true)); }
}
