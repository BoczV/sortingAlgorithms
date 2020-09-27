package sortingtypes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sortingtypes.QuickSort;

import java.util.Arrays;
import java.util.List;


class QuickSortTest {
    private final QuickSort quickSort = new QuickSort();

    @Test
    void testSort(){
        List<Integer> toSort = Arrays.asList(3, 1, 10, 8, 7, 9, 5, 2, 4);
        quickSort.sort(toSort);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 7, 8, 9, 10);
        Assertions.assertIterableEquals(expected, toSort);
    }

    @Test
    void testSortWithDuplicates(){
        List<Integer> toSort = Arrays.asList(3, 1, 10, 8, 7, 9, 1, 5, 2, 4);
        quickSort.sort(toSort);
        List<Integer> expected = Arrays.asList(1, 1, 2, 3, 4, 5, 7, 8, 9, 10);
        Assertions.assertIterableEquals(expected, toSort);
    }

    @Test
    void testWithNull(){
        List<Integer> toSort = null;
        Assertions.assertThrows(IllegalArgumentException.class, () -> quickSort.sort(toSort));
    }

}