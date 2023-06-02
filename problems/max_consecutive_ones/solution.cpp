class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int count=0;
        int mx =0;
        for(auto i:nums){
            if(i){
                count++;
            } else{
                count=0;
            }
            mx=max(mx,count);
        }
        return mx;
    }
};