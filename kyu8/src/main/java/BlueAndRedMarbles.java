public class BlueAndRedMarbles {
    public static double guessBlue(int blueStart, int redStart, int bluePulled, int redPulled) {
        // Place your code here
        return (double) (blueStart - bluePulled) / (blueStart + redStart - bluePulled - redPulled);
    }

    public static void main(String[] args) {
        System.out.println(guessBlue(5,7,4,3));
    }
}
