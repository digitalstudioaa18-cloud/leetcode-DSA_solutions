class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String rev = "";
        for(int x = 0; x < str.length(); x++)
        rev = str.charAt(x) + rev;
        if(rev.equals(str))
        return true;
        return false;
    }
}