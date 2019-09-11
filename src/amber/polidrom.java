package amber;

import java.util.Scanner;

/**
 * Created by wojtek on 17.06.2019.
 */
public class polidrom {


    public static void main(String[] args) {


        System.out.println("please enter a  number ");
        Scanner scanner = new Scanner(System.in);
        int polidrom = scanner.nextInt();


        if (ispoli(polidrom)){
            System.out.println("it is ");

        }else {
            System.out.println("isnt");
        }

    }

//    public static boolean ispoli (int number ) {
//
//        int polidrome = number;
//        int revers = 0;
//
//        while (polidrome!=0){
//            int remainder = polidrome%10;
//            revers= revers*10+remainder;
//            polidrome = polidrome/10;
//            System.out.println();
//            System.out.println(revers);
//
//        }
//
//
//        if (number ==revers){
//            return true;
//
//        }else
//            return false;
//
//    }


    public static boolean ispoli (int number ){

       int revers =0;
       int remainder = 0;
       int poligram =number;


        while  (poligram>0){

        remainder=poligram%10;
        revers = revers*10+remainder;
        poligram=poligram/10;
            System.out.println(revers);


        }


        if (number==revers){
            return true;
        }else
            return false;

    }


}
