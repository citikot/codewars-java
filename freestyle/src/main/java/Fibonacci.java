public class Fibonacci
{
    private static long getNumber(int position) {
        if (position < 1) return -1;
        if (position == 1 || position == 2) return 1;
        return getNumber(position - 1) + getNumber(position - 2);
    }

    public static void main(String[] args) {

        System.out.println(getNumber(-1));
        System.out.println(getNumber(0));
        System.out.println(getNumber(1));
        System.out.println(getNumber(2));
        System.out.println(getNumber(3));
        System.out.println(getNumber(4));
        System.out.println(getNumber(5));
        System.out.println(getNumber(6));
        System.out.println(getNumber(7));
    }

}