package telematiker;

import java.util.LinkedList;
import java.util.List;

import telematiker.creational.abstract_.factory.AbstractCarFactory;
import telematiker.creational.abstract_.factory.CheapCarFactory;
import telematiker.creational.abstract_.factory.ExpensiveCarFactory;
import telematiker.creational.abstract_.factory.cars.Car;

public abstract class Main {

	public static void main(String[] args) {
		List<AbstractCarFactory> factories = new LinkedList<AbstractCarFactory>();
		factories.add(new CheapCarFactory());
		factories.add(new ExpensiveCarFactory());
		
		//Produces 100 cars of alternating type depending on number of carfactories
		for (int i = 1; i <= 100; i++) {
			AbstractCarFactory abstractCarFactory = factories.get(i % factories.size());
			Car createCar = abstractCarFactory.createCar();
			System.err.println("Car #"+i+" "+createCar);
		}
		

	}

}
