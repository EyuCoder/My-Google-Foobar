import java.math.BigInteger;
import java.util.Arrays;
public class Solution {
    public static String solution(int[] xs) {

        if(xs.length == 1)
            return Integer.toString(xs[0]);

        int clone[] = xs.clone();
        Arrays.sort(clone);

        int negStart = 0;
        for (int i = 0; i < clone.length; i++) {
            if (clone[i] >= 0) {
                negStart = i;
                break;
            }
        }

        int zeros = 0;
        for(int i=negStart; i<clone.length; i++) {
            if(clone[i] == 0)
                zeros++;
        }

        if( (negStart + zeros) == clone.length)
            return Integer.toString(clone[negStart]);

        BigInteger maxPower = BigInteger.ONE;

        if (negStart == 0) {
            for (int i = 1; i < clone.length; i++) {
                if (clone[i] != 0) {
                    maxPower = maxPower.multiply(new BigInteger(clone[i] + ""));
                }
            }
        } else if (negStart % 2 == 0) {
            for (int i = 0; i < negStart; i++) {
                maxPower = maxPower.multiply(new BigInteger(clone[i] + ""));
            }

            for (int i = negStart; i < clone.length; i++) {
                if (clone[i] != 0) {
                    maxPower = maxPower.multiply(new BigInteger(clone[i] + ""));
                }
            }
        } else if (negStart % 2 != 0) {

            for (int i = 0; i < negStart - 1; i++) {
                maxPower = maxPower.multiply(new BigInteger(clone[i] + ""));
            }

            for (int i = negStart; i < clone.length; i++) {
                if (clone[i] != 0) {
                    maxPower = maxPower.multiply(new BigInteger(clone[i] + ""));
                }
            }
        }
        return maxPower.toString();
    }
    public static void main(String[] args) {
        System.out.println((PowerH.PowerH(new int[]{2, 0, 2, 2, 0})));//8
        System.out.println((PowerH.PowerH(new int[]{-2, -3, 4, -5})));//60
    }
}