class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        map<int,int> map;
        vector<int> res;
        for(int i=0;i<nums.size();i++){
            //check compliment of current int in map
            if(map.find(nums[i]) != map.end()){
                res.push_back(map[nums[i]]);
                res.push_back(i);
                return res;
            }
            else{
                map[target-nums[i]]=i;
            }
        }
        return res;
    }
};