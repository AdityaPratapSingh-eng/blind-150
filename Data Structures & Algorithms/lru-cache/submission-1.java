class LRUCache {
       class Node{
           int key;
           int value;

           Node prev;
           Node next;

           Node(int key, int value){
            this.key= key;
            this.value= value;
           }
       }

       int c;
       Map<Integer, Node>mp;
       Node head;
       Node tail;
    public LRUCache(int capacity) {
          mp = new HashMap<>();
          c= capacity;

          head= new Node(0 ,0);
          tail = new Node(0,0);

          head.next= tail;
          tail.prev= head;
    }  
      
      public void addNode(Node node){
            node.next= head.next;
            node.prev= head;
            head.next.prev = node;
            head.next = node;

      }

      public void removeNode(Node node) { 
        Node previous = node.prev; 
        Node next = node.next;
         previous.next = next; 
         next.prev = previous;
         
          }


          public void moveToFront(Node node) {
             removeNode(node);
              addNode(node);
               }
    
    public int get(int key) {
           if (!mp.containsKey(key)) { 
            return -1; 
            } 
           Node node = mp.get(key); 
           moveToFront(node);
            return node.value;
    }
    
    public void put(int key, int value) {
             if(mp.containsKey(key)){
                 
                 Node node= mp.get(key);
                  node.value= value;
                moveToFront(node);

                return;

             }

             else{
                Node newNode= new Node(key, value);
                  mp.put(key, newNode);

                  addNode(newNode);
             }

             if(mp.size() > c){
                 Node lru= tail.prev;
                  removeNode(lru);

                   mp.remove(lru.key);
             }
    }
}
