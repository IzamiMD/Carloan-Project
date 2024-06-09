/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restaurantfoodorderingsystem;

/**
 *
 * @author Izami
 */
class WesternMenu implements Menu {
    private String[] items = {"Steak", "Pasta", "Burger"};
    private double[] prices = {15.0, 12.0, 8.0};

    public void displayMenu() {
        System.out.println("Western Menu:");
        for (int i = 0; i < items.length; i++) {
            System.out.println((i + 1) + ". " + items[i] + " - RM" + prices[i]);
        }
    }

    public double getItemPrice(String itemName) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase(itemName)) {
                return prices[i];
            }
        }
        return 0.0; 
    }
}
