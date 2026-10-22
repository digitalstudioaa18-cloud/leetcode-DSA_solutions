import java.util.StringTokenizer;
class Solution {
    public String sortSentence(String s) {
        StringTokenizer str = new StringTokenizer(s);
        int totalWords = str.countTokens();
        String[] result = new String[totalWords];
        while (str.hasMoreTokens()) {
            String word = str.nextToken();
            int len = word.length();
            int pos = (word.charAt(len - 1) - '0') - 1;
            result[pos] = word.substring(0, len - 1);
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < totalWords; i++) {
            ans.append(result[i]);
            if (i < totalWords - 1) {
                ans.append(" ");
            }
        }
        return ans.toString();
    }
}
        