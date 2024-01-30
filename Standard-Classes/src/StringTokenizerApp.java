import java.util.StringTokenizer;

public class StringTokenizerApp {

    public static void main(String[] args) {
        String value = "Muhamad Agim";

        StringTokenizer tokenizer = new StringTokenizer(value, " ");

        while(tokenizer.hasMoreTokens()) {
            String text = tokenizer.nextToken();
            System.out.println(text);
        }
    }
}
