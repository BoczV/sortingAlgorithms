import sortingtypestest.BubbleSort;
import sortingtypestest.InsertionSort;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        List<Integer> toSort = Arrays.asList(3, 1, 10, 8, 7, 9, 5, 2, 4);
        System.out.println(toSort);
        insertionSort.sort(toSort);
        System.out.println(toSort);
    }
}
