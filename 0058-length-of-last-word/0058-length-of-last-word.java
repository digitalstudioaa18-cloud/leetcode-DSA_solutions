class Solution {
    public int lengthOfLastWord(String s) {
        s = s.strip();
        int i = s.lastIndexOf(" ");
        String lw = s.substring(i + 1);
        return lw.length();
    }
}