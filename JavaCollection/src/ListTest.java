import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> datas = new ArrayList<String>();
        datas.add("Test");
        datas.addLast("Boot");
        datas.add(1, "Spring");

        for (var data : datas) {
            System.out.println(data);
        }

        List<String> linkList = new LinkedList<String>();
        linkList.addFirst("Agim");
        linkList.addLast("Spring");
        linkList.add(1, "menah");

        for(var list : linkList) {
            System.out.println(list);
        }
    }
}
