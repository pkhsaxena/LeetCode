class Solution {
public:
    int compress(vector<char>& chars) {
        int i=0,j=0;
        int n = chars.size();
        if(n==1) return 1;
        while(i<n){
            int count=1;
            while(i<n-1 && chars[i]==chars[i+1]){
                count++;
                i++;
            }
            chars[j++]=chars[i++];
            if(count>1){
                string s = to_string(count);
                for(char c : s){
                    chars[j++]=c;
                }
            }
        }
        // debug(chars);
        return j;
    }
};