import java.util.ArrayList;

public class Solution {
    public static int[] solution(int[] data, int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        int k = 0;

        for (int i = 0; i< data.length; i++){
            int c = 0;
            for (int j = 0; j < data.length; j++) {
                if (data[j] == data[i]) c++;
            }
            if (c <= n) arr.add(data[i]);
        }
        int[] temp = new int[arr.size()];

        for (int j : arr) {
            temp[k] = j;
            k++;
        }
        return temp;
    }
    	public static void main(String[] args) {
        	int[] var1 = new int[]{1, 2, 2, 3, 3, 3, 4, 5, 5};
        	for (int i: solution(var1, 1)) {
            	System.out.println(i);
        	}

    }
}
