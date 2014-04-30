package telematiker.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class ExpensiveObject extends Prototype<ExpensiveObject> {

	private String someValue = "someValue";
	
	private Map<String, Integer> someMap = new HashMap<String, Integer>();
	
	private Integer someInteger = (int) 100L;
	
	public ExpensiveObject() {
		for (int i = 0; i < 10000; i++) {
			someMap.put(someValue+i, (someInteger*i)%someInteger);
		}
	}
	


	public String getSomeValue() {
		return someValue;
	}


	public void setSomeValue(String someValue) {
		this.someValue = someValue;
	}




	public Integer getSomeInteger() {
		return someInteger;
	}


	public void setSomeInteger(Integer someInteger) {
		this.someInteger = someInteger;
	}
	
	
	
}
