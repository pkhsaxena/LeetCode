class Solution {
    public int[] getAverages(int[] nums, int k) {
		int[] res = new int[nums.length];
        Arrays.fill(res,-1);
        if (k*2+1>nums.length) {
			return res;
		}
		long sum = 0;
		for (int i = 0; i < k * 2 + 1 && i < nums.length; i++) {
			sum += nums[i];
		}
		int n = k * 2 + 1;
		int idx = k;

		res[idx++]=(int) (sum / n);
		for (int i = k * 2 + 1; i < nums.length; i++) {
			sum += nums[i] - nums[i - (k * 2 + 1)];
			res[idx++]=(int) (sum / n);
		}
		return res;
    }
}