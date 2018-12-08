
/**
 * Write a description of class CarLot here.
 *
 * @author Monika Szucs
 * @version December 7 2018
 */

import java.util.ArrayList;
public class CarLot
{
    // instance variables - replace the example below with your own
    private int x;
    private Car[] cars;

    /**
     * Constructor for objects of class CarLot
     */
    public CarLot()
    {
        // initialise instance variables
        cars = new Car[5]; 
        cars[0] = new Car(2016,"honda","civic");
        cars[2] = new Car(2017,"lamborghini","aventador");
        cars[3] = new Car(2000,null,"caravan");
        cars[4] = new Car(2010,"dodge", null);
    };

    /**
     * Constructor for objects of class CarLot
     */
    public CarLot(String car)
    {
        // initialise instance variables
        cars = new Car[1]; 
        cars[0] = new Car(2016,"honda","civic");

    };

    public void addCar(Car car){
        if(!(cars[0].equals(""))){
            System.out.println("No room");
        }
        else{
            cars[0] = car;
        }
    }

    public Car getCar(int index){
        
        if(index >=0 && index <=4){
            return cars[index];
            
        }
        return null;
    }
    
    
    public Car getOldestCar(){
        int i = 0;
        int year = 10000;
        int pos = 0;
        
        if(cars.getYearManufactured()>0 && cars.getYearManufactured()<4){
            while(i < cars.length){
                if(cars.getYearManufactured()<year){
                    year = cars.getYearManufactured();
                    pos = i;
                }
            }
            return Car;
        };
        return null;
        
    }
    
    public Car getNewestCar(){
        int i = 0;
        
        if(cars.getYearManufactured()>0 && cars.getYearManufactured()<4){
            while(i < cars.length){
                
            }
        };
        return null;
        
    }

}
