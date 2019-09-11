package amber;

import java.util.Scanner;

/**
 * Created by wojtek on 01.07.2019.
 */
public class SquareDigital {

    public static int  squareDigital (int n){



        int number = n;
        int remiander = 0;
        int result= 0;

        while (number>0){
            remiander= number%10;
            result=(remiander*remiander)+(result*10);
            System.out.println(result);
            number = number/10;

        }

return result;

    }

    public static int substring2 ( int n) {
int wynik =0;
String results ="";
        String stringValue = String.valueOf(n);
        for(int i=0;i<stringValue.length();i++){
            int tem = (Integer.parseInt(String.valueOf(stringValue.charAt(i))));
            int tem2 = tem*tem;
            results=results+String.valueOf(tem2);

        }

return Integer.parseInt(results);



    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numer = scanner.nextInt();

        System.out.println(squareDigital(numer));
    }
}

