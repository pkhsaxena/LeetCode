class Solution {
    public static int maxConsecutiveAnswers(String answerKey, int k) {
		int count = 0;
		int left = 0;
		int right = 0;
		int max = Integer.MIN_VALUE;
		for (; right < answerKey.length(); right++) {
			if (answerKey.charAt(right) == 'F') {
				count++;
			}
			while (count > k) {
				if (answerKey.charAt(left) == 'F') {
					count--;
				}
				left++;
			}
			max = Math.max(max, right - left + 1);
		}
		left=right=count=0;
		for (; right < answerKey.length(); right++) {
			if (answerKey.charAt(right) == 'T') {
				count++;
			}
			while (count > k) {
				if (answerKey.charAt(left) == 'T') {
					count--;
				}
				left++;
			}
			max = Math.max(max, right - left + 1);
		}
		return max;
	}
}