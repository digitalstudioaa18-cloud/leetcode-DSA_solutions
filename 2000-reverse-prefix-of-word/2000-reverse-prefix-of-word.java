class Solution {
    public String reversePrefix(String word, char ch) {
        String s = "";
        if(word.indexOf(ch) < 0)
            return word;
        for(int x = 0; x <= word.indexOf(ch); x++)
        {
            s = word.charAt(x) + s;
        }
        return s + word.substring(word.indexOf(ch) + 1);
    }
}