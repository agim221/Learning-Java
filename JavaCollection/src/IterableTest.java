import java.util.Iterator;
import java.util.List;

public class IterableTest {
    public static void main(String[] args) {
        Iterable<String> texts = List.of("Agim", "Jadi", "Programmer");

        for (var text : texts) {
            System.out.println(text);
        }

        System.out.println("Iterator Test");
        Iterator<String> iteratorTest = texts.iterator();

        while(iteratorTest.hasNext()) {
            System.out.println(iteratorTest.next());
        }


    }
}
