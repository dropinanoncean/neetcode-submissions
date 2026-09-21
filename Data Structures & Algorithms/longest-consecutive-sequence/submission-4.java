class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int result = 1;
        int longest = 1;
        for(int i = 1; i<nums.length; i++){
            if(nums[i] - nums[i-1] == 1){
                longest++;
            } else if(nums[i] == nums[i-1]){
                continue;
            } else {
                result = longest>result?longest:result;
                longest = 1;
            }
        }
        result = longest>result?longest:result;
        return result;
    }
}
