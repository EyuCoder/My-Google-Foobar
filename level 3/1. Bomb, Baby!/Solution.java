import java.math.BigInteger;
public class Solution{
    static private boolean isPossible;
        public static BigInteger cycles(BigInteger a, BigInteger b) {
            if (b.compareTo(BigInteger.valueOf(0)) == 0) return a;
            else if (a.mod(b) == BigInteger.valueOf(0) && b.compareTo(BigInteger.valueOf(1)) > 0) isPossible = false;
            return a.divide(b).add(cycles(b, a.mod(b)));
        }
        public static String solution(String M, String F) {
            BigInteger m = new BigInteger(M);
            BigInteger f = new BigInteger(F);
            isPossible = true;
            BigInteger res = cycles(m, f).subtract(BigInteger.valueOf(2));
            if (!isPossible) return "impossible";
            else return res.toString();
        }

    public static void main(String[] args) {
        System.out.println(solution("2", "1"));//1
        System.out.println(solution("4", "7"));//4
    }
}
