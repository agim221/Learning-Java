import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class JavaInCollection {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
//        Map<String, String> map = new HashMap<>();
//        map.forEach(new BiConsumer<String, String>() {
//            @Override
//            public void accept(String s, String s2) {
//
//            }
//        });


        stringList.addAll(List.of("Muhamad", "Agim", "Spring", "Boot"));

//        for (var string : stringList) {
//            System.out.println(string);
//        }
//        stringList.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

//        stringList.removeIf(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.length() > 4;
//            }
//        });

        stringList.removeIf((name) -> name.length() > 4);

//        Optional<String>

//        stringList.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

        stringList.forEach(System.out::println);


    }
}
