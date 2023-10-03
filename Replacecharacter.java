public class Replacecharacter {
    public static void main(String[] args) {
        String str1 = "apples";
        char ch1 = 'a';
        char ch2 = 'p';
        String tempch = "#";
        String replacestr = str1.replace(ch1,tempch.charAt(0));

        replacestr = replacestr.replace(ch2,ch1);

        replacestr = replacestr.replace(tempch.charAt(0),ch2);
        System.out.println(replacestr);
    }
}
