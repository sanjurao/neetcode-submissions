class Solution {
    public int lengthOfLongestSubstring(String s) {        
        char[] inpStr =  s.toCharArray();
        int maxLength = 0;
        int l = 0;
        HashSet<Character> set =  new HashSet<>();
        for(int r=0;r<s.length();r++) {            
            while(set.contains(inpStr[r])) {
                set.remove(inpStr[l]);
                l++;
            }
            set.add(inpStr[r]);           
            maxLength = Math.max(maxLength, r-l+1);
        }       

        return maxLength;
    }
}
