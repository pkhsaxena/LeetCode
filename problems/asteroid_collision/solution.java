class Solution {
    public static int[] asteroidCollision(int[] asteroids) {
		Stack<Integer> stack = new Stack<>();
		for (int i : asteroids) {
			if (i > 0) {
				stack.push(i);
			} else {
				// when |i| > |peek|, need while loop
				while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < -i) {
					stack.pop();
				}
				if (!stack.isEmpty() && -i == stack.peek()) {
					stack.pop();
				} else if (!stack.isEmpty() && stack.peek() > -i) {

				} else {
					stack.push(i);
				}

			}
		}
		int[] res = new int[stack.size()];
		int i = 0;
		for (int s : stack) {
			res[i++] = s;
		}
		return res;
	}
}