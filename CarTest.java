import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CarTest{

    private Car car1;
    private Car car2;

    @Before
    public void setUp()
    {
        car1 = new Car(2016, "honda", "civic");
        car2 = new Car(2017, "Lamborghini", "aventador");
        
    }


    @After
    public void tearDown()
    {
        car1 = null;
        car2 = null;
    }
    
    @Test
    public void test1(){
        assertEquals(2016, car1.getYearManufactured());
        assertEquals(2017, car2.getYearManufactured());
        
    }
    
    @Test
    public void test2(){
        assertEquals("honda", car1.getMake());
        assertEquals("Lamborghini", car2.getMake());
        
    }
    
    @Test
    public void test3(){
        assertEquals("civic", car1.getModel());
        assertEquals("aventador", car2.getModel());
        
    }
    
    @Test
    public void test4(){
        CarLot lot1 = new CarLot(car1);
        CarLot lot2 = new CarLot(car2);  
        
        assertEquals(lot1.getCar(0), car1);
        assertEquals(lot2.getCar(0), car2);        
    }
    
    
    @Test
    public void test5(){
        
        CarLot lot1 = new CarLot();

        assertEquals(lot1.getCar(0).getYearManufactured(), 2016);
        assertEquals(lot1.getCar(0).getMake(), "honda");
        assertEquals(lot1.getCar(0).getModel(), "civic");

        assertEquals(lot1.getCar(1), null);
        
        assertEquals(lot1.getCar(2).getYearManufactured(), 2017);
        assertEquals(lot1.getCar(2).getMake(), "Lamborghini");
        assertEquals(lot1.getCar(2).getModel(), "aventador");
        
        assertEquals(lot1.getCar(3).getYearManufactured(), 2000);
        assertEquals(lot1.getCar(3).getMake(), null);
        assertEquals(lot1.getCar(3).getModel(), "caravan");
        
        assertEquals(lot1.getCar(4).getYearManufactured(), 2010);
        assertEquals(lot1.getCar(4).getMake(), "dodge");
        assertEquals(lot1.getCar(4).getModel(), null);
    }
    
    @Test
    public void test6(){
        UsedCarLot lot1 = new UsedCarLot("Jason's Used Cars");
        assertEquals(lot1.getName(), "Jason's Used Cars");
        
        assertEquals("hondacivicLamborghiniaventadorcaravandodge", lot1.listAllCars());
        
        lot1.removeCarsBetween(2015, 2018);
        
        assertEquals("caravandodge", lot1.listAllCars());
        
        
        lot1.addCar(car2);
        assertEquals("caravandodgeLamborghiniaventador", lot1.listAllCars());
        
    }
    
    
    @Test
    public void test7(){
        UsedCarLot lot1 = new UsedCarLot("");
        
        Car car3 = new Car(1988, "Lamborghini", "diablo");        
        Car car4 = new Car(2007, "Lamborghini", "gallardo");        
        
        lot1.addCar(car3);
        lot1.addCar(car4);
        
        Car[] matchingCars = lot1.getCarsMadeBy("Lamborghini");
        
        assertEquals(3, matchingCars.length);
        for(Car car : matchingCars){
            assertEquals("Lamborghini", car.getMake());
        }
        
        
        Car[] hondas = lot1.getCarsMadeBy("honda");
        assertEquals(1, hondas.length);
        
        assertEquals(hondas[0].getMake(), "honda");
    }
    
}
