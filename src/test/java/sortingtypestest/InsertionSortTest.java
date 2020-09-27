package sortingtypestest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class InsertionSortTest {

    private final InsertionSort insertionSort = new InsertionSort();

    @Test
    void testSort(){
        List<Integer> toSort = Arrays.asList(3, 1, 10, 8, 7, 9, 6, 5, 2, 4);
        insertionSort.sort(toSort);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Assertions.assertIterableEquals(expected, toSort);
    }

}