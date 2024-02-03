package Test;

import main.GenericClass;
import main.GenericClass.DoubleGeneric;

public class GenericClassTest {
    public static void main(String[] args) {
        GenericClass<String> data = new GenericClass<String>("Agim");
        System.out.println(data.getData());
        
        GenericClass.DoubleGeneric<String, Integer> user = new DoubleGeneric<String, Integer>("Test", 1223);
        
        System.out.println(user.getName());
        System.out.println(user.getNumber());
        
        Integer[] test = { 1, 2, 3, 4,5 };
        
        System.out.println(GenericClass.<Integer>count(test));
    }
}
