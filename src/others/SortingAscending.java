package others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

/**
 * Created by wojtek on 08.07.2019.
 */
public class SortingAscending {

    public static void main(String[] args) {
        int [] i = SortingOtherSolution.sortOdd(new int[]{ 5, 3, 2, 8, 1, 4 });

        for (int tem : i){
            System.out.print(tem);
        }
    }

    public static int[] sortArray(int[] array) {
        ArrayList<Integer> currentlist = new ArrayList();
        ArrayList<Integer> tempList = new ArrayList();
        ArrayList<Integer> index = new ArrayList<>();
        for (int a : array) {
            currentlist.add(a);
        }

        for (int i = 0; i < currentlist.size(); i++) {
            if (!(currentlist.get(i) % 2 == 0)) {
                tempList.add(currentlist.get(i));
                index.add(i);
            }
        }
        Collections.sort(tempList);


        for (int i = 0; i < tempList.size(); i++) {
            System.out.println("current list :" + currentlist);
            currentlist.remove((int)index.get(i));
            System.out.println("after Remove :"+currentlist);

            currentlist.add(index.get(i), tempList.get(i));
            System.out.println("after replace :"+ currentlist);

        }


        int[] anser = new int[array.length];
        for (int i = 0; i < anser.length; i++) {
            anser[i] = currentlist.get(i);
        }
        return anser;
    }
}




