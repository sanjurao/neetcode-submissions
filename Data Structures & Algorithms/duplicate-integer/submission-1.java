class Solution {
    public boolean hasDuplicate(int[] nums) {        

        HashSet<Integer> uni = new HashSet<>();
        for(Integer num : nums) {
            if(!uni.add(num)) {                
                return true;
            }
        }
        return false;            
    }
}