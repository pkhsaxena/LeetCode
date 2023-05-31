class Solution {
public:
    void moveZeroes(vector<int>& nums) {
	int w0 = -1;
	int i = 0;
	int len = nums.size();
	while (i < len && w0 < len) {
		// debug(i);
		// debug(w0);
		if (w0 == -1 && nums[i] == 0) {
			w0 = i;
			i++;
		} else if (w0 != -1 && nums[i] != 0) {
			swap(nums[i], nums[w0]);
			// debug(nums);
			// debug("swap");
			// debug(i);
			// debug(w0);
			while (nums[w0] != 0) {w0++;}
			i++;
			// debug(w0);
		} else {
			i++;
		}
	}
}
};