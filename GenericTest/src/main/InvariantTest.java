package main;

public class InvariantTest {
	public static void main(String[] args) {
		GenericClass<Integer> numberSec = new GenericClass<Integer>(2);
		GenericClass<Number> number = new GenericClass<Number>(1);
		GenericClass<Number> assign1 = number;
//		GenericClass<Integer> assign2 = number; //Error
		
		GenericClass<? extends Number> assign3 = numberSec;
		GenericClass<? super Integer> assign4 = number;
	}
}
