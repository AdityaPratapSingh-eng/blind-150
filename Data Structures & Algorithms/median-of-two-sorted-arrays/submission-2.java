class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int n1=nums1.length;
            int n2= nums2.length;

                int n= n1+ n2;
            int sum=0;
             int []arr= new int[n];
         
          int i=0;
          int j=0; 
          int k=0;

          while(i<n1 && j<n2){
               if(nums1[i]<= nums2[j]){
                   arr[k]= nums1[i];
                   i++;
               }
               else{
                    arr[k]= nums2[j];
                   j++;
               }

               k++;
          }

          while(i<n1){
                arr[k]= nums1[i];
                i++;
                k++;
          }

           while(j<n2){
                arr[k]= nums2[j];
                j++;
                k++;
          }
              
              if(n%2==0){
                  int e2= arr[n/2];
                  int e1= arr[(n/2) -1];
                  return (double)(e1+e2)/2;
              }
              else
              {
                return arr[n/2];
              }
          
    }
}
