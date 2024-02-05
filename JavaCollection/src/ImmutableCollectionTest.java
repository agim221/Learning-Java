import data.User;

import java.util.List;

public class ImmutableCollectionTest {
    public static void main(String[] args) {
        User user = new User("Agim", "jadi");

        user.addFile("Heartstone");
        user.addFile("LOR");

//        addFile(user.getFiles());  //Error

        for(var data : user.getFiles()) {
            System.out.println(data);
        }
    }

    public static void addFile(List<String> files) {
        files.add("LOL");
    }
}
