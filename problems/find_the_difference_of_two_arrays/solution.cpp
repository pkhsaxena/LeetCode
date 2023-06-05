class Solution {
public:
    vector<vector<int>> findDifference(vector<int>& nums1, vector<int>& nums2) {
        unordered_set<int> _1, _2;
        for(int i:nums1){
            _1.insert(i);
        }
        unordered_set<int> ans2;
        for(int i:nums2){
            _2.insert(i);
            if(_1.find(i) == _1.end()){
                ans2.insert(i);
            }
        }
        unordered_set<int> ans1;
        for(int i:nums1){
            if(_2.find(i) == _2.end()){
                ans1.insert(i);
            }
        }
        vector<int> v1,v2;
        v1.reserve(ans1.size());
        for (auto it = ans1.begin(); it != ans1.end(); ) {
            v1.push_back(*it++);
        }
        v1.reserve(ans2.size());
        for (auto it = ans2.begin(); it != ans2.end(); ) {
            v2.push_back(*it++);
        }
        vector<vector<int>> ans = {v1, v2};
        return ans;
    }
};