import java.util.Arrays;

public class Dinglemouse {

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        // Your code here!
        final int FIRST_YEAR = 15;
        final int SECOND_YEAR = 9;
        final int CAT_STEP_AFTER_SECOND_YEAR = 4;
        final int DOG_STEP_AFTER_SECOND_YEAR = 5;

        switch (humanYears) {
            case 1 -> {
                return new int[] {humanYears, FIRST_YEAR, FIRST_YEAR};
            }
            case 2 -> {
                return new int[] {humanYears, FIRST_YEAR + SECOND_YEAR, FIRST_YEAR + SECOND_YEAR};
            }
        }

        int dogYears = FIRST_YEAR + SECOND_YEAR + DOG_STEP_AFTER_SECOND_YEAR * (humanYears - 2);
        int catYears = FIRST_YEAR + SECOND_YEAR + CAT_STEP_AFTER_SECOND_YEAR * (humanYears - 2);
        return new int[] {humanYears, catYears, dogYears};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(1)));
        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(2)));
        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(10)));
    }

}
