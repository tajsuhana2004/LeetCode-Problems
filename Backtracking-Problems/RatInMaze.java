/* Question 1 :Rat in a Maze

You are given a starting position for a rat which is stuck in a maze at an initial point (0, 0) (the
maze can be thought of as a 2-dimensional plane). The maze would be given in the form of a
square matrix of order N * N where the cells with value 0 represent the maze’s blocked
locations while value 1 is the open/available path that the rat can take to reach its destination.
The rat's destination is at (N - 1, N - 1).
Your task is to find all the possible paths that the rat can take to reach from source to
destination in the maze.
The possible directions that it can take to move in the maze are 'U'(up) i.e. (x, y - 1) , 'D'(down)
i.e. (x, y + 1) , 'L' (left) i.e. (x - 1, y), 'R' (right) i.e. (x + 1, y).
(This problem is similar to Grid ways.) */

import java.util.*;

public class RatInMaze {

    static void getAns(int[][] mat, int r, int c, ArrayList<String> ans, String path, boolean[][] visited) {
        int n = mat.length;

        // Base Case 1: Out of boundary - MUST BE FIRST
        if (r < 0 || c < 0 || r >= n || c >= n) {
            return;
        }
        // Base Case 2: Blocked cell
        if (mat[r][c] == 0) {
            return;
        }
        // Base Case 3: Already visited
        if (visited[r][c]) {
            return;
        }
        // Base Case 4: Reached destination
        if (r == n - 1 && c == n - 1) {
            ans.add(path);
            return;
        }

        // Mark visited
        visited[r][c] = true;

        // 4 Directions - Same as your blackboard
        getAns(mat, r + 1, c, ans, path + "D", visited); // Down
        getAns(mat, r, c - 1, ans, path + "L", visited); // Left
        getAns(mat, r, c + 1, ans, path + "R", visited); // Right
        getAns(mat, r - 1, c, ans, path + "U", visited); // Up

        // Backtrack
        visited[r][c] = false;
    }

    static ArrayList<String> findPath(int[][] mat) {
        int n = mat.length;
        ArrayList<String> ans = new ArrayList<>();
        boolean[][] visited = new boolean[n][n];
        
        if (mat[0][0] == 0) return ans;
        
        getAns(mat, 0, 0, ans, "", visited);
        return ans;
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {1, 1, 0, 0},
            {0, 1, 1, 1}
        };

        ArrayList<String> result = findPath(mat);
        System.out.println(result);
    }
}
