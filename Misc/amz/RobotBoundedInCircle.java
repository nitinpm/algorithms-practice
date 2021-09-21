package Misc.amz;

/**
 * https://cybergeeksquad.co/2021/06/robot-bounded-in-circle-solution-amazon-oa.html
 * https://leetcode.com/discuss/interview-question/1043508/Amazon-or-OA-2021-or-Robot-Bounded-In-Circle
 * https://leetcode.com/problems/robot-bounded-in-circle/
 *
 * On an infinite plane, a robot initially stands at (0, 0) and faces north. The robot can receive one of three instructions:
 *
 * "G": go straight 1 unit;
 * "L": turn 90 degrees to the left;
 * "R": turn 90 degrees to the right.
 * The robot performs the instructions given in order, and repeats them forever.
 *
 * Return true if and only if there exists a circle in the plane such that the robot never leaves the circle.
 *
 *
 *
 * Example 1:
 *
 * Input: instructions = "GGLLGG"
 * Output: true
 * Explanation: The robot moves from (0,0) to (0,2), turns 180 degrees, and then returns to (0,0).
 * When repeating these instructions, the robot remains in the circle of radius 2 centered at the origin.
 * Example 2:
 *
 * Input: instructions = "GG"
 * Output: false
 * Explanation: The robot moves north indefinitely.
 * Example 3:
 *
 * Input: instructions = "GL"
 * Output: true
 * Explanation: The robot moves from (0, 0) -> (0, 1) -> (-1, 1) -> (-1, 0) -> (0, 0) -> ...
 *
 *
 *
 * public boolean isRobotBounded(String instructions) {
 *         // init position
 *         int[] pos = new int[]{0, 0};
 *
 *         // directions north, east, south, west
 *         int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
 *
 *         int face = 0;
 *         char[] ins = instructions.toCharArray();
 *
 *         for(char c: ins) {
 *             if(c == 'L') {
 *                 face = face == 0 ? 3 : face - 1;
 *             }
 *             else if(c == 'R') {
 *                 face = face == 3 ? 0 : face + 1;
 *             }
 *             else {
 *                 pos[0] = pos[0] + dirs[face][0];
 *                 pos[1] = pos[1] + dirs[face][1];
 *             }
 *         }
 *         return (face != 0 || (pos[0] == 0 &amp;&amp; pos[1] == 0));
 *     }
 */
public class RobotBoundedInCircle {
    public boolean isRobotBounded(String instructions) {

        return false;
    }
}
