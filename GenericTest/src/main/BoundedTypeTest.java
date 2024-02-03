package main;

public class BoundedTypeTest<T extends Number, U> {
	private T data;

	public BoundedTypeTest(T data) {
		super();
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	public static void main(String[] args) {
		BoundedTypeTest<Integer, Object> test1 = new BoundedTypeTest<Integer, Object>(2);
		BoundedTypeTest<Double, Object> test2 = new BoundedTypeTest<Double, Object>(2.3);
		
//		BoundedTypeTest<String> test3 = new BoundedTypeTest<String>("Agim"); //error
	}
}
