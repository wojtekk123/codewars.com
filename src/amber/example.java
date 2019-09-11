package amber;

/**
 * Created by wojtek on 01.07.2019.
 */
public class example {


    public static String cos (String s){

        String [] rak = s.split(" ");



        int minimal = Integer.parseInt(rak[0]);
        int maximal = Integer.parseInt(rak[0]);
        String result = "";

        for (int i = 0;i <rak.length;i++){
            int temp = Integer.parseInt(rak[i]);
            if (minimal>temp){
                minimal=temp;
            } if (maximal<temp){
                maximal=temp;


            }


        }
        result = String.valueOf(maximal)+" "+String.valueOf(minimal);

        return result;

    }


}
