class Solution {
public:
    string maxSumOfSquares(int num, int sum) {
           int rem= sum%9;
           int nine= sum/9;

           if(num *9  < sum)return "";

           string res(nine, '9');

           if(rem>0 ) res.push_back(rem + '0');  

           res.append(num- res.size(), '0');


           return res;

    }
};