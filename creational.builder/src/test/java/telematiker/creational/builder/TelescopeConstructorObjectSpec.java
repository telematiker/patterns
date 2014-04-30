package telematiker.creational.builder;

import org.junit.Assert;
import org.junit.Test;

public class TelescopeConstructorObjectSpec {

	@Test
	public void testObject1a() {
		TelescopeContructorExampleObject object = new TelescopeContructorExampleObject("name");
		Assert.assertNotNull(object);
		System.err.println(object.toString());
	}
	
	
	@Test
	public void testObject2a() {
		TelescopeContructorExampleObject object = new TelescopeContructorExampleObject("name", getClass());
		Assert.assertNotNull(object);
		System.err.println(object.toString());
	}
	
	@Test
	public void testObject3a() {
		TelescopeContructorExampleObject object = new TelescopeContructorExampleObject("name", getClass(), this.hashCode());
		Assert.assertNotNull(object);
		System.err.println(object.toString());
	}
	
	@Test
	public void testObject4a() {
		TelescopeContructorExampleObject object = new TelescopeContructorExampleObject("name", this.hashCode());
		Assert.assertNotNull(object);
		System.err.println(object.toString());
	}
	
	
	@Test
	public void testObject1b() {
		TelescopeContructorExampleObject object = new TelescopeContructorExampleObject(getClass());
		Assert.assertNotNull(object);
		System.err.println(object.toString());
	}
	
	@Test
	public void testObject2b() {
		TelescopeContructorExampleObject object = new TelescopeContructorExampleObject(getClass(), hashCode());
		Assert.assertNotNull(object);
		System.err.println(object.toString());
	}
	
	
	@Test
	public void testObject1c() {
		TelescopeContructorExampleObject object = new TelescopeContructorExampleObject(this.hashCode());
		Assert.assertNotNull(object);
		System.err.println(object.toString());
	}


}
