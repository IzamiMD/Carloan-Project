/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectoop;

/**
 *
 * @author jicoo
 */
public class PriceFactory {
    
     public Price getCalculatePrice(String type)
     {
          Price C1 = null;
        
        if(type.equals("0") )
        {
            C1 = new Sedan();   
        }
        else if(type.equals("1") )
        {
            C1 = new SuperCar();    
        }
        else
        {
            C1 = new MPV();    
        }
        
        
        return C1;
    }
     
  }
    

