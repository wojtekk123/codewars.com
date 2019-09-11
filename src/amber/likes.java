package amber;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by wojtek on 06.07.2019.
 */
public class likes {


    public static String whoLikesIT (String ... name ){

        if (name.length==0){
            return "no one likes this";

        }else if(name.length==1){
            return String.format("%s likes this",name[0]);
        }else if(name.length==2){
            return String.format("%s and %s like this",name[0],name[1]);
        }else if(name.length==3){
            return String.format("%s, %s and %s like this",name[0],name[1],name[2]);
        }
        else {
            return String.format("%s, %s and %d others like this",name[0],name[1],name.length-2);
        }

    }
}
