class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        char[]  s_array = s.toCharArray();
        char[]  t_array = t.toCharArray();
        HashMap<Character,Integer> s_count = new HashMap<>();
        HashMap<Character,Integer> t_count = new HashMap<>();

        for(int i=0;i<s.length();i++) {
            s_count.put(s_array[i], s_count.getOrDefault(s_array[i], 0) + 1);
            t_count.put(t_array[i], t_count.getOrDefault(t_array[i], 0) + 1);
        }
        return s_count.equals(t_count);
    }
}


