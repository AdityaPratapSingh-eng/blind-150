class MedianFinder {
    PriorityQueue<Integer>rightMin= new PriorityQueue<>();
    PriorityQueue<Integer>leftMax= new PriorityQueue<>(Collections.reverseOrder());
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
         if(leftMax.isEmpty() || num < leftMax.peek()){
                leftMax.add(num);
              }
              else{
               rightMin.add(num);
              }

              if((leftMax.size() - rightMin.size()) >1){
                   rightMin.add(leftMax.poll());
              }
              else if( (-leftMax.size() + rightMin.size()) >=1){
                leftMax.add(rightMin.poll());
              }
    }
    
    public double findMedian() {
             int n=leftMax.size()+ rightMin.size();

            if(n%2==0){
              return (double)(leftMax.peek()+rightMin.peek())/2;
            }

            else{
                return (leftMax.peek());
            }
    }
}
