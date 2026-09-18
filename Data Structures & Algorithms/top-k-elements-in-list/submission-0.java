class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

    for(int i:nums){
        map.put(i,map.getOrDefault(i,0)+1);
    }

    Queue<Integer> q = new PriorityQueue<Integer>((n1,n2)->map.get(n1) - map.get(n2));

    for(int i:map.keySet()){
        q.add(i);
        if(q.size()>k){
            q.poll();
        }
    }
     int[] result = new int[k];
     for(int i=0; i<k; i++){
        result[i] = q.poll();
    }

    return result;
}
}
