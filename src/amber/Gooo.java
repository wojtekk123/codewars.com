package amber;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by wojtek on 16.05.2019.
 */
public class Gooo {
    public static void main(String[] args) {
            int []tab = {1,2,1,3,4,1,2,5,3,2,4,};
        int x = 5;

        System.out.println(solution(x,tab));
    }

    public static int solution(int X, int[] A) {

        Set setList= new HashSet();

        for (int i=0; i<A.length; i++){

            if (A[i]<=X){
                setList.add(A[i]);
                if (setList.size()==X)
                    return i;
            }

        }



        return -1;
        }


}
