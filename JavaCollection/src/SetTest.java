import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        Set<String> names = new HashSet<String>();

        names.add("jaman");
        names.add("Agim");
        names.add("jamaz");
        names.add("Cicak");
        names.add("zajh");
//
        for (var name : names) {
            System.out.println(name);
        }

        Set<String> linkedHashSet = new LinkedHashSet<String>();

        linkedHashSet.add("jaman");
        linkedHashSet.add("Agim");
        linkedHashSet.add("jamaz");
        linkedHashSet.add("Cicak");
        linkedHashSet.add("zajh");

        for(var test : linkedHashSet) {
            System.out.println(test);
        }

//        Set<String> treeSet = new TreeSet<String>();
        NavigableSet<String> treeSet = new TreeSet<String>();

        treeSet = treeSet.descendingSet();
        treeSet.add("jaman");
        treeSet.add("Agim");
        treeSet.add("jamaz");
        treeSet.add("Cicak");
        treeSet.add("zajh");

        System.out.println("TreeSet");

        for(var test : treeSet) {
            System.out.println(test);
        }

        Set<Object> emptySet = Collections.emptySet();
        Set<Object> singleton = Collections.singleton(treeSet);
        Set<String> stringSet = Collections.unmodifiableSet(treeSet);
    }
}
