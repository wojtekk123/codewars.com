package amber;

public class training {

    public static int countBits(int n) {

        int howOne = 0;
        String count = Integer.toBinaryString(n);
        System.out.println(count);
        for (int i = 0; i < count.length(); i++) {

            if (count.charAt(i) == '0') {
                howOne++;

            }


        }
        return howOne;

    }


    public static void main(String[] args) {
        System.out.println(countBits(465));
    }
}