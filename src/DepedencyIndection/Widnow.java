package DepedencyIndection;

/**
 * Created by wojtek on 30.07.2019.
 */
public class Widnow {

    private Weather  weather;

    public Widnow( Weather  weather) {
        this.weather = weather;
    }
    public void  lookout (){
        System.out.println(this.weather.description);
    }

}
