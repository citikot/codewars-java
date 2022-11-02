class FirstNonConsecutive {
    static Integer find(final int[] array) {

        if (array.length < 2) {
            return null;
        }

        for (int i = 1; i < array.length; i++) {
            if (array[i] - array[i-1] != 1) {
                return array[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,8,10,12};
        int[] arr2 = {};
        int[] arr3 = {-1};
        int[] arr4 = {-10,-9,-8,-7,-4,-5, 1, 2};

        System.out.println(find(arr1));
        System.out.println(find(arr2));
        System.out.println(find(arr3));
        System.out.println(find(arr4));

    }
}
