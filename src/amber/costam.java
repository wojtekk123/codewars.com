package amber;

import java.util.Scanner;

/**
 * Created by wojtek on 19.06.2019.
 */
public class costam {


    public static void main(String[] args) {


        System.out.println("podaj jaką chcesz utworzyć tabele z ilu lementów");
        Scanner scanner=new Scanner(System.in);
        int [] tan1 = fillArray(scanner.nextInt());

        int sume = itssuma(tan1);
        System.out.println(sume);
    }



    public static int itssuma (int [] tab){

        int suma =0;

        for (int i = 0;i<tab.length;i++){

            suma = suma+tab[i];

        }

     return    suma/2;


    }


    public static int[] fillArray (int elements ){

        int [] tab1 = new int[elements];

        for (int i = 0;i<elements;i++){
            tab1[i]=i;
        }


     return tab1;
    }

}
