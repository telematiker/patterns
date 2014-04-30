package telematiker;

import telematiker.creational.builder.BuilderExampleObject;
import telematiker.creational.builder.TelescopeContructorExampleObject;

public class Main {

	public static void main(String[] args) {
		System.err.println("example 1");
		System.err.println(new TelescopeContructorExampleObject("name", Main.class));
		System.err.println(BuilderExampleObject.create().name("name").type(Main.class).build());
		System.err.println("\n");
		
		System.err.println("example 2");
		System.err.println(new TelescopeContructorExampleObject("name", Main.class, Main.class.hashCode()));
		System.err.println(BuilderExampleObject.create().name("name").type(Main.class).hashCode(Main.class.hashCode()).build());
		System.err.println("\n");
		
		System.err.println("example 3 reverse order");
		System.err.println(new TelescopeContructorExampleObject(Main.class, Main.class.hashCode()));
		System.err.println(BuilderExampleObject.create().hashCode( Main.class.hashCode() ).type(Main.class).build());
		System.err.println("\n");
		
		System.err.println("example 4 shufled order");
		System.err.println(new TelescopeContructorExampleObject("name", Main.class, Main.class.hashCode()));
		System.err.println(BuilderExampleObject.create().hashCode( Main.class.hashCode() ).name("name").type(Main.class).build());
		

	}

}
