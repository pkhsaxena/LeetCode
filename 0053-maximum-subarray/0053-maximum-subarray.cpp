class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int mx=INT_MIN;
        int run=0;
        for(int i=0;i<nums.size();i++){
            run+=nums[i];
            if(run>mx){
                mx=run;
            }
            if(run<0){
                run=0;
            }
        }
        return mx;
    }
};