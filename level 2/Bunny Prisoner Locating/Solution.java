/// Time Complexity: O(log(res))
/// Space Complexity: O(1)
public class Solution {

    public static String solution(long x, long y) {

        long res = (x + 1) * x / 2;
        if(y == 1) return String.valueOf(res);
        else {
            res += (x * 2 + y - 2) * (y - 1) / 2;
            return String.valueOf(res);
        }
    }
    public static void main(String[] args) {
        System.out.println((solution(3, 2)).toString());//9
        System.out.println((solution(5, 10)).toString());//96
    }
}