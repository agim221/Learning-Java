package exception;

import java.lang.reflect.Field;

public class test {
	public static void returnException(Account account) throws Throwable {
		if(account.getName() == null) {
			throw new Throwable();
		} else if(account.getPassword() == null) {
			throw new Throwable();
		} else {
			throw new Throwable();
		}
	}
	
	public static void validationReflection(Object object) throws Exception {
	    Class aClass = object.getClass();
	    Field[] fields = aClass.getDeclaredFields();

	    for (var field : fields) {
	      field.setAccessible(true);

	      if (field.getAnnotation(NotBlank.class) != null) {
	        // validated
	        try {
	          String value = (String) field.get(object);

	          if (value == null || value.isBlank()) {
	            throw new Exception("Field " + field.getName() + " is blank ");
	          }

	        } catch (IllegalAccessException exception) {
	          System.out.println("Tidak bisa mengakses field " + field.getName());
	        }
	      }

	    }
	}
}
