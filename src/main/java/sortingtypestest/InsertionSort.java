package sortingtypestest;

import java.util.List;

public class InsertionSort {

    public void sort(List<Integer> toSort) {
        for (int i = 1; i < toSort.size() - 1; i++) {
            if (toSort.get(i) < toSort.get(i - 1)) {
                insertIntoPrecisePlace(toSort, toSort.get(i), i - 1);
                toSort.remove(toSort.get(i));
            }
        }
    }

    private void insertIntoPrecisePlace(List<Integer> toSort, Integer integer, int i) {
        for (int j = i; j > 0; j--) {
            if (toSort.get(j) < integer) {
                toSort.add(j + 1, integer);
            }
        }
    }
}
