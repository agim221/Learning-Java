package main;

public record TestRecord(String name, int value) {

	public TestRecord {
		System.out.println("Create new record");	
	}
	
	public TestRecord(String name) {
		this(name, 3);
	}
	
	public TestRecord(int value) {
		this("Agim", value);
	}
	
	public TestRecord() {
		this("Agim", 3);
	}
	
	public String name() {
		return name;
	}

	public int value() {
		return value;
	}

	
}
