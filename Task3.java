package codility;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by DmytroBartoshchuk on 25.03.2017.
 *
 * Task3. FrogRiverOne
 *
 *  A small frog wants to get to the other side of a river. The frog is initially located on one bank of
 * the river (position 0) and wants to get to the opposite bank (position X+1). Leaves fall from a tree
 * onto the surface of the river.
 *  You are given a zero-indexed array A consisting of N integers representing the falling leaves.
 * A[K] represents the position where one leaf falls at time K, measured in seconds.
 *  The goal is to find the earliest time when the frog can jump to the other side of the river.
 * The frog can cross only when leaves appear at every position across the river from 1 to X
 * (that is, we want to find the earliest moment when all the positions from 1 to X are covered by leaves).
 * You may assume that the speed of the current in the river is negligibly small, i.e. the leaves do not change
 * their positions once they fall in the river.
 *  Write a function:
 *  class Solution { public int solution(int X, int[] A); }
 *  that, given a non-empty zero-indexed array A consisting of N integers and integer X, returns
 *  the earliest time when the frog can jump to the other side of the river.
 *  If the frog is never able to jump to the other side of the river, the function should return −1.
 *      Assume that:
 *  N and X are integers within the range [1..100,000];
 *  each element of array A is an integer within the range [1..X].
 *      Complexity:
 *  expected worst-case time complexity is O(N);
 *  expected worst-case space complexity is O(X), beyond input storage (not counting the storage required for input arguments).
 *  Elements of input arrays can be modified.
 */
public class Task3 {
    public static void main(String[] args) {
        int[] A = new int[]{1, 3, 1, 4, 2, 3, 5, 4};
        System.out.println(solution(5, A));
    }

    public static int solution(int X, int[] A) {

        Set<Integer> set = new HashSet<>();
        int res = 0;

        for (int i=0; i<A.length; i++){

            if(A[i]<=X){
                set.add(A[i]);
            }

            if(set.size()==X){
                res = i;
                break;
            }
            else {
                res = -1;
            }
        }

        return res;
    }
}
