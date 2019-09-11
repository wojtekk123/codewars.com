package amber;

import java.math.BigInteger;

public class lesson2{
   static  public int solution(int A, int B) {
        BigInteger C = (new BigInteger(String.valueOf(A)))
                .multiply(new BigInteger(String.valueOf(B)));

        String binaryC = C.toString(2);

        int res = 0;
        int len = binaryC.length();
        for (int i=0; i<len; i++) {
            if (binaryC.charAt(i) == '1') {
                res++;
            }
        }


        return res;
    }


    public static void main(String []args){


        System.out.println(solution(545646456, 456456464));
    }
}