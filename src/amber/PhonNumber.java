package amber;

import java.text.Format;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created ojtek on 05.07.2019.
 */
public class PhonNumber {

    public static void main(String[] args) {
        System.out.println(createPhoneNumber(new int[]{10,1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }


    private static String createPhoneNumber(int[] numbers) {

        IntStream intStream = Arrays.stream(numbers);

        numbers = intStream.filter(number -> {
            return !(number < 0 || number > 9);

        }).toArray();

        if (numbers.length != 10) throw new IllegalArgumentException();


       return  String.format("(%s) %s-%s",
                numberBetween(numbers,0,3),
                numberBetween(numbers,3,6),
                numberBetween(numbers,6,10)

        );

    }

    private static StringBuffer numberBetween(int[] numbers, int start, int end) {
        StringBuffer block = new StringBuffer("");
        IntStream.range(start,end).forEach(inex->{
            block.append(numbers[inex]);

        });
    return  block;
    }

}