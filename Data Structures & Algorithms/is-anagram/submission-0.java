class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] a = s.toCharArray();
        char[] b =t.toCharArray();
        int[] counter = new int[26];
        
        for(char c:a){
            counter[c - 'a']++;
        }
        
        for(char c:b){
            counter[c - 'a']--;
            if(counter[c - 'a']<0){
                return false;
            }
        }
        return true;
    }
}
