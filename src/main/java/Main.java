import searching.BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 101; i++) {
            list.add(i);
        }

        BinarySearch binarySearch = new BinarySearch();
        long startTime = System.currentTimeMillis();

        binarySearch.search(list, 75);

        long elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println(elapsedTime);

        long startTime2 = System.currentTimeMillis();

        for (Integer integer : list) {
            if (integer.equals(75)) {
                break;
            }
        }
        long elapsedTime2 = System.currentTimeMillis() - startTime2;
        System.out.println(elapsedTime2);
    }

    public static void binaryMeasurement(List<Integer> list, Integer searchNumber) {
        BinarySearch binarySearch = new BinarySearch();
        long startTime = System.currentTimeMillis();

        binarySearch.search(list, searchNumber);

        long elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println(elapsedTime);
    }

    public static void linearMeasurement(List<Integer> list, Integer searchNumber) {
        long startTime = System.currentTimeMillis();

        for (Integer integer : list) {
            if (integer.equals(searchNumber)) {
                break;
            }
        }
        long elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println(elapsedTime);
    }
}
