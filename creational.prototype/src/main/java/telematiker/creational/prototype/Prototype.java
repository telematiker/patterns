package telematiker.creational.prototype;


public class Prototype<T> implements java.lang.Cloneable {

	@SuppressWarnings("unchecked")
	public T clone() throws CloneNotSupportedException{
		return (T) super.clone();
	}
	
}
