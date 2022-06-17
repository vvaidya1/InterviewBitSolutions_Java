/**
 * https://www.interviewbit.com/problems/min-steps-in-infinite-grid/
 * O(n) time | O(1) space - where n is the length of input arrays
 */
public class MinStepsInInfiniteGrid {
    public int coverPoints(int[] A, int[] B) {
        int prevX = A[0], prevY = B[0];
        int steps = 0;
        for (int i = 1; i < A.length; i++) {
            int deltaX = Math.abs(A[i] - prevX);
            int deltaY = Math.abs(B[i] - prevY);

            prevX = A[i];
            prevY = B[i];
            steps += Math.min(deltaX, deltaY) + Math.abs(deltaX - deltaY);
        }
        return steps;
    }
}
