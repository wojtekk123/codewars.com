package others;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by wojtek on 08.07.2019.
 */
public class SortingOtherSolution {


    public static int[] sortOdd(int[] array) {

        int[] tab = Arrays.stream(array).filter(value -> value % 2 == 1).sorted().toArray();

        for (int j = 0, s = 0; j < array.length; j++) {
            if(array[j]%2==1)array[j]=tab[s++];

        }

return array;
    }
}
