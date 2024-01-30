import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(" ", "<", ">");

        joiner.add("Muhamad");
        joiner.add("Agim");

        System.out.println(joiner.toString());
    }
}
