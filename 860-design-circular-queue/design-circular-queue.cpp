class MyCircularQueue {
public:
       vector<int>queue;
       int front;
       int rear;
       int count;
       int capacity;
    MyCircularQueue(int k) {
         queue.resize(k);
         front=0;
         rear= -1;
         count=0;
         capacity= k;
    }
    
    bool enQueue(int value) {
        if(!isFull()){
           rear= (rear + 1)%capacity;
           queue[rear]= value;
           count++;
           return true;
        }
        return false;
    }
    
    bool deQueue() {
         if(!isEmpty()){
             front= (front+1)%capacity;
             count--;
              return true;
         }
         return false;
    }
    
    int Front() {
        if(isEmpty())return -1;
           return queue[front];
    }
    
    int Rear() {
        if(isEmpty())return -1;
         return queue[rear];
    }
    
    bool isEmpty() {
        return count==0;
    }
    
    bool isFull() {
        return  count==capacity;
    }
};

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue* obj = new MyCircularQueue(k);
 * bool param_1 = obj->enQueue(value);
 * bool param_2 = obj->deQueue();
 * int param_3 = obj->Front();
 * int param_4 = obj->Rear();
 * bool param_5 = obj->isEmpty();
 * bool param_6 = obj->isFull();
 */