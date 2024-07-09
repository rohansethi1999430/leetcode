class Solution {
    public boolean containsDuplicate(int[] nums) {
       Map<Integer, Integer> mp = new HashMap<>();
        for (int i =0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                return true;
            }
            else{
                mp.put(nums[i],1);
            }
        }
        return false;
    }
}
