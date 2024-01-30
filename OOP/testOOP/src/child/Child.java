package child;

import parent.Parent;

public class Child extends Parent{
	private String name;
	
	public Child(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
