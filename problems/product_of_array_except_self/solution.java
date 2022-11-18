class Solution {
    public int[] productExceptSelf(int[] nums) {
		int[] right = new int[nums.length];
		right[0] = 1;
		right[1] = nums[0];
		for (int i = 2; i < nums.length; i++) {
			right[i] = nums[i - 1] * right[i - 1];
		}
		int[] left = new int[nums.length];
		left[nums.length - 1] = 1;
		left[nums.length - 2] = nums[nums.length - 1];
		for (int i = nums.length - 3; i >= 0; i--) {
			left[i] = left[i+1] * nums[i + 1];
		}
		for(int i=0;i<nums.length;i++) {
			right[i]=right[i]*left[i];
		}
		// Arrays.stream(right).forEach(System.out::println);
		return right;
	}
}