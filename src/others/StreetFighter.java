package others;

/**
 * Created by wojtek on 10.07.2019.
 */
public class StreetFighter {


    public static String[] stringsFightersSelectiob(String[][] fighters, int[] position, String[] moves) {

        int x = position[0];
        int y = position[1];

        String[] result = new String[moves.length];

        for (int i = 0; i < moves.length; i++) {

            String mv = moves[i];
            switch (mv) {

                case "up":
                    y = 0;
                    break;
                case "right":
                    x = (x + 1) % 6;
                    break;
                case " down":
                    y = 1;
                    break;
                case "left":
                    x = (x + 5) % 6;
                    break;
                default:
                    break;
            }
            result[i] = fighters[x][y];
        }
        return result;
    }
}