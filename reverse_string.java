public class reverse_string {
    public static void main(String[] args) {
        String s = "hello";
        String rstr = "";
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            rstr = ch + rstr;
            System.out.println(rstr);
        }
    }
}
