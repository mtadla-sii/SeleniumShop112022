package helper;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHelper {
    public static String getDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("MM_dd_HH_mm_ss");
        Date date = new Date(System.currentTimeMillis());
        return formatter.format(date);
    }
}
