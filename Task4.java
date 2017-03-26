package codility;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by DmytroBartoshchuk on 26.03.2017.
 *
 * Task4. PermCheck
 *
 *  A non-empty zero-indexed array A consisting of N integers is given.
 * A permutation is a sequence containing each element from 1 to N once, and only once.
 * The goal is to check whether array A is a permutation.
 *  Write a function:
 * class Solution { public int solution(int[] A); }
 * that, given a zero-indexed array A, returns 1 if array A is a permutation and 0 if it is not.
 *  Assume that:
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [1..1,000,000,000].
 *  Complexity:
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 * Elements of input arrays can be modified.
 */
public class Task4 {
    public static void main(String[] args) {
        int[] A = new int[]{4, 1, 3, 2};
        System.out.println(solution(A));
    }

    private static int solution(int[] A) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i<A.length; i++ ){
            if (A[i]<=A.length){
                set.add(A[i]);
            }
        }

        if (set.size()==A.length){
            return 1;
        } else {
            return 0;
        }
    }
}
