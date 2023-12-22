class Solution {
public:
    bool findRotation(vector<vector<int>>& mat, vector<vector<int>>& target) {
        if(mat==target) return true;
        for(int i=0;i<4;i++){
            rotate(mat);
            if(mat==target) return true;
        }
        return false;
    }
    void rotate(vector<vector<int>>& matrix) {
        int n = matrix.size();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                swap(matrix[i][j],matrix[j][i]);
            }
        }
        for(int j=0;j<n;j++){
            reverse(matrix[j].begin(),matrix[j].end());
        }
    }
};