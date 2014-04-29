package telematiker.creational.abstract_.factory;

import org.junit.Assert;
import org.junit.Test;

import telematiker.creational.abstract_.factory.cars.Car;
import telematiker.creational.abstract_.factory.cars.CheapCar;
import telematiker.creational.abstract_.factory.cars.ExpensiveCar;



public class AbstractFactorySpec {

	@Test
	public void testInitCheap() {
		AbstractCarFactory carFactory = new	CheapCarFactory();
		Assert.assertNotNull(carFactory);
		
	}
	
	@Test
	public void testInitExpensive() {
		AbstractCarFactory carFactory = new	ExpensiveCarFactory();
		Assert.assertNotNull(carFactory);
		
	}
	
	@Test
	public void testCreateExpensiveCar(){
		AbstractCarFactory carFactory = new	ExpensiveCarFactory();
		Car car = carFactory.createCar();
		Assert.assertNotNull(car);
		Assert.assertTrue(car instanceof ExpensiveCar);
	}
	
	
	@Test
	public void testCreateCheapCar(){
		AbstractCarFactory carFactory = new	CheapCarFactory();
		Car car = carFactory.createCar();
		Assert.assertNotNull(car);
		Assert.assertTrue(car instanceof CheapCar);
	}


}
