package DepedencyIndection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wojtek on 30.07.2019.
 */
public class House {

    List<Widnow> widnows = new ArrayList<>();

    public House(){

        Weather weather = new Weather();

        widnows.add(new Widnow(weather));
        widnows.add(new Widnow(weather));
        widnows.add(new Widnow(weather));
        widnows.add(new Widnow(weather));

    }
    public void look (){
        for (Widnow widnow1 :widnows){
            widnow1.lookout();
        }
    }

    public static void main(String[] args) {
        House house = new House();
        house.look();

    }

}
