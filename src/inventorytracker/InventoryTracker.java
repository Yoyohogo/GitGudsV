/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorytracker;

import java.util.Scanner;

/**
 *
 * @author rodec8600
 */
public class InventoryTracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Inventory inventory = new Inventory();
        int selection = 1;
        do {
            System.out.println("1. Add widget"
                    + "\n2. Remove widget"
                    + "\n3. View inventory"
                    + "\n0. Exit");

            try {
                Scanner input = new Scanner(System.in);
                selection = input.nextInt();
                isValid(selection, inventory);
            } catch (NumberFormatException e) {
                System.out.println("Please provide valid input.");
            }
        } while (selection != 0);
    }

    private static void isValid(int selection, Inventory inventory) {
        if (selection == 0) {
            System.out.println(inventory.exit());
            System.exit(0);
        } else if (selection == 1) {
            inventory.addWidget();
        } else if (selection == 2) {
            inventory.removeWidget();
        } else if (selection == 3) {
            System.out.println(inventory.toString());
        } else {
            System.out.println("Please provide valid input.");
        }
    }

}
