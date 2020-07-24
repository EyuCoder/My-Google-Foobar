import java.util.ArrayList;
import java.util.Collections;
public class Solution {
    public static String solution(int[] xs) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        int negLen = 0;
        int res =1;

        for (int i : xs) {
            if (i != 0){
                if (i < 0){
                    neg.add(i);
                }else {
                    pos.add(i);
                }
            }
        }

        for (int j : pos) res*=j;
        if (neg.size()==0) return String.valueOf(res);
        else {
            Collections.sort(neg);
            negLen = neg.size()%2;
            if (negLen==1) neg.remove(neg.size()-1);
            for (int k : neg) res*=k;
            return String.valueOf(res);
        }
    }
    public static void main(String[] args) {
        System.out.println((PowerH.PowerH(new int[]{2, 0, 2, 2, 0})));//8
        System.out.println((PowerH.PowerH(new int[]{-2, -3, 4, -5})));//60
    }
}