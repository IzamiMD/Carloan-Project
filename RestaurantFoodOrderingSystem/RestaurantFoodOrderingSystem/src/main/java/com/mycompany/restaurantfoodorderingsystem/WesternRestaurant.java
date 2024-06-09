/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restaurantfoodorderingsystem;

/**
 *
 * @author Izami
 */
class WesternRestaurant extends Restaurant {
    public WesternRestaurant(String name, Menu menu) {
        super(name, menu);
    }

    @Override
    public void displayRestaurantInfo() {
        System.out.println("This is a Western restaurant.");
    }
}

