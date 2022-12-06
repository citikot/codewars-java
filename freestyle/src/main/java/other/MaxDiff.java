package other;

import java.util.Scanner;

public class MaxDiff {
    public static class Difference {
        private int[] elements;
        public int maximumDifference;

        // Add your code here
        public Difference(int[] _elements) {
            this.elements = _elements;
        }

        public void computeDifference() {
            int end = this.elements.length - 1;
            int diff = 0;

            while (end != 0) {
                for (int i = 0; i < end - 1; i++) {
                    diff = Math.abs(elements[end] - elements[i]);

                    if (diff > maximumDifference) {
                        maximumDifference = diff;
                    }
                }
                end--;
            }
        }

    } // End of Difference class


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}

