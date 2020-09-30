package sorting;

import java.util.Collections;
import java.util.List;

public class BubbleSort {


    public void sort(List<Integer> toSort) {
        try {
            for (int i = 0; i < toSort.size() - 1; i++) {
                findPlaceForAnElement(toSort, i);
            }
        } catch (NullPointerException ex) {
            throw new IllegalArgumentException();
        }
    }

    public void recursiveSort(List<Integer> toSort) {
        if (toSort.size() < 1) {
            return;
        }
        findPlaceForAnElement(toSort);
        recursiveSort(toSort.subList(0, toSort.size() - 1));
    }

    private void findPlaceForAnElement(List<Integer> toSort, int index) {
        for (int j = 0; j < toSort.size() - 1 - index; j++) {
            if (toSort.get(j) > toSort.get(j + 1)) {
                Collections.swap(toSort, j, j + 1);
            }
        }
    }

    private void findPlaceForAnElement(List<Integer> toSort) {
        for (int j = 0; j < toSort.size() - 1; j++) {
            if (toSort.get(j) > toSort.get(j + 1)) {
                Collections.swap(toSort, j, j + 1);
            }
        }
    }
}
