package amber;

import java.util.Scanner;

/**
 * Created by wojtek on 22.06.2019.
 */
public class others {

    public static void main(String[] args) {
        System.out.println("yout worfs to revers is :");
        Scanner scanner = new Scanner(System.in);
        String wors = scanner.nextLine();
//        System.out.printf("your answer is : %s %n" , revers(wors));
//        System.out.printf("your answer is : %s %n", revers2(wors));
//        System.out.printf("your answer is : %s", recur(wors));


        String[] spli = wors.split(" ");
        for (String a:spli){
            System.out.println(a);
        }



    }


    public static String revers (String name){

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name);
        stringBuilder.reverse();
        return String.valueOf(stringBuilder);

    }

    public static String revers2 (String name ) {

        String revers = "";

        for (int i =name.length()-1;i>=0;i--){

        char h = name.charAt(i);
        revers+=String.valueOf(h);

        }
return revers;


    }

    public static String recur (String name) {

       if (name.isEmpty()){
           return name;
       }
       return recur(name.substring(1))+name.charAt(0);





    }


}
