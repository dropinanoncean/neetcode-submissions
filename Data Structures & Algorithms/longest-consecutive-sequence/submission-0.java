class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i:nums){
            set.add(i);
        }
        
        int longestSeq = 0;
        for(int i: set){
            if(!set.contains(i-1)){
                int currentSeq = 1;
                int current = i;
                while(set.contains(current+1)){
                    current += 1;
                    currentSeq += 1;
                    
                }
                longestSeq = Math.max(longestSeq, currentSeq);
            }
        }
        return longestSeq;
        
    }
}
