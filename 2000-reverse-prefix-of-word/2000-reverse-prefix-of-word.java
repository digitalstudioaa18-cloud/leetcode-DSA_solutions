class Solution {
    public String reversePrefix(String word, char ch) {
        String s = "";
        char c = ' ';
        for(int x = 0; x < word.length(); x++)
        {
            if(word.indexOf(ch) < 0)
            return word;
            if(word.charAt(x) != ch)
            s = word.charAt(x) + s;
            else
            {
                s = word.charAt(x) + s + word.substring(x + 1);
                break;
            }
        }
        return s;
    }
}