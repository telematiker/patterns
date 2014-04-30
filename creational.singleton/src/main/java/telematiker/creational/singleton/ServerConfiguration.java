package telematiker.creational.singleton;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

/**
 * Singleton Pattern! http://en.wikipedia.org/wiki/Singleton_pattern
 * 
 */
public class ServerConfiguration {

	private static final String URL = "url";

	private static final String USERNAME = "username";

	private static ServerConfiguration instance;
	private Properties properties;

	private ServerConfiguration() throws IOException {
		this.properties = new Properties();
		properties.load(getClass().getResourceAsStream(
				"/conf/server.properties"));
	}

	public synchronized static ServerConfiguration getInstance()
			throws IOException {
		if (instance == null) {
			instance = new ServerConfiguration();
		}
		return instance;
	}

	public String getUserName() {
		return properties.getProperty(USERNAME);
	}

	public URL getUrl() {
		try {
			return new URL(properties.getProperty(URL));
		} catch (MalformedURLException e) {
			throw new RuntimeException("URL is incorrect!",e);
		}
	}

	@Override
	public String toString() {
		return "ServerConfiguration [getUserName()=" + getUserName()
				+ ", getUrl()=" + getUrl() + "]";
	}
	
	

}
