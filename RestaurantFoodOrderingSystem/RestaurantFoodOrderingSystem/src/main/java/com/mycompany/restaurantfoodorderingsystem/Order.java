/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restaurantfoodorderingsystem;

/**
 *
 * @author Izami
 */
class Order {
    private String[] items;
    private double totalCost;

    public Order() {
        items = new String[0];
        totalCost = 0.0;
    }

    public void addItem(String itemName, double price) {
        // array di sini
        String[] newItems = new String[items.length + 1];
        System.arraycopy(items, 0, newItems, 0, items.length);
        newItems[items.length] = itemName;
        items = newItems;

        
        totalCost += price;
    }

    public void removeItem(String itemName, double price) {
        // buang array/delete 
        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase(itemName)) {
                String[] newItems = new String[items.length - 1];
                System.arraycopy(items, 0, newItems, 0, i);
                System.arraycopy(items, i + 1, newItems, i, items.length - i - 1);
                items = newItems;
                break;
            }
        }

        // Update 
        totalCost -= price;
    }

    public void calculateTotal() {
        
        System.out.println("Total Cost: RM" + totalCost);
    }

    // Getters  saja
    public String[] getItems() {
        return items;
    }

    public double getTotalCost() {
        return totalCost;
    }
}
