
package projectoop;

public class MPV extends Car implements Price {
    private String model[]={"2022 Perodua Alza 1.5 X", "2019 Toyota Avanza 1.5E", "2023 Toyota Vellfire 2.5", "2020 Hyundai Grand Starex Executive Plus"};
    private int cc[]={1500, 1500, 1000, 1000};
    
    public MPV(){};
    
    public MPV(String type, String transmission, String model[], int cc[]) {
        super(type, transmission);
        this.model = model;
        this.cc = cc;
    }

    public void setModel(String model) {
        if(model.equalsIgnoreCase("0")) this.choose = Integer.parseInt(model);
        if(model.equalsIgnoreCase("1")) this.choose = Integer.parseInt(model);
        if(model.equalsIgnoreCase("2")) this.choose = Integer.parseInt(model);
        if(model.equalsIgnoreCase("3")) this.choose = Integer.parseInt(model);
    }

    public String getModel(int choose) {
        
        this.choose = choose;
        
        if (this.choose == 0) return model[0];
        else if (this.choose == 1) return model[1];
        else if (this.choose == 2) return model[2];
        else if (this.choose == 3) return model[3];
        else return "Invalid number";
    }
    
    public void setCc(int cc[]) {
        this.cc = cc;
    }

    public int getCc() {
        if (choose == 0) return cc[0];
        else if (choose == 1) return cc[1];
        else if (choose == 2) return cc[2];
        else if (choose == 3) return cc[3];
        else return -1;
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
        if (choose == 0) return 62500;
        else if (choose == 1) return 77963;
        else if (choose == 2) return 438000;
        else if (choose == 3) return 163888;
        else return -1;
    }
    
}
