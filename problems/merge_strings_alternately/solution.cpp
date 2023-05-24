class Solution {
public:
    string mergeAlternately(string word1, string word2) {
        string res = "";
	int len = min(word1.length(), word2.length());
	int i=0;
	for(i=0;i<len;i++){
		res.push_back(word1.at(i));
		res.push_back(word2.at(i));
	}
	if(word1.length() > len){
		res.append(word1.substr(i,word1.length()));
		}
	else{
		// cout<<"word2: "<<word2.substr(i,word2.length());
		res.append(word2.substr(i,word2.length()));
	}
		return res;
		}
    
};