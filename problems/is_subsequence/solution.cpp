class Solution {
public:
    bool isSubsequence(string s, string t) {
        int si=0,ti=0;
        int matched = 0;
        int slen = s.size(), tlen = t.size();
        for(;si<slen && ti<tlen;){
            if(s[si]==t[ti]){
                si++;
                ti++;
                matched++;
                if(matched == slen) return true;
            } else{
                ti++;
            }
        }
        if(matched == slen) return true;
        return false;
    }
};