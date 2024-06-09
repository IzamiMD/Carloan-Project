/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restaurantfoodorderingsystem;

/**
 *
 * @author Izami
 */
public interface FoodSelectionAndPayment {
    void displayFoodOptions(Menu menu);
    void chooseFoodItem(String itemName, double price);
    double payForOrder(double amount);
    
}
