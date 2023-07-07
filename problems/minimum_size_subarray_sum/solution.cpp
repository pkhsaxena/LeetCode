class Solution {
public:
     int minSubArrayLen(int target, vector<int>& nums) {
        int len = nums.size();
        if(len==1){
            return target==nums[0];
        }
        int sum =nums[0];
        int mn =INT_MAX;
        int left =0;
        int right =0;
        while(right<nums.size()){
            // debug(sum);
            // debug(left);
            // debug(right);
            if(sum>=target){
                mn = min(mn, right-left+1);
                sum-=nums[left];
                left++;
                // debug(right-left+1);
            }
            else if(sum<target){
                right++;
                if(right<len)
                    sum+=nums[right];
            }
            cerr<<endl;
        }
        return mn==INT_MAX?0:mn;
    }
};