import java.util.Stack;

/**
 * Created by DmytroBartoshchuk on 06.04.2017.
 *
 * Task7. Brackets
 *
 * Task description
 * A string S consisting of N characters is considered to be properly nested if any of the following conditions is true:
 * S is empty;
 * S has the form "(U)" or "[U]" or "{U}" where U is a properly nested string;
 * S has the form "VW" where V and W are properly nested strings.
 * For example, the string "{[()()]}" is properly nested but "([)()]" is not.
 * Write a function:
 * class Solution { public int solution(String S); }
 * that, given a string S consisting of N characters, returns 1 if S is properly nested and 0 otherwise.
 * For example, given S = "{[()()]}", the function should return 1 and given S = "([)()]", the function should return 0, as explained above.
 * Assume that:
 * N is an integer within the range [0..200,000];
 * string S consists only of the following characters: "(", "{", "[", "]", "}" and/or ")".
 * Complexity:
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(N) (not counting the storage required for input arguments).
 *
 * */

public class Task7 {
    public static void main(String[] args) {

        String s = "([{}]))))))";
        System.out.println(solution(s));
    }

    private static int solution(String s) {

        if(s == null || "".equals(s)){
            return 1;
        }

        if (s.length()%2 != 0){
            return 0;
        }

        Stack<Character> stack = new Stack<>();
        for(char elem: s.toCharArray()){
            switch (elem){
                case ')':
                    checkAndPop(stack, '(');
                    break;
                case ']':
                    checkAndPop(stack, '[');
                    break;
                case '}':
                    checkAndPop(stack, '{');
                    break;
                default:
                    stack.push(elem);
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }

    private static void checkAndPop(Stack<Character> stack, char c){
        if (!stack.isEmpty() && stack.peek() == c) {
            stack.pop();
        } else {
            stack.push(c);
        }
    }
}
