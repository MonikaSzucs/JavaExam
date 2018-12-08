
/**
 * Write a description of class UsedCarLot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Iterator;
public class UsedCarLot
{
    // instance variables - replace the example below with your own
    private ArrayList<Car> cars;

    private String carLotName;

    /**
     * Constructor for objects of class UsedCarLot
     */
    public UsedCarLot()
    {
        // initialise instance variables
        cars = new ArrayList<Car>();
        cars.add(new Car(2016, "honda", "civic"));
        cars.add(new Car(2017, "Lamborghini", "aventador"));
        cars.add(new Car(2000, null, "caravan"));
        cars.add(new Car(2010, "dodge", null));
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void addCar(Car car)
    {
        // put your code here
        Car.add(car);
        return null;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String listAllCars()
    {
        String total = "";
        for(Car eachCar : cars){
            if(eachCar != null){
                total += cars.getCarMake() + " " + cars.getCarModel() +  " ";
            }
        }
        return total;

    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void removeCarsBetween(int firstYear, int lastYear)
    {
        Iterator<Car> it = cars.iterator();
        while(it.hasNext()){
            if(cars.getYearManufactured()>firstYear && cars.getYearManufactured()<lastYear){
                it.remove();
            }
        }
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Car[] getCarsMadeBy(String maker)
    {
        Car[] matches;
        
        int numMatches = 0;
        Iterator<Car> it = cars.iterator();
        while(it.hasNext()) {
            Car cars = it.next();
            if (cars != null) {
                numMatches++;
            }
        }
        
        if (numMatches > 0) {
            matches = new Car[numMatches];
        } else {
            return null;
        }
        
        int index = 0;
        Iterator<Car> its = cars.iterator();
        while(its.hasNext()) {
            Car cars = its.next();
            if (cars != null) {
                matches[index] = cars;
                index++;
            }
        }
        
        return matches;
        
    }
}
