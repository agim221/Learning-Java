import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.put("application.name", "Muhamad Agim");
        properties.load(new FileInputStream("application.properteis"));

        properties.getProperty("application.name");
//        Arrays.sort();
    }
}
