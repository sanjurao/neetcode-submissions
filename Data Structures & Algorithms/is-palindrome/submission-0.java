class Solution {
    public boolean isPalindrome(String s) {
        char [] inp = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase().toCharArray();
        int left  = 0;         

        for(int i = inp.length-1; i>-1; i--) {
            System.out.println(inp[i]);
            
            if(inp[left] != inp[i]) {
                return false;
            }
            left ++;             
        }
        return true;
    }
}