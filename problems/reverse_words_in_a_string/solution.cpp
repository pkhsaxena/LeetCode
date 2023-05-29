class Solution {
public:
    string reverseWords(string s) {
        int j=s.size()-1;
        string result = "";
        for(int i=s.size()-1;i>=0;i--){
            if(s[i]==' '){
                j=i;
            } else if(i==0 || s[i-1]==' '){
                if(result.size()!=0 && result[result.size()-1]!=' ')
                    result.append(" ");
                string sub = s.substr(i,j-i+1);
                result.append(sub);
                
            }
        }
        if(result[result.size()-1]!=' ')
            return result;
        return result.substr(0, result.size()-1);
    }
};