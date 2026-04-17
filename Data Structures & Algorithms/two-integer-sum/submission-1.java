class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> val = new HashMap<>();
        for(int i=0; i< nums.length ; i++){
            val.put(nums[i],i);
        }

        for(int i=0; i < nums.length; i++){
            if(val.containsKey(target-nums[i]) && val.get(target-nums[i]) != i){
                return new int[]{i,val.get(target-nums[i])};
                
            }
        }

        return new int[0];

    }
}
