package telematiker.creational.builder;

/**
 * 
 * builder pattern as a fluent builder!
 * http://en.wikipedia.org/wiki/Builder_pattern
 * http://www.javacodegeeks.com/2013/01/the-builder-pattern-in-practice.html
 */
public class BuilderExampleObject extends ExampleObject {

	public static synchronized Builder create() {
		return new Builder();
	}

	public static class Builder {
		private String name;
		private Class<?> type;
		private Integer hashCode;

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder type(Class<?> type) {
			this.type = type;
			return this;
		}

		public Builder hashCode(Integer hashCode) {
			this.hashCode = hashCode;
			return this;
		}

		public BuilderExampleObject build() {
			return new BuilderExampleObject(this);
		}
	}

	private BuilderExampleObject(Builder builder) {
		if (builder.name != null)
			setName(builder.name);
		if (builder.type != null)
			setType(builder.type);
		if (builder.hashCode != null)
			setHashCode(builder.hashCode);
	}
}
