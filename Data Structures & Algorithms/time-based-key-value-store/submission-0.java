   
   class Pair {
    int timestamp;
    String value;

    Pair(int timestamp, String value) {
        this.timestamp = timestamp;
        this.value = value;
    }
}class TimeMap { 
HashMap<String, ArrayList<Pair>> mp;
    public TimeMap() {
           mp= new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
           mp.putIfAbsent(key, new ArrayList<>());

           mp.get(key).add(new Pair(timestamp, value));
    }
    
    public String get(String key, int timestamp) {
       if(!mp.containsKey(key)){
        return "";
       }
       ArrayList<Pair>arr= mp.get(key);

          int i=0;
           int j=arr.size()- 1;
            String ans= "";
           while(i<=j){
                  int mid= i+(j-i)/2;

                  if(arr.get(mid).timestamp<= timestamp){
                        ans=  arr.get(mid).value;
                       i= mid+1;
                  }
                  else{
                         j= mid-1;
                  }
           }

           return ans;
    }
}
