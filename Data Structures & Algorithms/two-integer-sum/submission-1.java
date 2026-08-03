class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> ht = new HashMap<>();
        int[] ans = new int[2];
        for(int i = 0; i < nums.length; i++){
            if(ht.containsKey(nums[i])){
                ans[0] = ht.get(nums[i]);
                ans[1] = i;
                return ans;
            }
            ht.put(target-nums[i],i);
        }
        return ans;
    }
}
