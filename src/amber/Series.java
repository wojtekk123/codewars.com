package amber;

import java.io.PrintStream;
import java.text.DecimalFormat;

/**
 * Created by wojtek on 02.07.2019.
 */
public class Series {


    public static void main(String[] args) {
        System.out.println(seriesSum(121));

    }


    public static String seriesSum(int n) {


        Double temp = new Double(seriesSum2(n));
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        decimalFormat.setMaximumFractionDigits(2);
        return decimalFormat.format(temp);

        }


    public static double seriesSum2(double n) {

        if (n == 1) {
            return n;
        }
        return 1 / (1 + 3 * (n - 1)) + seriesSum2(n - 1);

    }

}
