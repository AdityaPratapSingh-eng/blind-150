class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>pq= new PriorityQueue<>(Collections.reverseOrder());

        for(int x: stones){
            pq.offer(x);
        }
        while(pq.size()>0){
              if(pq.size()==1)return pq.peek();
             int f= pq.poll();
             int s= pq.poll();
            if(f!=s){
                 pq.offer(f-s);
            }
        }
        return 0;
    }
}
