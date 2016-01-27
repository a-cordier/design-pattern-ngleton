# "NGleton" using static final instances

# Provide n ready made instances of an object using static final references and a private constructor

```java

	private String name;
	private Integer value;
	
	public static final NGleton instanceOne = 
			new NGleton("One", 1);
	
	public static final NGleton instanceTwo = 
			new NGleton("two", 2);
	
	private NGleton(String name, Integer value) {
		this.name = name;
		this.value = value;
	} 
```
