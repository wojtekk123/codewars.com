package amber;

import javax.swing.event.ChangeListener;
import java.util.HashSet;

/**
 * Created by wojtek on 03.07.2019.
 */
public class Pangram {


    public static void main(String[] args) {
        if (check2("The quick brown fox jumps over the lazy dog.")) {
            System.out.println("yes");
        } else System.out.println("not");

        int aski = Character.getNumericValue('z');
        System.out.println(aski);


    }

    public static boolean check(String sentence) {

        String ne = sentence.toLowerCase();
        HashSet<Character> hashSet = new HashSet();
        for (int i = 0; i < ne.length(); i++) {
            if (ne.charAt(i) != ' ' && ne.charAt(i) != '!' && ne.charAt(i) != '.') {

                hashSet.add(ne.charAt(i));

            }
        }

        if (hashSet.size() == 26) {
            return true;
        } else
            return false;

    }


    public  static boolean check2 ( String sentence){

        HashSet<Character> hashSet = new HashSet<>();
        String cos = sentence.toLowerCase();

        for (int i = 0 ; i<cos.length();i++){

            if (Character.getNumericValue(sentence.charAt(i))>=10&&Character.getNumericValue(sentence.charAt(i))<=35){
                hashSet.add(cos.charAt(i));
            }

        }


        if (hashSet.size()==26){
            return true;
        }else return false;


    }

}

