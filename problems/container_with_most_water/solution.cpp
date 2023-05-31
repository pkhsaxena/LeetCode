class Solution {
public:
    int maxArea(vector<int>& ha) {
        int i=0, j=ha.size()-1;
        int a = 0;
        while(i<j){
            int w =(j-i);
            int h = min(ha[i],ha[j]); 
            int area = h*w;
            a = max(a,area);
            if(ha[i]<ha[j])
                i++;
            else
                j--;
        }
        return a;
    }
};