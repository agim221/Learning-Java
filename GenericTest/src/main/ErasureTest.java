package main;

public class ErasureTest {
	public static void main(String[] args) {
		GenericClass data = new GenericClass("Agim");
		
		GenericClass<String> dataS = data;
	}
}
