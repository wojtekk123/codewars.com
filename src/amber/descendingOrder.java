package amber;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by wojtek on 02.07.2019.
 */
public class descendingOrder {


    public static void main(String[] args) {
        sort(6845);
    }
    public static int sort (final int  num) {

        String result = "";
        int restulw=0;
        String number = String.valueOf(num);
        ArrayList <String>arrayList = new ArrayList();
        for (int i=0; i <number.length();i++){
            arrayList.add(String.valueOf(number.charAt(i)));
        }

        Collections.sort(arrayList);
        Collections.reverse(arrayList);
        for(String a : arrayList){
            result=result+a;
        }

    return restulw=Integer.parseInt(result);
    }




}
