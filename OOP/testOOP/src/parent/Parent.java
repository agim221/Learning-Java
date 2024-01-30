package parent;

public class Parent {
	public static final String NAME = "Agim";
	
	static {
		System.out.println("get execute by process Parent");
	}
	
	public String getName() {
		return NAME;
	}
	
	public class Inner {
//		public static final String name = "Inner";
		private String secondName;
//		
//		static {
//			System.out.println("get execute by process Inner");
//		}
		
		public Inner(String secondName) {
			this.setSecondName(secondName);
		}
		
//		public static String getName() {
//			return name;
//		}

		public String getSecondName() {
			return secondName;
		}

		public void setSecondName(String secondName) {
			this.secondName = secondName;
		}
		
		public void hayAgim() {
			System.out.println("Halo agim");
		}
	}
}
