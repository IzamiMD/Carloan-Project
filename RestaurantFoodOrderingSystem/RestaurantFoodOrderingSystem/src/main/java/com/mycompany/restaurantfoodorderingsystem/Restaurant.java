/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restaurantfoodorderingsystem;

/**
 *
 * @author Izami
 */
abstract class Restaurant {
    private String name;
    private Menu menu;

    public Restaurant(String name, Menu menu) {
        this.name = name;
        this.menu = menu;
    }
//method dari interface
    public void displayMenu() {
        System.out.println(name + " Menu:");
        menu.displayMenu();
    }

    public double getItemPrice(String itemName) {
        return menu.getItemPrice(itemName);
    }

    //tmbh abstarct untuk display the info
    public abstract void displayRestaurantInfo();
    
    public void displayCustomerDetails(String name, String address, String phone){
        System.out.println("Customer name" + name);
    
    }
            
    
}