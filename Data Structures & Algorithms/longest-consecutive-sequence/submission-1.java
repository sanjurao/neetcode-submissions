class Solution {
    public int longestConsecutive(int[] nums) {        
        int longest = 0;
        Set<Integer> hs = new HashSet<>();
        for(int num: nums) {
            hs.add(num);
        }

        for(int i = 0; i< nums.length; i++) {
            //not a seuqnce
            if(!hs.contains(nums[i]-1)) {
                int len = 1; 
                while(hs.contains(nums[i]+len)) {
                    len++;
                }
                longest = Math.max(longest, len);
            }

        }

        return longest;

    }
}
