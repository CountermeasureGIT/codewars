
//Java 11+
/*public class Maskify {
    public static String maskify(String str) {
        int hs = str.length() - 4;
        if (hs > 0) {
            return "#".repeat(hs) + str.substring(hs);
        } else {
            return str;
        }
    }
}*/

public class Maskify {
    public static String maskify(String str) {
        int hs = str.length() - 4;
        StringBuilder sb = new StringBuilder();
        if (hs > 0) {
            for (int i = 0; i < hs; i++)
                sb.append("#");
            return sb.append(str.substring(hs)).toString();
        } else {
            return str;
        }
    }
}