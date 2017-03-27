package codility;

/**
 * Created by DmytroBartoshchuk on 26.03.2017.
 *
 * Task6. PassingCars
 *
 *  A non-empty zero-indexed array A consisting of N integers is given. The consecutive elements of array A represent
 * consecutive cars on a road.
 *  Array A contains only 0s and/or 1s:
 * 0 represents a car traveling east,
 * 1 represents a car traveling west.
 * The goal is to count passing cars. We say that a pair of cars (P, Q), where 0 ≤ P < Q < N,
 * is passing when P is traveling to the east and Q is traveling to the west.
 *  Write a function:
 * class Solution { public int solution(int[] A); }
 * that, given a non-empty zero-indexed array A of N integers, returns the number of pairs of passing cars.
 * The function should return −1 if the number of pairs of passing cars exceeds 1,000,000,000.
 *  Assume that:
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer that can have one of the following values: 0, 1.
 *  Complexity:
 *  expected worst-case time complexity is O(N);
 *  expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
 *  Elements of input arrays can be modified.
 */
public class Task6 {
    public static void main(String[] args) {
        int[] A = new int[]{0, 1, 0, 1, 1};
        System.out.println(solution(A));
    }

    private static int solution(int[] A) {
        int pairs = 0;
        int J = 0;

        for(int i = 0; i<A.length; i++){
            if(A[i] == 1){
                J++;
            }
        }

        for(int i = 0; i<A.length; i++){
            if(A[i]==0){
                pairs += J;
            } else {
                J = J-1;
            }
            if(pairs>1000000000){
                return -1;
            }
        }

        return pairs;
    }
}
