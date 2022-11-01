class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int len = nums.size();
        vector<int> indices;
        unordered_map<int, int> map;
        for(int i=0;i<len;i++) {
            if(map.find(target-nums[i]) != map.end()){
                indices.push_back(i);
                indices.push_back(map[target-nums[i]]);
            } else {
                map[nums[i]]=i;
            }
            cout<<i<< " "<<nums[i]; 
        }
        return indices;
    }
};