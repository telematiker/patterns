package telematiker;

import java.io.IOException;

import telematiker.creational.singleton.ServerConfiguration;

public class Main {

	public static void main(String[] args) throws IOException {
		for (int i = 0; i < 100; i++) {
			ServerConfiguration instance = ServerConfiguration.getInstance();
			System.err.println("singleton call #"+i+": "+instance.toString() +" hashcode "+instance.hashCode());
		}
	}

}
