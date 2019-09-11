package amber;

import java.util.*;

/**
 * Created by wojtek on 04.07.2019.
 */
public class Dublicat {


    public static void main(String[] args) {
        System.out.println(dublication("awer24wrabsf35b35wrwrWA11"));
        System.out.println(duble("awer24wrabsf35b35wrwrWA11"));
    }

    public static int dublication(String string) {



        String temp = string.toLowerCase();
        HashSet set = new HashSet();
        for (int i =0; i<temp.length();i++ ){
            for (int j =i+1;j<temp.length();j++){
                if (temp.charAt(i)==temp.charAt(j)){
                    set.add(temp.charAt(i));
                }
            }
        }
    return set.size();
    }

public static int duble (String w){

        List<String> list = Arrays.asList(w.toLowerCase().split(""));
        return (int) list.stream().filter(s->Collections.frequency(list,s)>1).distinct().count();
}





}
