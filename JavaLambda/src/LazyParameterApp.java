import java.util.function.Supplier;

public class LazyParameterApp {
    public static void main(String[] args) {
        login("Agim", () -> password("test"));
    }


    public static void login(String username, Supplier<String> name) {
        if(username.equals("Agim")) {
            if(name.get().equals("test")) {
                System.out.println("Success");
            }
        } else {
            System.out.println("failed");
        }
    }
    public static String password(String pass) {
        System.out.println("Getting pass");
        return pass;
    }
}
