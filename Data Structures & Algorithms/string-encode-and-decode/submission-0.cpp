class Solution {
public:  
 
       vector<int>sizeArr;

    string encode(vector<string>& strs) {
         string s="";
       int n= strs.size();
         sizeArr.resize(n);
          for(int i=0; i<n; i++){
              sizeArr[i]= strs[i].size();
              
              s+= strs[i];
              }

              return s;
    }

    vector<string> decode(string s) {
           vector<string>ans;
           int prev=0;
           for(int i=0; i<sizeArr.size(); i++){
                string temp= s.substr(prev, sizeArr[i]);
                prev+= sizeArr[i];

                ans.push_back(temp);
           }

           return ans;
    }
};
