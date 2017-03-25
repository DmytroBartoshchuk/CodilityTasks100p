package codility;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by DmytroBartoshchuk on 21.03.2017.
 *
 * Task1. OddOccurrencesInArray
 *
 *  A non-empty zero-indexed array A consisting of N integers is given. The array contains an odd number of elements,
 * and each element of the array can be paired with another element that has the same value,
 * except for one element that is left unpaired.
 *  Write a function:
 * class Task1 { public int solution(int[] A); }
 * that, given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.
 *  Assume that:
 * N is an odd integer within the range [1..1,000,000];
 * each element of array A is an integer within the range [1..1,000,000,000];
 * all but one of the values in A occur an even number of times.
 *  Complexity:
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
 *  Elements of input arrays can be modified.
 */

public class Task1 {

    public static void main(final String[] args){
        int[] A = new int[]{2,3,5,1,2,5,1,7,3};
        System.out.println(solution(A));
    }

    public static int solution(int[] A){

        Set<Integer> set = new HashSet<>();

        for (int i: A){
            if(set.contains(i)){
                set.remove(i);
            }
            else {
                set.add(i);
            }
        }

        int a = 0;

        for (int i : set){
            a=i;
        }

        return a;
    }

}
