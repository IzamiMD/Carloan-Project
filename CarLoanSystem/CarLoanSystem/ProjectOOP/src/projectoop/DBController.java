
package projectoop;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DBController {
    Connection myConn;
    Statement myStmt;
    ResultSet myRs;
    PreparedStatement pstmt;
    Scanner input = new Scanner(System.in);
    
    public void setConnect(){
        
        try{
        myConn = DriverManager.getConnection("jdbc:mysql://localhost:3307", "root", "");
        myStmt = myConn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        //System.out.println("Database connected!");
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void viewDataCustomer(){
        
        try{
        myRs = myStmt.executeQuery("SELECT * FROM customer");
        myRs.next();
            System.out.println(myRs.getString("ID"));
            System.out.println(myRs.getString("username"));
            System.out.println(myRs.getString("password"));
            System.out.println(myRs.getString("age"));
            System.out.println(myRs.getString("personalLoan"));
            System.out.println(myRs.getString("eduLoan"));
            System.out.println(myRs.getString("otherCarLoan"));
            System.out.println(myRs.getString("cardLoan"));
            System.out.println(myRs.getString("income"));
        }catch(SQLException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    public void viewDataCar(){
        
        try{
        myRs = myStmt.executeQuery("SELECT * FROM car");
        myRs.next();
            System.out.println(myRs.getString("type"));
            System.out.println(myRs.getString("transmission"));
            System.out.println(myRs.getString("model"));
            System.out.println(myRs.getString("loanDuration"));
            System.out.println(myRs.getString("downPayment"));
            System.out.println(myRs.getString("bank"));
        }catch(SQLException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void insertData(){
        String type, transmission,powertrain;
        int speed;
        
        System.out.print("Enter type:"); type = input.next();
        System.out.print("Enter transmission:"); transmission = input.next();
        System.out.print("Enter powertrain:"); powertrain = input.next();
        System.out.print("Enter speed:"); speed = input.nextInt();
        
        String insertQuery = "INSERT INTO vehicleinfo VALUES (?,?,?,?,?)";
        
        try{
            pstmt = myConn.prepareStatement(insertQuery);
            pstmt.setInt(1, 0);
            pstmt.setString(2, type);
            pstmt.setString(3, transmission);
            pstmt.setString(4, powertrain);
            pstmt.setInt(5, speed);
            
            pstmt.executeUpdate();
        }catch(SQLException e){
            System.out.println("Error: " + e.getMessage());
        }
        
    }
    
    public void nextData(){
        try{
       
        if(myRs.next()){
            System.out.println(myRs.getString("type"));
            System.out.println(myRs.getString("transmission"));
            System.out.println(myRs.getString("powertrain"));
            System.out.println(myRs.getString("speed"));
        }else{
            myRs.previous();
            System.out.println("End of data!");
        }
        }catch(SQLException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    
     public void previousData(){
        try{
       
        if(myRs.previous()){
            System.out.println(myRs.getString("type"));
            System.out.println(myRs.getString("transmission"));
            System.out.println(myRs.getString("powertrain"));
            System.out.println(myRs.getString("speed"));
        }else{
            myRs.next();
            System.out.println("Start of data!");
        }
        }catch(SQLException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        DBController db = new DBController();
        db.setConnect();
        db.viewDataCustomer();
        db.viewDataCar();
//        db.insertData();
//        db.viewData();
//        db.nextData();
//        db.nextData();
//         db.nextData();
//         System.out.println("");
//         db.previousData();
//          db.previousData();
//           db.previousData();
//            db.previousData();
//            db.previousData();
    }
    
}
