package DepedencyIndection;

/**
 * Created by wojtek on 30.07.2019.
 */
public class car {


    public String nazwa;
    public String imie;
    public String cos;

    public car(String nazwa, String imie, String cos) {
        this.nazwa = nazwa;
        this.imie = imie;
        this.cos = cos;
    }

    public car() {
    }

    @Override
    public boolean equals(Object d) {

        if (this == d) {
            return true;
        }
        if (d == null || this.getClass() == d.getClass()) {
            return false;
        }

        car car = (car) d;
        return (nazwa.equals(car.nazwa) &&
                imie.equals(car.imie) &&
                cos.equals(car.cos));
    }

}




