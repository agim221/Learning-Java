import java.util.*;

public class PriorityListTest {
    public static void main(String[] args) {
        Deque<String> datas = new ArrayDeque<String>();

        datas.offer("Spring");
        datas.offer("Boot");
        datas.offer("Test");
        datas.add("Agim");

        for(var data = datas.poll(); data != null ; data = datas.poll()) {
            System.out.println(data);
        }
    }
}
