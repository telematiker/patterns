package telematiker;

import telematiker.creational.prototype.CheapObject;
import telematiker.creational.prototype.ExpensiveObject;
import telematiker.creational.prototype.Prototype;

/**
 * 
 * Shows cloning of cheap vs expensive objects.
 * <br>
 * http://en.wikipedia.org/wiki/Prototype_pattern
 *
 */
public class Main {

	private static final int NUMBER_OF_OBJECT = 1000;

	public static void main(String[] args) throws CloneNotSupportedException, InstantiationException, IllegalAccessException {
		System.err.println("######################################");
		System.err.println("###########    EXPENSIVE   ###########");
		System.err.println("######################################");
		System.err.println("\n");
		
		
		for (int i = 0; i < 4; i++) {
			System.err.println("#" + i
					+ " New vs. Cloning for expensive Objects");
			new1000Objects(ExpensiveObject.class);
			clone1000Objects(ExpensiveObject.class);
			System.err.println("\n");
		}
		
		System.err.println("######################################");
		System.err.println("###########      CHEAP     ###########");
		System.err.println("######################################");
		System.err.println("\n");

		for (int i = 0; i < 4; i++) {
			System.err.println("#" + i + " New vs. Cloning for cheap Objects");
			new1000Objects(CheapObject.class);
			clone1000Objects(CheapObject.class);
			System.err.println("\n");
		}

		// TODO Auto-generated method stub

	}


	private static <T extends Prototype> void clone1000Objects(Class<T > type) throws CloneNotSupportedException, InstantiationException, IllegalAccessException {
		long currentTimeMillis = System.currentTimeMillis();
		T newObject = type.newInstance();
		for (int i = 0; i < NUMBER_OF_OBJECT; i++) {
			newObject = (T) newObject.clone(); 
			newObject.toString();
		}
		long time = System.currentTimeMillis() - currentTimeMillis;
		System.err.println("clone took " + time + " ms");

	}

	public static <T> void new1000Objects(Class<T> type) throws InstantiationException, IllegalAccessException {
		long currentTimeMillis = System.currentTimeMillis();
		T newObject = null;
		for (int i = 0; i < NUMBER_OF_OBJECT; i++) {
			newObject = type.newInstance();
			newObject.toString();
		}
		long time = System.currentTimeMillis() - currentTimeMillis;
		System.err.println("new took " + time + " ms");
	}

}
