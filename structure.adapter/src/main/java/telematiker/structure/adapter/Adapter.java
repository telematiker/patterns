package telematiker.structure.adapter;

public interface Adapter {
	
	<T> T adapt(Class<T> adapter);
	
}
