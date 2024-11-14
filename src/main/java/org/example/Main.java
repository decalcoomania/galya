package org.example;
import bank.BankSystem;

public class Main {
    private static BankSystem bankSystem;

    public static void main(String[] args) {
        bankSystem = new BankSystem();  // Звичайне створення
        bankSystem.run();
    }

    // Метод для тестування
    public static void setBankSystem(BankSystem bankSystem) {
        Main.bankSystem = bankSystem;
    }
}
