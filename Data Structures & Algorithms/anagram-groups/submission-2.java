class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap();
        for(String s: strs){
            String sortedStr = sortString(s);
            if(map.containsKey(sortedStr)) {
                List<String> list = map.get(sortedStr);
                list.add(s);
                map.put(sortedStr, list);
            } else {
                map.put(sortedStr, new ArrayList(List.of(s)));
            }
        }
    
        return new ArrayList(map.values());
    }

    private String sortString(String str){
        char[] s = str.toCharArray();
        Arrays.sort(s);
        return new String(s);
    }
}
