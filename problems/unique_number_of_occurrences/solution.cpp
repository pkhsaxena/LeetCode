class Solution {
public:
    bool uniqueOccurrences(vector<int>& arr) {
        sort(arr.begin(), arr.end());
        set<int> set;
        int prev = arr[0];
        int count=0;
        bool inserted = false;
        // debug(arr);
        for(int i:arr){
            if(i!=prev){
                // debug(i);
                if(set.find(count) == set.end()){
                    set.insert(count);
                    inserted = true;
                    // debug(set);
                }
                else if(inserted)
                    return false;
                prev = i;
                count=0;
            }
            count++;
            // debug(count);
        }
        if(set.find(count) == set.end()){
            set.insert(count);
            // debug(set);
        } else{
            return false;
        }
        return true;
    }
};