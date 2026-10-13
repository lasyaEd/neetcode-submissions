class Solution {
    HashMap<Integer, Integer> map = new HashMap<>();
    public boolean hasDuplicate(int[] nums) {
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                return true;
            } else {
                map.put(nums[i], nums[i]);
            }
        }
         return false;
    }
}