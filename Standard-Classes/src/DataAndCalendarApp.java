import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class DataAndCalendarApp {
    public static void main(String[] args) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();

//        calendar.set(calendar.getTime());

//        System.out.println(("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa").length());
        UUID test = UUID.fromString("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        UUID test2 = UUID.fromString("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab");

        System.out.println(test + " " + test2);
    }
}
