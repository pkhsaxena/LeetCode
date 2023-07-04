class Solution {
    public static int singleNumber(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
		Arrays.sort(nums);
		// Arrays.stream(nums).forEach(System.out::println);
		// System.out.println();
		int prev = Integer.MIN_VALUE;
		int current, next;
		for (int i = 0; i < nums.length; i++) {
			current = nums[i];
			if (i == 0) {
				next = nums[i + 1];
				if (current != next) {
					return current;
				}
			} else if (i == nums.length - 1) {
				if (prev != current) {
					return current;
				}
			} else {
				next = nums[i + 1];
				if (prev != current && current != next) {
					return current;
				}
			}
			prev = current;
		}
		return 0;
	}
}