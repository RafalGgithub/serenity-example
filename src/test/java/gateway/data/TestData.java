package gateway.data;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestData {
    public static String getData_String() {
        return data_String;
    }

    public static void setData_String(String data_String) {
        TestData.data_String = data_String;
    }

    public String getCurrent_Date() {
        return current_Date;
    }

    public void setCurrent_Date(String current_Date) {
        this.current_Date = current_Date;
    }

    public static boolean isFlag() {
        return flag;
    }

    public static void setFlag(boolean flag) {
        TestData.flag = flag;
    }

    public static int getSome_int() {
        return some_int;
    }

    public void setSome_int(int some_int) {
        TestData.some_int = some_int;
    }

    private static String data_String = "Blablabla";
    private String current_Date = formatter.format(LocalDateTime.now());
    private static boolean flag;
    private static int some_int;
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");

}
