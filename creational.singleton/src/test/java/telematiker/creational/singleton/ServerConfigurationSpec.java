package telematiker.creational.singleton;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import telematiker.creational.singleton.ServerConfiguration;

public class ServerConfigurationSpec {

	@Test
	public void testGetInstance() throws IOException {
		ServerConfiguration configuration = ServerConfiguration.getInstance();
		Assert.assertNotNull(configuration);
	}
	
	@Test
	public void testGetInstanceEquals() throws IOException {
		ServerConfiguration configuration1 = ServerConfiguration.getInstance();
		ServerConfiguration configuration2 = ServerConfiguration.getInstance();
		Assert.assertTrue(configuration1 == configuration2);
	}
	
	
	@Test
	public void testGetUserName1() throws IOException {
		ServerConfiguration configuration2 = ServerConfiguration.getInstance();
		ServerConfiguration configuration1 = ServerConfiguration.getInstance();
		Assert.assertEquals(configuration2.getUserName(), configuration1.getUserName());
	}
	
	
	
	@Test
	public void testUrl1() throws IOException {
		ServerConfiguration configuration2 = ServerConfiguration.getInstance();
		ServerConfiguration configuration1 = ServerConfiguration.getInstance();
		Assert.assertEquals(configuration2.getUrl(), configuration1.getUrl());
		
	}
	
	

}
