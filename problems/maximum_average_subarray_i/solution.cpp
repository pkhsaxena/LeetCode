class Solution {
public:
    double findMaxAverage(vector<int>& nums, int k) {
        // double mx = INT_MIN;
        // for(int i=0;i+k<=nums.size();i++){
        //     double s =0;
        //     for(int j=i;j<i+k;j++){
        //         s+=nums[j];
        //     }
        //     mx=max(mx,s/k);
        // }
        // return mx;        
        int mx = INT_MIN;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        //initial avg
        mx = max(mx, sum);
        for(int i=1;i+k-1<nums.size();i++){
            sum+=nums[i+k-1];
            sum-=nums[i-1];
            mx=max(mx,sum);
        }
        return mx/double(k);
    }
};