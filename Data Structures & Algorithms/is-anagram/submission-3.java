class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();
        if (sarr.length != tarr.length){
            return false;
        }
        Map<Character, Integer> smap = new HashMap<>();
        Map<Character, Integer> tmap = new HashMap<>();

        for (char c : sarr) {
            int val = smap.getOrDefault(c,0);
            smap.put(c, val + 1);
        }

        for (char c : tarr) {
            int val = tmap.getOrDefault(c,0);
            tmap.put(c, val + 1);
        }
        return smap.equals(tmap);

    }
}
