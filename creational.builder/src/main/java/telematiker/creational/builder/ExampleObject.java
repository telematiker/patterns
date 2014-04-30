
package telematiker.creational.builder;

/**
 * 
 * Base Object to demonstrate the {@link BuilderExampleObject} and {@link TelescopeContructorExampleObject}
 * based on the same type.
 * <br>
 * simple bean with setter and getter
 * 
 *
 */
public class ExampleObject {

	private static final String NO_NAME = "NO_NAME";
	private static final Class<Object> DEFAULT_TYPE = Object.class;
	private static final int DEFAULT_HASHCODE = 0;

	private String name = NO_NAME;
	private Class<?> type = DEFAULT_TYPE;
	private int hashCode = DEFAULT_HASHCODE;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Class<?> getType() {
		return type;
	}
	public void setType(Class<?> type) {
		this.type = type;
	}
	public int getHashCode() {
		return hashCode;
	}
	public void setHashCode(int hashCode) {
		this.hashCode = hashCode;
	}
	@Override
	public String toString() {
		return "ExampleObject [name=" + name + ", type=" + type + ", hashCode="
				+ hashCode + "]";
	}

	
	
	

}
