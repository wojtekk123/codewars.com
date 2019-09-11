package others;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by wojtek on 06.07.2019.
 */
public class PrimeFactor {

    public static void main(String[] args) {

         System.out.println(primefactor(7775460));
    }

    public static boolean pnumber(int numb) {
        boolean lok = false;
        if (numb == 2) return true;
        for (int i = 2; i < numb; i++) {
            if (numb % i == 0) {
                lok = false;
                break;
            } else {
                lok = true;
            }
        }
        return lok;
    }

    public static String primefactor(int number) {
        ArrayList<Integer> tab = new ArrayList();

        int csa = 0;
        for (int i = 2; i < number + 1; i++) {

            if (pnumber(i) == true) {
                int j = 0;
                while (number % i == 0) {
                    number /= i;

                    j++;
                }

                tab.add(j);

            }
        }


        return correctAnswer(tab);
    }

    public static String correctAnswer(ArrayList<Integer> list) {
        String answer ="";
        int iter =1;
        for (int i = 0; i < list.size(); i++) {
            if (pnumber(i)) {
                if(list.get(i)==0) {
                    i++;
                }else {
                    System.out.println("wartosc = "+list.get(i));
                    System.out.println(iter);

                    answer=answer +draw(list.get(i),iter);
                    iter++;

                }

            }

        }

        return answer;

    }

    public static String draw(int key, int valeue) {

        if (valeue != 1) return String.format("(%d**%d)", key, valeue);
        else return String.format("(%d)", key);


    }
}