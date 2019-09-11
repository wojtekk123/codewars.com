package amber;

import javafx.scene.layout.Pane;

import java.util.Scanner;

/**
 * Created by wojtek on 08.06.2019.
 */
public class fibonaci {


    public static void main(String ... c) {

Scanner scanner = new Scanner(System.in);
int number=Integer.MAX_VALUE;
while (number!=0){
    number=scanner.nextInt();
    System.out.printf("does %d is prome ? %s  ",number,isPrime(number));
}

    }


    public static int fib (int n ){

        if (n==0)
            return 0;
        else if (n==1)
            return 1;
        else
            return (fib(n-1)+(n-2));

    }
    public static boolean isPrime ( int number ) {

        int sqrt = (int) (Math.sqrt(number)+1);
        System.out.println(sqrt);
        for ( int i = 2 ; i<number;i++){
            if (number%i==0){
                return false;
            }
        }
        return true;

    }



}
