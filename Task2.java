package codility;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by DmytroBartoshchuk on 15.03.2017.
 *
 * Task2. MissingInteger
 *
 *  Write a function:
 * class Task2 { public int solution(int[] A); }
 * that, given a non-empty zero-indexed array A of N integers, returns the minimal positive integer (greater than 0)
 * that does not occur in A.
 *  Assume that:
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
 *  Complexity:
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 *  Elements of input arrays can be modified.
 */
public class Task2 {

    public static void main(final String[] args){
        int[] A = new int[]{1, 3, 6, 4, 1, 2};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {

        Set<Integer> set = new HashSet<>();

        for(int a: A) {
            set.add(a);
        }

        int min = 1;
        while (set.contains(min)) {
                min++;
        }

        return min;
    }
}
