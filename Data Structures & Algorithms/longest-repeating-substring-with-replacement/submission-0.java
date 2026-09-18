class Solution {
    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int max = 0, ans = 0; // curent window, max window
        int i = 0; // left index
        for(int j = 0; j< s.length(); j++){
            arr[s.charAt(j) - 'A']++;
            max = Math.max(max, arr[s.charAt(j) - 'A']);
            
            if(j - i + 1 - max > k){    // if the chars to replace(non max) are greater than K
                arr[s.charAt(i) - 'A']--;
                i++;
            }
            ans = Math.max(ans, j-i+1);
        }
        return ans;
    }
}