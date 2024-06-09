
package projectoop;

public class Car {
    
    protected String type; 
    protected String transmission;
    protected PlateNumber Noplate;
   
    protected int choose;
    protected String model[];

    public Car() {}
    
    public Car(String type, String transmission)
    {
        this.type = type;
        this.transmission = transmission;
        
    }
    
       public String[] getModel() {
        return model;
    }

    public void setModel(String[] model) {
        this.model = model;
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
    
    
    
    public int getChoose() {
        return choose;
    }

    public void setChoose(int choose) {
        this.choose = choose;
    }
    
   
    
}
