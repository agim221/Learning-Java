import java.util.function.Consumer;

public class LambdaReffApp {
    public static void main(String[] args) {

//        Consumer<String> consumer = new Consumer<String>() {
//            @Override
//            public void accept(String name) {
//                System.out.println("Hello " + name);
//            }
//        };

//        Consumer<String> consumer = user -> System.out.println(user);

//        Consumer<String> consumer = user -> {
//            System.out.println(user);
//        };

//        Consumer<String> consumer = System.out::println;

//        Consumer<String> consumer = LambdaReffApp::helloWorld;

        LambdaReffApp lambdaReffApp = new LambdaReffApp();
        Consumer<String> consumer = lambdaReffApp::hello;

        consumer.accept("Agim");
    }

    public static void helloWorld(String name) {
        System.out.println("Hello " + name);
    }

    public void hello(String name) {
        System.out.println("Hello " + name);
    }
}
