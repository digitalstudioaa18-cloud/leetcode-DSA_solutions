import java.util.StringTokenizer;
class Solution {
    public String reverseWords(String s) {
        StringTokenizer str = new StringTokenizer(s);
        StringBuilder res = new StringBuilder();
        int x = 0;
        while(str.hasMoreTokens())
        {
            StringBuilder rev = new StringBuilder(str.nextToken());
            res.append(rev.reverse());
            if(str.hasMoreTokens())
            res.append(" ");
        }
        return res.toString();
    }
}