class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> numsSet = new HashSet<Integer>();

        for(int i:  nums){
            numsSet.add(i);
        }

        if(nums.length != numsSet.size()){
            return true;
        }

        return false;

        
    }
}