package main;

public class GenericClass<T> {
    private T data;

    public GenericClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
    
	@SuppressWarnings("unchecked")
	public static <X> X[] count(X[] datas) {
		return datas;
    }
    
    public static class DoubleGeneric<T, U> {
    	private T name;
    	private U number;
    	
		public DoubleGeneric(T name, U number) {
			super();
			this.name = name;
			this.number = number;
		}
		
		public T getName() {
			return name;
		}
		
		public void setName(T name) {
			this.name = name;
		}
		
		public U getNumber() {
			return number;
		}
		
		public void setNumber(U number) {
			this.number = number;
		}
    }
}
