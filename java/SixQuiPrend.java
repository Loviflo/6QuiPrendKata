

public class SixQuiPrend {

    private static final int NB_CARD_MAX = 104;

    public static int findNumberOfBullHeads(int value) {
        int result = 0;
        if (value%5 == 0 && !(value%10 == 0))
            result += 2;
        if (value%10 == 0)
            result += 3;
        if (value >= 10) {
            if(value > 100 && value%10 == ((value/10)%10)) {
                result += 5;
            }else if(value < 100 && value%10 == value/10)
                result += 5;
        }
        if (result == 0) {
            result = 1;
        }

        return result;
    }

    public static void gameLoop() {
        for (int cardValue = 1 ; cardValue <= NB_CARD_MAX ; cardValue++) {
            System.out.println(cardValue + " -> " + findNumberOfBullHeads(cardValue));
        }
    }
}
