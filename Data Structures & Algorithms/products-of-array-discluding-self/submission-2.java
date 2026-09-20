class Solution {
    public int[] productExceptSelf(int[] nums) {

        int product = 1;
        int zeroCount = 0;
        for(int i: nums) {
            if(i==0){
                zeroCount++;
                continue;
            } else {
                product *= i;
            }
        }
        int[] res = new int[nums.length];
        if(zeroCount>1){
            return res;
        }
        for(int i = 0; i < nums.length; i++){
            if(zeroCount > 0 && nums[i]==0){
                res[i] = product;
            } else if(zeroCount > 0 && nums[i]!=0){
                res[i] = 0;
            } else {
                res[i] = product/nums[i];
            }
            
        }
        return res;
    }
}  
