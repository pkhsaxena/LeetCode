class Solution {
public:
    bool increasingTriplet(vector<int>& nums) {
        int i,j,k;
        i=j=k=INT_MAX;
        for(int c: nums) {
            if(c<=i)
                i=c;
            else if(c<=j)
                j=c;
            else {
                return true;
            }
        }
        return false;
    }
};