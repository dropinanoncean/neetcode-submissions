class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n==0) return 0;
        
        Set<Character> w = new HashSet<>();
        int l = 0, max = 0;
        for(int r=0; r<n;r++){
            while(w.contains(s.charAt(r))){
                w.remove(s.charAt(l));
                l++;
            }
            w.add(s.charAt(r));
            max = Math.max(max, r-l+1);
            
        }
        return max;
    }
}
