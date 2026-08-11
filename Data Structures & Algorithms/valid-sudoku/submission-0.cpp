class Solution {
public:
    bool isValidSudoku(vector<vector<char>>& board) {
        //row check
        for(int i=0; i<9; i++){
            set<int>st;
            for(int j=0; j<9; j++){
                if(board[i][j]!='.'){
                if(!st.count(board[i][j])){
                      st.insert(board[i][j]);
                }
                
                else{
                    return false;
                }
                }
            }
           
            
        }
          //col check

          for(int i=0; i<9; i++){
            set<int>st;
            for(int j=0; j<9; j++){
                if(board[j][i]!='.'){
                if(!st.count(board[j][i])){
                      st.insert(board[j][i]);
                }
                
                else{
                    return false;
                }
                }
            }
           

            
        }

        //3*3 grid check

        for(int i=0; i<9; i+=3){
            for(int j=0; j<9; j+=3)
            {       
                   set<int>st;
                for(int r=i; r<i+3; r++){
                    for(int c=j; c<j+3; c++){
                        if(board[r][c]!='.'){
                          if(!st.count(board[r][c])){
                      st.insert(board[r][c]);
                }
                        
                else{
                    return false;
                } 
                        }
                    }
                }
              
            }
        }

        return true;

    }
};
