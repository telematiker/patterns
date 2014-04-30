package telematiker.creational.builder;

/**
 * Anti pattern the telescoping constructor:
 * http://en.wikipedia.org/wiki/Builder_pattern
 */
public class TelescopeContructorExampleObject extends ExampleObject{
	
	 
	public TelescopeContructorExampleObject(String name) {
		setName(name);

	}

	public TelescopeContructorExampleObject(String name, Class<?> type) {
		setName(name);
		setType(type);

	}

	public TelescopeContructorExampleObject(Class<?> type) {

		setType(type);

	}

	public TelescopeContructorExampleObject(int hashCode) {
		setHashCode(hashCode);
	}

	public TelescopeContructorExampleObject(String name, Class<?> type, int hashCode) {
		setName(name);
		setType(type);
		setHashCode(hashCode);
	}

	public TelescopeContructorExampleObject(String name, int hashCode) {
		setName(name);
		setHashCode(hashCode);
	}

	public TelescopeContructorExampleObject(
			Class<?> type,
			int hashCode) {
		setType(type);
		setHashCode(hashCode);
	}
}
