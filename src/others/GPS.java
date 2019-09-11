package others;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

/**
 * Created by wojtek on 09.07.2019.
 */
 class GPS {



    public static void main(String[] args) {
        System.out.println(gps2(20, new double[]{0.0, 0.23, 0.46, 0.69, 0.92, 1.15, 1.38, 1.61}));
    }

    public static int gps(int s, double[] x) {


        double temp = 0;
        if (x.length <= 1) return 0;
        for (int i = 0; i < x.length - 1; i++) {
            if (x[i + 1] - x[i] > temp) {
                temp = x[i + 1] - x[i];
            }
        }
        return (int) Math.floor((3600 * temp) / s);
    }

    public static int gps2(int s, double[] x) {

        double maxSpeed = IntStream.range(0,x.length-1)
                .mapToDouble(i->(x[i+1]-x[i])*3600/ s)
                .max().orElse(0.0);

            return (int) Math.floor(maxSpeed);
    }

    }

