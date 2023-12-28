package vn.cmcglobal.coding1;

public class h {

    public static String strJox(String s, String k) {
        String t = "";
        int b = s.length() / k.length();

        for (int i = 0; i < b; i++) {
            k += k;
        }

        for (int i = 0; i < s.length(); i++) {
            t += (char) (s.charAt(i) ^ k.charAt(i) << 1);
        }

        return t;
    }
}
