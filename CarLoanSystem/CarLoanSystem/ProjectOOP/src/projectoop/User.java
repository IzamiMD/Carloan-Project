/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectoop;

/**
 *
 * @author jicoo
 */
public abstract class User {

    protected String name, username, password;
    protected int age;
    protected Car car;
    
    
    public User(){}
    
    public User(String name, int age, String username, String password, Car car)
    {
        this.name =name;
        this.age = age;
        this.username = username;
        this.password = password;

        this.car = car;

    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
    
    public abstract double totalPayment();
    
}
