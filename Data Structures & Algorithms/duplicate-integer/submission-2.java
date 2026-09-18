class Solution {
    public boolean hasDuplicate(int[] nums) {

        Map<Integer, Integer> map = new HashMap();
        for(int i: nums) {
            int val = map.getOrDefault(i,0);
            if (val > 0){
                return true;
            }
            map.put(i,val+1);
        }
        return false;
        
    }
}