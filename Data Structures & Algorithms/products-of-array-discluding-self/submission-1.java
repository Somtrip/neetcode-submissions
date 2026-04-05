class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int prod =1;
        int zeroCount=0;

        for(int i: nums){
            if(i != 0){
                prod *= i;
            }else{
                zeroCount++;
            }
        }

        if(zeroCount >1){
            return output;
        }

        for(int i=0; i < nums.length ; i++){
            if(zeroCount > 0){
                if(nums[i] == 0){
                    output[i] = prod;
                }else{
                    output[i] = 0;
                }
                
            }else{
               output[i] = prod/nums[i];
            }
        }

        return output;
    }
}  
