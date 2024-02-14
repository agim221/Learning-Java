package belajar.java.junit.mockingtest;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

public class TryingMocking {


    @Test
    public void runApp() {
        List<String> list = Mockito.mock(List.class);

        Mockito.when(list.get(0)).thenReturn("Agim");

        list.get(0);

//        System.out.println(list.get(0));
        Mockito.verify(list, Mockito.times(1)).get(0);
    }



}
