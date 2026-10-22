class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        StringBuilder rev = new StringBuilder(str);
        if((rev.reverse().toString()).equals(str))
        return true;
        return false;
    }
}