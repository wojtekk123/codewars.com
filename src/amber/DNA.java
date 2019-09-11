package amber;

import java.util.*;

/**
 * Created by wojtek on 22.05.2019.
 */
public class DNA {

    public static void main(String[] args) {
        int[] tab1 = {2, 5, 0};
        int[] tab2 = {4, 5, 6};
        String dna = "CAGCCTA";

        DNA dna1= new DNA();
        int cos[] = dna1.solution(dna,tab1,tab2);

        for (int e : cos){
            System.out.println(e);
        }

    }


    public   int[] solution(String S, int[] P, int[] Q) {


        int solutrion []=new int[P.length];


        String result="";

        for (int i = 0; i < S.length(); i++) {

            switch (S.charAt(i)) {
                case 'A':
                    result+="1";
                    break;
                case 'C':
                    result+="2";
                    break;
                case 'G':
                    result+="3";
                    break;
                case 'T':
                    result+="4";
                    break;

            }
        }

        for (int i =0; i<Q.length;i++){
        ArrayList<Integer> list = new ArrayList();
            for(int j=P[i];j<=Q[i];j++){

                char c = result.charAt(j);
                int a =Character.getNumericValue(c);
                list.add(a);
            }

            Collections.sort(list);
            solutrion[i]= list.get(0);

        }

return solutrion;


    }
}