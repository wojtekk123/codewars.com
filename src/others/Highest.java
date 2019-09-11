package others;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by wojtek on 09.07.2019.
 */
public class Highest {

    public static void main(String[] args) {
        System.out.println(high2("what time are we climbing up to the volcano"));
    }

    public static String high(String s) {

        int temHigh = 0;
        int high = 0;
        int inedx = 0;

        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            temHigh=0;
            for (int j = 0; j < words[i].length(); j++) {
                temHigh = temHigh + ((int) (words[i].charAt(j))-96);
            }
            if (temHigh > high) {
                high = temHigh;
                inedx = i;
            }
        }
        return words[inedx].toString();
    }

    public static String high2 ( String s){

        return Arrays.stream(s.split(" ")).max(Comparator.comparingInt(
                a -> a.chars().map(i -> i - 96).sum())).get();
    }


}
