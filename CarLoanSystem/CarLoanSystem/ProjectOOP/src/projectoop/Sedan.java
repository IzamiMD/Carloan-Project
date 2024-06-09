/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectoop;

/**
 *
 * @author User
 */
public class Sedan extends Car implements Price {
    private String model[] = {"2023 Toyota Vios 1.5E AT", "2019 Proton Persona Executive 1.6", "Honda CR-V 2.0", "2020 Honda Accord 1.5TC Premium"};
    private int cc[] = {2000, 1500, 2000, 1500};
  
    
    public Sedan(){};
    
    public Sedan(String type, String transmission, String model[], int cc[]) {
        super(type, transmission);
        this.model = model;
        this.cc = cc;
    }
    
    public String getModel(int choose) {
        
        this.choose = choose;
        
        if (this.choose == 0) return model[0];
        else if (this.choose == 1) return model[1];
        else if (this.choose == 2) return model[2];
        else if (this.choose == 3) return model[3];
        else return "Invalid number";
    }

    public void setModel(String model) {
        if(model.equalsIgnoreCase("0")) this.choose = Integer.parseInt(model);
        if(model.equalsIgnoreCase("1")) this.choose = Integer.parseInt(model);
        if(model.equalsIgnoreCase("2")) this.choose = Integer.parseInt(model);
        if(model.equalsIgnoreCase("3")) this.choose = Integer.parseInt(model);
    }
    
 
    
    public int getCc() {
        if (choose == 0) return cc[0];
        else if (choose == 1) return cc[1];
        else if (choose == 2) return cc[2];
        else if (choose == 3) return cc[3];
        else return -1;
    }

    public void setCc(int cc[]) {
        this.cc = cc;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if(transmission.equalsIgnoreCase("0")) this.transmission = "Manual";
        else if(transmission.equalsIgnoreCase("1")) this.transmission = "Auto";
    }

    public PlateNumber getNoplate() {
        return Noplate;
    }

    public void setNoplate(PlateNumber Noplate) {
        this.Noplate = Noplate;
    }

    @Override
    public double calculatePrice() {
        if (choose == 0) return 259000;
        else if (choose == 1) return 143560;
        else if (choose == 2) return 89800;
        else if (choose == 3) return 115888;
        else return -1;
    }


}
