class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0 || strs == null)
        return "";
        Arrays.sort(strs);
        String f = strs[0], l = strs[strs.length - 1];
        int x = 0;
        while(x < f.length() && x < l.length() && f.charAt(x) == l.charAt(x))
        x++;
        return f.substring(0, x);  
    }
}