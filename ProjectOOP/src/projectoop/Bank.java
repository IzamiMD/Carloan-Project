/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectoop;


public class Bank {

    private String bankName;
    private double interest;

    
    public Bank(){}
    
    public String getbankName()
    {
        return bankName;
    }
    
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    
    public void setInterest(double interest) {
        this.interest = interest;
    }
    
    public double getInterest()
    {
        return interest;
    }
    
}
