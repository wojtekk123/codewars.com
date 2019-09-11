package others;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by wojtek on 09.07.2019.
 */
 class NumberInWords {

    public static void main(String[] args) {


    }

    public static String met(String words) {
        String cos = "";
        String[] word = words.split(" ");
        String answer[] = new String[word.length];
        String[] number = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        System.out.println(word[1].contains("3"));
        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < number.length; j++) {

                if (word[i].contains(number[j])) {

                    answer[j] = word[i];

                }
            }
        }


        for (String l : answer) {
            cos = cos + " " + l;
        }
return cos;
}
}