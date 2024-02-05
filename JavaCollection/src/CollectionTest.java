import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class CollectionTest {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<String>();

        collection.add("Agim");
        collection.add("Java");
        collection.addAll(List.of("Time", "Flies", "So", "Fast"));

        for(var i : collection) {
            System.out.println(i);
        }

        collection.remove("Java");
        for(var i : collection) {
            System.out.println(i);
        }

        collection.clear();
        System.out.println(collection.isEmpty());
    }
}
