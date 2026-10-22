class Solution {
    public String interpret(String command) {
        int x; String s = "";
        for(x = 0; x < command.length();)
        {
            if(command.charAt(x) == 'G')
            {
                s += "G";
                x++;
            }
            else if(command.charAt(x) == '(' && command.charAt(x + 1) == ')') 
            {
                s += "o";
                x += 2;
            }
            else
            {
                s += "al";
                x +=  4;
            }
        }
        return s;
    }
}