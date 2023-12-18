package csen703.main.assignment1;

/**
 * Write your info here
 * 
 * @Team 130
 * @name mohamed yassser mohamed abdelwahed
 * @id 52-12326
 * @TutorialNumber T-14 
 */

public class TheBadBatch {

	public static boolean TatooineToNabooDivideAndConquer(int[] fuel) {
		return canJumpRecursive(0, fuel.length - 1, fuel);
	}

	private static boolean canJumpRecursive(int start, int end, int[] nums) {
		if (start == end) {
			return true; // Base case: reached the last element
		}

		int maxJump = Math.min(start + nums[start], end);
		for (int nextPosition = start + 1; nextPosition <= maxJump; nextPosition++) {
			if (canJumpRecursive(nextPosition, end, nums)) {
				return true;
			}
		}

		return false;
	}

	public static boolean TatooineToNabooGreedy(int[] fuel) {
		int maxReach = 0;

		for (int i = 0; i < fuel.length; i++) {
			if (i > maxReach) {
				return false; // Cannot reach the current position
			}

			maxReach = Math.max(maxReach, i + fuel[i]);

			if (maxReach >= fuel.length - 1) {
				return true; // Reached the last element
			}
		}

		return false;
	}

	public static void main(String[] args) {
		int[] fuel1 = { 2, 3, 1, 1, 4 };
		System.out.println("fuel=[2,3,1,1,4] ,Output(Divide And Conquer): " + TatooineToNabooDivideAndConquer(fuel1));
		System.out.println("fuel=[2,3,1,1,4] ,Output(Greedy): " + TatooineToNabooGreedy(fuel1));
		int[] fuel2 = { 3, 2, 1, 0, 4 };
		System.out.println("fuel=[3,2,1,0,4] ,Output(Divide And Conquer): " + TatooineToNabooDivideAndConquer(fuel2));
		System.out.println("fuel=[3,2,1,0,4] ,Output(Greedy): " + TatooineToNabooGreedy(fuel2));

	}

}
