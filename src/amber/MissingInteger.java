package amber;

import java.security.AlgorithmConstraints;
import java.util.*;

/**
 * Created by wojtek on 16.05.2019.
 */
public class MissingInteger {


    public static void main(String[] args) {

    int[]A={1,3};
        System.out.println(soulution(A));
    }

    public  static int soulution ( int [] A){




        HashSet list= new HashSet();
        int tem;
        int count;
        for (int a : A){
            list.add(a);
        }


        for(int i = 1; i< A.length;i++){
            if (list.add(i)){
                return i;

            }
        }
            return A.length+1;
        }



}
