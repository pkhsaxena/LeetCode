template <typename T> // cout << vector<T>
ostream& operator<<(ostream& ostream, const vector<T>& c)
{
    for (const auto& it : c)
        cout << it << " ";
    return ostream;
}
class Solution {
public:
    bool canPlaceFlowers(vector<int>& fb, int n) {
        for(int i=0;i<n;i++){
            bool planted = false;
            for(int j=0;j<fb.size();j++){
                if(fb[j] == 0){
                    //corner beds
                    if((j==0 && ((j+1 <fb.size() && fb[j+1]==0) || fb.size()==1)) || (j==fb.size()-1 && j-1>=0 && fb[j-1]==0)) {
                        planted = true;
                        fb[j]=1;
                        break;
                    }
                    if(j-1>=0 && fb[j-1]==0 && j+1<fb.size() && fb[j+1]==0){
                        planted = true;
                        fb[j]=1;
                        break;
                    }
                }
            }
            // cout<<fb<<endl;
            if(!planted){
                return false;
            }
        }
        return true;
    }
};