package amber;

/**
 * Created by wojtek on 16.05.2019.
 */
public class Permutation {
    public static void main(String[] args) {

        int[] tab = {1,3,2,4};

        System.out.println(solution(tab));


    }




    private static int solution (int [] A){

        boolean flag1= true;
        boolean flag2= true;

        for (int i =0; i<A.length;i++){
            if (A[i]>A.length){
                flag1=false;
                break;
            }
        }


        for ( int i =0; i<A.length;i++){
            for (int j =i+1;j<A.length;j++)            {
                if (A[i]==A[j]);
                flag2=false;
                break;

            }
        }


        if ((flag1&&flag1)!=true){
            return 0;
        }else
            return 1;

    }
}
