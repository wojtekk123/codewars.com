package others;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by wojtek on 25.07.2019.
 */
public class BuddyPairs {

    public static void main(String[] args) {

        System.out.println(buddy(10, 50));
        System.out.println(sum(1071625));
    }
    //48 if sum of sum(48)==76 ->==sum(76)->==48+1


    public static String buddy(long start, long limit) {
        String answer = "";
        ArrayList<String> list = new ArrayList();
        for (long i = start; i <= limit; i++) {
            long tem = sum(i);
            if (sum(tem - 1) == i + 1) {
                answer = ("(" + i + " " + (tem - 1) + ")");
                break;
            } else answer = "Nothing";
        }
        return answer;

    }

    public static long sum(long n) {
        long asnwer = 0;
        ArrayList<Long> number = new ArrayList();
        for (long i = 1; i < n; i++) {
            if (n % i == 0) {
                number.add(i);
            }
        }
        return number.stream().parallel().mapToLong(k -> k.longValue()).sum();

    }
}
