package belajar.apache.maven;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Gson gson = new Gson();

        TestGson testGson = new TestGson("Muhamad Agim");

        System.out.println(gson.toJson(testGson));
    }
}
