class Solution {
public:
    string gcdOfStrings(string str1, string str2) {
        // string res = "";
        // int i=0;
        // int l1 = str1.length(), l2 = str2.length();
        // while(i<l1 && i<l2 && str1.at(i)==str2.at(i)){
        //     res.push_back(str1.at(i));
        //     i++;
        // }
        // cout<<res;
        // return res;
        if(str1+str2 != str2+str1){
            return "";
        }
        int gcd = std::gcd(str1.length(), str2.length());
        // string res = "";
        // for(int i=0;i<gcd;i++){
        //     res.push_back(str1.at(i));
        // }
        return str1.substr(0,gcd);
    }
};