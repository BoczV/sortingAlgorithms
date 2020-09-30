package searching;

import java.util.List;

public class BinarySearch {

    public int search(List<Integer> toSort, Integer searchedElement) {
        if (toSort == null || searchedElement == null) {
            throw new IllegalArgumentException();
        } else if (searchedElement < toSort.get(0) || searchedElement > toSort.get(toSort.size() - 1)) {
            throw new NullPointerException();
        }
        return search(toSort, searchedElement, 0, toSort.size() - 1);
    }

    public int search(List<Integer> toSort, int searchedElement, int from, int to) {
        int indexOfMiddle = (from + to) / 2;
        int middle = toSort.get(indexOfMiddle);
        if (middle == searchedElement) {
            return indexOfMiddle;
        } else if (middle > searchedElement) {
            return search(toSort, searchedElement, from, indexOfMiddle);
        }
        return search(toSort, searchedElement, indexOfMiddle + 1, to);
    }
}
