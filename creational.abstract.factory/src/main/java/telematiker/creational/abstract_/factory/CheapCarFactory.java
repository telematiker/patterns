package telematiker.creational.abstract_.factory;

import telematiker.creational.abstract_.factory.cars.Car;
import telematiker.creational.abstract_.factory.cars.CheapCar;

/**
 * 
 *
 */
public class CheapCarFactory extends AbstractCarFactory {

	@Override
	public Car createCar() {	
		return new CheapCar();
	}

}
