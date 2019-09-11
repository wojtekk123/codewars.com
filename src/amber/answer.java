package amber;

import java.lang.*;

public class answer {

    public static void main(String[] args) {

        System.out.println("yout gapp is : " + solution(274) );

    }

    private static int solution (int intValue ){

        String binaryString = Integer.toBinaryString(intValue);
        System.out.println("czy oby na pewno " + binaryString);
         int zeroHits = 0;
         int longest = 0;
         for (int i = 0; i  < binaryString.length();i++) {

             if ( binaryString.substring(i,i+1).equals("1")){
                 if ( zeroHits>longest){
                     longest=zeroHits;

                 }
                 zeroHits=0;


             }else {
                 zeroHits++;
             }


         }

        return longest;

    }


}