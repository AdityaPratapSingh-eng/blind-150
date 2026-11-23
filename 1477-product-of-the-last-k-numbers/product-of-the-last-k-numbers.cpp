class ProductOfNumbers {
public:
        vector<int>arr;
    ProductOfNumbers() {
          arr.resize(0);
    }
    
    void add(int num) {
       arr.push_back(num);
    }
    
    int getProduct(int k) {
        int pro=1;
        int idx= arr.size()-1;
           while(k--){
              pro*=  arr[idx--];
           }

           return pro;
    }
};

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers* obj = new ProductOfNumbers();
 * obj->add(num);
 * int param_2 = obj->getProduct(k);
 */