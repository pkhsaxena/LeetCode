class Solution {
public:
    int longestOnes(vector<int>& nums, int k) {
        int count =0;
        int left=0, right=0;
        int mx = INT_MIN;
        for(;right<nums.size();right++){
            if(nums[right]==0){
                count++;
            }
            while(count>k){
                if(nums[left]==0){
                    count--;
                }
                left++;
            }
            mx = max(mx, right-left+1);
        }
        return mx;
    }
};