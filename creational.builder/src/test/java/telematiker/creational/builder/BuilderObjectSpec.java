package telematiker.creational.builder;

import org.junit.Assert;
import org.junit.Test;

public class BuilderObjectSpec {

	@Test
	public void testObject1a() {
		BuilderExampleObject object = BuilderExampleObject.create()
				.name("name").build();
		Assert.assertNotNull(object);
		System.err.println(object.toString());
	}

	@Test
	public void testObject2a() {
		BuilderExampleObject object = BuilderExampleObject.create()
				.name("name").type(getClass()).build();
		Assert.assertNotNull(object);
		System.err.println(object.toString());
	}

	@Test
	public void testObject3a() {
		BuilderExampleObject object = BuilderExampleObject.create()
				.name("name").type(getClass()).hashCode(hashCode()).build();
		Assert.assertNotNull(object);
		System.err.println(object.toString());
	}

	@Test
	public void testObject4a() {
		BuilderExampleObject object = BuilderExampleObject.create()
				.name("name").hashCode(hashCode()).build();
		Assert.assertNotNull(object);
		System.err.println(object.toString());
	}

	@Test
	public void testObject1b() {
		BuilderExampleObject object = BuilderExampleObject.create()
				.type(getClass()).build();
		Assert.assertNotNull(object);
		System.err.println(object.toString());
	}

	@Test
	public void testObject2b() {
		BuilderExampleObject object = BuilderExampleObject.create()
				.type(getClass()).hashCode(hashCode()).build();
		Assert.assertNotNull(object);
		System.err.println(object.toString());
	}

	@Test
	public void testObject1c() {
		BuilderExampleObject object = BuilderExampleObject.create()
				.hashCode(hashCode()).build();
		Assert.assertNotNull(object);
		System.err.println(object.toString());
	}

}
