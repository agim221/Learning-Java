import java.util.Base64;

public class Base64App {
    public static void main(String[] args) {
        String name = "Muhamad Agim";

        String encode = Base64.getEncoder().encodeToString(name.getBytes());
        byte[] decode = Base64.getDecoder().decode(encode.getBytes());
        System.out.println(new String(decode));
    }
}
