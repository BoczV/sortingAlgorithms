package sortingtypes;

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

    private void findPlaceForAnElement(List<Integer> toSort, int index){
        for (int j = 0; j < toSort.size() - 1 - index; j++) {
            if (toSort.get(j) > toSort.get(j + 1)) {
                Collections.swap(toSort, j, j + 1);
            }
        }
    }
}
