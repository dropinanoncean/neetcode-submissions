class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }

        int result = 1;
        int longest = 1;
        for(int i : set){
            if(!set.contains(i-1)){
                longest = 1;
                while(set.contains(i+1)){
                    longest++;
                    i = i+1;
                }
                result = Math.max(result, longest);
            }
        }
        return result;
    }
}
