package main;

import exception.AnnotationTest;

public enum TestEnum {
	HANDPHONE("handphone"),
	ALAT(),
	GELAS(), 
	PIRING();
	
	private String name;
	
	TestEnum() {
		this("Agim");
	}
	
	TestEnum(@AnnotationTest(name = "parameter TestEnum") String name) {
		this.name = name;
	}

	@AnnotationTest(name = "test")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
