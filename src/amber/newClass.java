package amber;

/**
 * Created by wojtek on 02.07.2019.
 */
public class newClass {


    public static void main(String[] args) {
        System.out.println(recuration(4));
    }

    public static double recuration (double n){

        if (n==1){
            return n;
        }
        return 1/(1+3*(n-1))+recuration(n-1);

    }
}
