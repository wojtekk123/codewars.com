package others;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.LongStream;

/**
 * Created by wojtek on 10.07.2019.
 */
public class SquareDivisiors {


    public static void main(String[] args) {
        System.out.println(listSquared3(1, 250));
    }

    public static String listSquared(long m, long n) {

        String answe = "[";


        for (long i = m; i <= n; i++) {
            double suma = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    suma = suma + Math.pow(j, 2);
                }
            }

            if (Math.sqrt(suma) % 1 == 0) {
                answe = answe + "[" + i + ", " + (int) suma + "]";

            }

        }
        return answe + "]";
    }

    public static String listSquared2(long m, long n) {
        List<List<Integer>> finalRes = new ArrayList<List<Integer>>();
        for (long i = m; i <= n; i++) {
            double result = 0;
            for (int y = 1; y <= i; y++) {
                if (i % y == 0) {
                    result = result + Math.pow(y, 2);
                }
            }
            if (Math.sqrt(result) % 1 == 0) {
                List<Integer> pair = new ArrayList<Integer>();
                pair.add((int) i);
                pair.add((int) result);
                finalRes.add(pair);

            }

        }
        return finalRes.toString();


    }

    public static String listSquared3(long m, long n) {
        ArrayList<String> strings = new ArrayList<>();

        LongStream.rangeClosed(m,n).forEach(current->{
            long sum = LongStream.rangeClosed(1,current).filter(i->current%i==0).map(i->i*i).sum();
            if(Math.sqrt(sum)%1==0) strings.add(String.format("[%d, %d]",current,sum));

        });

        return String.valueOf(strings);




    }

    public static String answer (long m, long n){

        ArrayList <String> arrayList = new ArrayList();
        LongStream.rangeClosed(n,m).forEach(current ->{

            long suma = LongStream.rangeClosed(1,current).filter(e->e%current==0).map(i->i*i).sum();
            if (Math.sqrt(suma)%1==0) arrayList.add(String.format("[%d, %d]",current,suma));


        });
return arrayList.toString();
    }

}