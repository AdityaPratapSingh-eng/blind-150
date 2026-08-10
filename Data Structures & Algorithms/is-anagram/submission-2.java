class Solution {
    public boolean isAnagram(String s, String t) {
        int n= s.length();
        int m= t.length();
        int []fq= new int[26];

        for(int i=0; i<n; i++){
            fq[s.charAt(i)- 'a']++;
        }

        for(int i=0; i<m; i++){
           int idx= t.charAt(i)- 'a';

           fq[idx]--;
        }
        for(int i=0; i<26; i++){
            if(fq[i]>0)return false;
    }

    return s.length()==t.length();
}
}
