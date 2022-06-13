import java.util.*;

/**
 * https://www.interviewbit.com/problems/path-in-matrix/
 * O(m.n) time | O(m.n) space - where m and n are the number of rows and cols of matrix respectively
 */
public class PathInMatrix {
    public int checkPath(ArrayList<ArrayList<Integer>> A) {
        if (A == null || A.size() == 0)
            return 0;

        boolean[][] visited = new boolean[A.size()][A.get(0).size()];
        for (int i = 0; i < A.size(); i++) {
            for (int j = 0; j < A.get(i).size(); j++) {
                if (A.get(i).get(j) == 1)
                    return dfs(A, i, j, visited);
            }
        }

        return 0;
    }

    int dfs(ArrayList<ArrayList<Integer>> A, int i, int j, boolean[][] visited) {
        if (i < 0 || j < 0 || i >= A.size() || j >= A.get(i).size() || A.get(i).get(j) == 0 || visited[i][j])
            return 0;

        if (A.get(i).get(j) == 2)
            return 1;
        visited[i][j] = true;
        return dfs(A, i + 1, j, visited) == 1 ||
                dfs(A, i, j + 1, visited) == 1 ||
                dfs(A, i - 1, j, visited) == 1 ||
                dfs(A, i, j - 1, visited) == 1 ? 1 : 0;
    }
}
