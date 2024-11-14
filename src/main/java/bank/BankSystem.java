package bank;

import menu.IMenu;

public class BankSystem {

    private IMenu menu;

    // Constructor that allows injecting the menu
    public BankSystem(IMenu menu) {
        this.menu = menu;
    }

    public BankSystem() {
        
    }

    public BankSystem(Bank bank, IMenu menu) {
    }

    public void run() {
        if (menu != null) {
            menu.showMainMenu(); // Call the method on the menu object
        }
    }

    // Getter for testing purposes
    public IMenu getMenu() {
        return menu;
    }
}
