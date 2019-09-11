package amber;

import java.util.ArrayList;

/**
 * Created by wojtek on 03.07.2019.
 */
public class CountDublicate {


    public static void main(String[] args) {
        System.out.println(dublication("gdfgdfg" +
                ""));
    }


    public static int dublication(String string) {
        ArrayList<Character> list = new ArrayList();
        int count = 0;
        String str = string.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length() ; j++) {
                if (str.charAt(i) == str.charAt(j )) {
                    list.add(str.charAt(i));
                    for(char o : list){
                        System.out.println(o);
                    }

                    break;

                }
            }
        }
        return count;
    }

}





