/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectoop;


public class Customer extends User{
    
    private double loanDuration;
    private double downPayment;
    private Bank bank;
    private double creditCardLoan;
    private double eduLoan;
    private double carLoan;
    private double personalLoan;
    private double income;
    private double payment;
    private int count;

    
    
    public Customer(){}
    
    public Customer(String name, int age, String username, String password, Car car, int loanDuration, double downpayment, Bank bank, double creditCardLoan, double eduLoan, double carLoan, double personalLoan, double income)
    {   
        super(name,age,username,password,car);
        car = new Car();
        
        this.loanDuration = loanDuration;
        this.downPayment = downPayment;
        
        this.bank = bank;
        bank = new Bank();
        
        this.creditCardLoan = creditCardLoan;
        this.eduLoan = eduLoan;
        this.carLoan = carLoan;
        this.personalLoan = personalLoan;
        this.income = income;
        
    }
    
    
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getLoanDuration() {
        return loanDuration;
    }

    public void setLoanDuration(double loanDuration) {
        this.loanDuration = loanDuration;
    }

    public double getDownPayment() {
        return downPayment;
    }

    public void setDownPayment(double downPayment) {
        this.downPayment = downPayment;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }
    
    public void setPayment(double payment){
        this.payment = payment;
    }
    
    @Override
    public double totalPayment(){
        return payment;
    }
    
    
    public double Calculation(double carPrice)
    {
        bank = new Bank();
        
        double months = loanDuration * 12;
        double price = carPrice - ((downPayment/100) * carPrice);
        payment = (price + (price * bank.getInterest())) / months;
        
        return payment;
    }
 
    public int Eligibility()
    {
        double totalCommitment = personalLoan + carLoan + creditCardLoan + eduLoan;
        double dtir = (income/totalCommitment) * 100;
        
        if(dtir > 40 || age > 20) return 0;
        else return -1;
     
   
    }
    public double getCreditCardLoan() {
        return creditCardLoan;
    }

    public void setCreditCardLoan(double creditCardLoan) {
        this.creditCardLoan = creditCardLoan;
    }

    public double getEduLoan() {
        return eduLoan;
    }

    public void setEduLoan(double eduLoan) {
        this.eduLoan = eduLoan;
    }

    public double getCarLoan() {
        return carLoan;
    }

    public void setCarLoan(double carLoan) {
        this.carLoan = carLoan;
    }

    public double getPersonalLoan() {
        return personalLoan;
    }

    public void setPersonalLoan(double personalLoan) {
        this.personalLoan = personalLoan;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
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
    
}
