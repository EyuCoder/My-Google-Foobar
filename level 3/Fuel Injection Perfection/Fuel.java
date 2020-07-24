import java.math.BigInteger;

public class Fuel {
    public static int fuel(String x) {
        BigInteger n = new BigInteger(x);
        int num = 0;
        while(!n.equals(BigInteger.ONE)){
            int p = n.getLowestSetBit();
            if(p != 0){
                num += p;
                n = n.shiftRight(p);
            }
            else{
                if(n.equals(BigInteger.valueOf(3)) ||
                        n.remainder(BigInteger.valueOf(4)).equals(BigInteger.ONE)){
                    n = n.subtract(BigInteger.ONE);
                    num ++;
                }
                else{
                    n = n.add(BigInteger.ONE);
                    num ++;
                }
            }
        }
        return num;
    }

    public static void main(String[] args){

        System.out.println(fuel("15"));// 5
        System.out.println(fuel("4"));// 2
        System.out.println(fuel("3"));// 2
    }
}