class Solution {
    public void nextPermutation(int[] nums) {
        int breakp = Integer.MIN_VALUE;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                breakp = i;
                break;
            }
        }
        if (breakp != Integer.MIN_VALUE) {
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] > nums[breakp]) {
                    int temp = nums[i];
                    nums[i] = nums[breakp];
                    nums[breakp] = temp;
                    break;
                }
            }
            Arrays.sort(nums, breakp + 1, nums.length);
        } 
        else{
            Arrays.sort(nums);
        }
        // Arrays.stream(nums).forEach(System.out::println);

    }
}