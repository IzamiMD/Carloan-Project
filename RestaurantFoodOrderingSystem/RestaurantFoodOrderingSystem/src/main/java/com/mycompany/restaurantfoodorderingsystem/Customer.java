/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restaurantfoodorderingsystem;

/**
 *
 * @author Izami
 */
class Customer implements CustomerDetailsDisplay, FoodSelectionAndPayment {
    private String name;
    private String address;
    private String phone;
    private double totalAmount;

    public Customer(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    @Override
    public void displayCustomerDetails(String name, String address, String phone) {
        System.out.println("Customer Details:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
    }

    @Override
    public void displayFoodOptions(Menu menu) {
        menu.displayMenu();
    }

    @Override
    public void chooseFoodItem(String itemName, double price) {
        System.out.println("Item chosen: " + itemName + " - Price: RM" + price);
        totalAmount += price;
    }

    @Override
    public double payForOrder(double amount) {
        System.out.println("Total Amount to Pay: RM" + totalAmount);
        
        return totalAmount;
    }

    // Getters sahaja
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }
}
