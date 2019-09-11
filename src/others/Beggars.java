package others;

import java.util.Arrays;

/**
 * Created by wojtek on 10.07.2019.
 */
public class Beggars {


    public static void main(String[] args) {
        int [] p = beggars(new int[]{1,2,3,4,5},4);

        for(int k:p){
            System.out.println(k);
        }
        String s =  "0";
        for (int i = 0; i < 5; i++)
        {
            s = s + i;
        }
        System.out.println(s);

        Double d = 5.3d;
        Integer i = 3;

        System.out.print(i);

    }
    public static int [] beggars (int [] values, int n) {

        int[] result;

        if (n < 1) {//return empty array
            result = new int[0];
        } else {
            result = new int[n];
            for (int i = 0; i < values.length; i++) {

                // add value to currently queued element
                result[i % n] += values[i];
                System.out.println(i%n);
            }
        }

        return result;
    }



}
