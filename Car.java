
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car
{
    // instance variables - replace the example below with your own
    private int     yearManufactured;
    private String  carMake;
    private String  carModel;
    private Car[] cars;
    
    /**
     * Constructor for objects of class Car
     */
    public Car(int yearManufactured, String carMake, String carModel)
    {
        // initialise instance variables
        cars = new Car[5]; 
        cars[0] = new Car(2016,"honda","civic");
        cars[2] = new Car(2017,"lamborghini","aventador");
        cars[3] = new Car(2000,null,"caravan");
        cars[4] = new Car(2010,"dodge", null);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getYearManufactured()
    {
        // put your code here
        return yearManufactured;
    }
    
    /**
     * @return carMake is the make of the car
     */
    public String getCarMake()
    {
        // put your code here
        return carMake;
    }
    
    /**
     * @return  carModel for the model of car
     */
    public String getCarModel()
    {
        // put your code here
        return carModel;
    }
}
