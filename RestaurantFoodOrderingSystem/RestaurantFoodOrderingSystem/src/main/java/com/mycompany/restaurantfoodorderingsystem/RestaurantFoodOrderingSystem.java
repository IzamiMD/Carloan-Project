/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.restaurantfoodorderingsystem;

/**
 *
 * @author Izami
 */
public class RestaurantFoodOrderingSystem {
    public static void main(String[] args) {
        
        
        Restaurant westernRestaurant = new WesternRestaurant("Western Restaurant", new WesternMenu());
    

        
       
        westernRestaurant.displayMenu();
       
    }
}