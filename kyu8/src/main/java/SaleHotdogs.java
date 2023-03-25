public class SaleHotdogs{
    public static int saleHotdogs(final int n){
        // show me the code
        final int BASIC_PRICE = 100;
        final int FIRST_DISCOUNTED_PRICE = 95;
        final int FINAL_DISCOUNTED_PRICE = 90;

        if (n < 5) {
            return n * BASIC_PRICE;
        } else if (n >= 10) {
            return n * FINAL_DISCOUNTED_PRICE;
        } else {
            return n * FIRST_DISCOUNTED_PRICE;
        }
    }
}
