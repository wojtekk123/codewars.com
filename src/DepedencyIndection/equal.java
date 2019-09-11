package DepedencyIndection;

/**
 * Created by wojtek on 30.07.2019.
 */
public class equal {


    public static void main(String[] args) {

        car c1 = new car();
        car c2 = null;
        car c3 = new car("name", "asd", "das");
        car c4 = new car("name", "asd", "das");


        System.out.println(c3.equals(c4));

    }



}
