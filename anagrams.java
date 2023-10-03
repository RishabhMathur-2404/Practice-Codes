public class anagrams {
    static boolean isAnagram(String a, String b)
    {
        String A=a.toLowerCase();
        String B=b.toLowerCase();
        if(A.length()!=B.length()) return false;
        for(int i=0;i<A.length();i++)
        {
            int countA=0;
            int countB=0;
            for(int j=0;j<A.length();j++){
                if (A.charAt(i)==A.charAt(j)) countA++;

                if (A.charAt(i)==B.charAt(j)) countB++;
            }
            if(countA==countB)  continue;
            else  return false;
        }

        return true;
    }
    public static void main(String[] args)
    {
        String a = "Listen";
        String b = "Silent";

        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "yes" : "no" );
    }
}

