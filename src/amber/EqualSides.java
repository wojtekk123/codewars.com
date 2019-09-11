package amber;

import java.util.ArrayList;

/**
 * Created by wojtek on 02.07.2019.
 */
public class EqualSides {

    public static void main(String[] args) {
        System.out.println(findEventIndex(new int[]{1, 2, 3, 4, 3, 2, 1}));
    }


    public static int findEventIndex(int[] arr) {
        ArrayList solution = new ArrayList();
        int leftsum = 0;
        for (int i = 1; i < arr.length - 1; i++) {

            leftsum = +arr[i - 1];
            int rightsume = 0;
            for (int j = i; j < arr.length - 1; j++) {
                rightsume = +arr[j - 1];
            }
            if(leftsum==rightsume){
return i;

        }


    }
return-1;
}

}
