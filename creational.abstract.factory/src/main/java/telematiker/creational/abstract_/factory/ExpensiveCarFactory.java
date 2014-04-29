package telematiker.creational.abstract_.factory;

import telematiker.creational.abstract_.factory.cars.Car;
import telematiker.creational.abstract_.factory.cars.ExpensiveCar;

/**
 * 
 *
 */
public class ExpensiveCarFactory extends AbstractCarFactory {

	@Override
	public Car createCar() {
		return new ExpensiveCar();
	}

}
