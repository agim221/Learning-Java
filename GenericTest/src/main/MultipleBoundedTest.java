package main;

public class MultipleBoundedTest {

	public static void main(String[] args) {
//		RunApp<FirstClass> first = new RunApp<MultipleBoundedTest.FirstClass>(new FirstClass());  //Error
		RunApp<SecondClass> second = new RunApp<MultipleBoundedTest.SecondClass>(new SecondClass());
	}
	
	public static interface HelloWorld {
		void helloWorld();
	}
	
	public static interface Hello {
		void helloWorld();
	}
	
	public static class Test {
		
	}
	
	public static class FirstClass extends Test {
		void helloWorld() {
			System.out.println("Hello world");
		}
	}
	
	public static class SecondClass extends Test implements HelloWorld, Hello {
		public void helloWorld() {
			System.out.println("Hello World");
		}
	}
	
	public static class RunApp<T extends Test & HelloWorld & Hello> {
		private T data;

		public RunApp(T data) {
			super();
			this.data = data;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}
		
		
	}
}
