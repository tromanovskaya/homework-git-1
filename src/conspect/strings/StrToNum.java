package conspect.strings;

public class StrToNum {
    public static void main(String[] args) {
        String strInt = "123";
        String strDouble = "123.24";
        int x;
        double y;
        double z;
        x = Integer.parseInt(strInt);
        y = Double.parseDouble(strDouble);
        System.out.println(x + y);
        strInt = String.valueOf(x + 1);
        strDouble = String.valueOf(y + 1);
        System.out.println("strInt=" + strInt);
        System.out.println("strDouble=" + strDouble);
        String str;
        str = "num=" + 345;
        System.out.println(str);
    }
}
