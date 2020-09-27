import java.util.Collections;
import java.util.List;

public class QuickSort {

    public void sort(List<Integer> toSort) {
        Integer startingPoint = 0;
        Integer endingPoint = toSort.size() - 1;
        sort(toSort, startingPoint, endingPoint);
    }

    private void sort(List<Integer> toSort, Integer startingPoint, Integer endingPoint) {
        if (startingPoint >= endingPoint) {
            return;
        }
        Integer pivot = toSort.get((startingPoint + endingPoint) / 2);
        Integer index = partition(toSort, startingPoint, endingPoint, pivot);
        sort(toSort, startingPoint, index - 1);
        sort(toSort, index, endingPoint);
    }

    private Integer partition(List<Integer> toSort, Integer startingPoint, Integer endingPoint, Integer pivot) {
        while (startingPoint <= endingPoint){
            while (toSort.get(startingPoint) < pivot){
                startingPoint++;
            }
            while (toSort.get(endingPoint) > pivot){
                endingPoint--;
            }
            if (startingPoint <= endingPoint){
                Collections.swap(toSort, startingPoint, endingPoint);
                startingPoint++;
                endingPoint--;
            }
        }
        return startingPoint;
    }
}
