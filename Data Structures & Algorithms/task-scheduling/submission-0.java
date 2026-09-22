class Solution {
    public int leastInterval(char[] tasks, int n) {
     
           int[]arr= new int[26];
           
           for(int t: tasks){
               arr[t-'A']++;
           }
            Arrays.sort(arr);
            int gap= arr[25]-1;
            int idle= gap*n;

            for(int i=24; i>=0; i--){
                 idle-= Math.min(gap, arr[i]);
            }


            if(idle >0){
                return tasks.length  + idle;
            }

            else{
                return tasks.length;
            }
           
    }
}
