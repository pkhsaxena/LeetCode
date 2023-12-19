class Solution {
public:
   void setZeroes(vector<vector<int> >& matrix) {
        set<int> rows;
        set<int> cols;
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix[0].size(); j++) {
                if (matrix[i][j] == 0) {
                    rows.insert(i);
                    cols.insert(j);
                }
            }
        }
        set0(rows, cols, matrix);
    }

    void set0(set<int> rows, set<int> cols, vector<vector<int> >& matrix) {
        for(int i : rows) {
            for (int j = 0; j < matrix[0].size(); j++) {
                matrix[i][j] = 0;
            }
        }
        for(int j : cols) {
            for (int i = 0; i < matrix.size(); i++) {
                matrix[i][j] = 0;
            }
        }
    }
};