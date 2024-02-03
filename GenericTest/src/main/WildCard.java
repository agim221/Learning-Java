package main;

public class WildCard {
	public static void main(String[] args) {
		printData(new GenericClass<String>("Agim"));
		printData(new GenericClass<Number>(2));
	}
	
	public static void printData(GenericClass<?> data) {
		System.out.println(data.getData());
	}
}
