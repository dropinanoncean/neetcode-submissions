class MedianFinder {
    Queue<Integer> sq;
    Queue<Integer> lq;

    public MedianFinder() {
        this.sq = new PriorityQueue<>((a,b) -> b - a);
        this.lq = new PriorityQueue<>((a,b) -> a - b);
    }
    
    public void addNum(int num) {
        sq.add(num);
        if((sq.size() - lq.size()>1) || !lq.isEmpty()
        && sq.peek() > lq.peek()){
            lq.add(sq.poll());
        }

        if(lq.size() - sq.size() > 1){
            sq.add(lq.poll());
        }
    }
    
    public double findMedian() {
        if(lq.size() == sq.size()){
            return (double) (lq.peek() + sq.peek())/2;
        }else if(sq.size() > lq.size()){
            return (double) sq.peek();
        } else {
            return (double) lq.peek();
        }
    }
}
