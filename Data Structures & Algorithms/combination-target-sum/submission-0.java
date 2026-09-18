class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        backTrack(nums, target, result, new ArrayList<Integer>(), 0);
        return result;
        
    }

    private void backTrack(int[] nums, int target, List<List<Integer>> result, 
    List<Integer> curr, int ind){
        if(target == 0){
            result.add(new ArrayList<Integer>(curr));
            return;
        } else if( target < 0){
            return;
        }

        for(int i = ind; i < nums.length; i++){
            curr.add(nums[i]);
            backTrack(nums, target - nums[i], result, curr, i);
            curr.remove(curr.size()-1);
        }

    }
}
