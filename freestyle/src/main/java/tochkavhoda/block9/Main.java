package tochkavhoda.block9;

import java.util.*;

public class Main {
    public static void main(String... args) {
        int[][] matrix1 = {{1, 2, 2, 4, 4}, {4, 5, 1, 4}, {2, 4, 1}, {2, 4, 1, 4, 1, 2}, {1, 8, 1, 1, 8}};

        // arrays transforming to Collections
        List<List<Integer>> matrixToList = new ArrayList<>();
        for (int[] elem : matrix1) {
            List<Integer> listElement = new ArrayList<>();
            for (int elem1 : elem) {
                listElement.add(elem1);
            }
            Collections.addAll(matrixToList, listElement);
        }

        System.out.println(matrixToList);

        List<Set<Integer>> matrixToSet = new ArrayList<>();
        for (List<Integer> elem : matrixToList) {
            Set<Integer> listElement = new HashSet<>();
            for (int elem1 : elem) {
                listElement.add(elem1);
            }
            Collections.addAll(matrixToSet, listElement);
        }

        System.out.println(matrixToSet);

        // filtering

        Set<int[]> resultSet = new HashSet<>();
        Set<Set<Integer>> filterSet = new HashSet<>();

        int counter = 0;
        while (true) {
            if (counter == matrix1.length - 1) {
                if (filterSet.contains(matrixToSet.get(counter))) {
                    counter += 1;
                } else {
                    resultSet.add(matrix1[counter]);
                    filterSet.add(matrixToSet.get(counter));
                    counter += 1;
                }
                break;
            }
            if (matrixToSet.get(counter).equals(matrixToSet.get(counter + 1))) {
                if (filterSet.contains(matrixToSet.get(counter))) {
                    counter += 1;
                } else {
                    resultSet.add(matrix1[counter]);
                    filterSet.add(matrixToSet.get(counter));
                    counter += 1;
                }
            } else {
                if (filterSet.contains(matrixToSet.get(counter))) {
                    counter += 1;
                } else {
                    resultSet.add(matrix1[counter]);
                    filterSet.add(matrixToSet.get(counter));
                    counter += 1;
                }
            }
        }

        System.out.println(resultSet);
    }
}
