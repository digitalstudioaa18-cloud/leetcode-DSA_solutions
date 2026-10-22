class Solution {
    public String restoreString(String s, int[] indices) {
        char[] c = new char[s.length()];
        for(int x = 0; x < s.length(); x++)
        {
            c[indices[x]] = s.charAt(x);
        }
        return new String(c);
    }
}