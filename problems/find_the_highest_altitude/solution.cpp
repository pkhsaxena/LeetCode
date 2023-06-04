class Solution {
public:
    int largestAltitude(vector<int>& gain) {
        int mx=0;
        int alt[gain.size()+1];
        alt[0]=0;
        for(int i=0;i<gain.size();i++){
            alt[i+1]=alt[i] + gain[i];
            mx = max(alt[i+1],mx);
        }
        return mx;
    }
};