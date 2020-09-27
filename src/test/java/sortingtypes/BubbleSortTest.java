package sortingtypes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


class BubbleSortTest {

    private final BubbleSort bubbleSort = new BubbleSort();

    @Test
    void testSort(){
        List<Integer> toSort = Arrays.asList(3, 1, 10, 8, 7, 9, 5, 2, 4);
        bubbleSort.sort(toSort);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 7, 8, 9, 10);
        Assertions.assertIterableEquals(expected, toSort);
    }

    @Test
    void testSortWithDuplication(){
        List<Integer> toSort = Arrays.asList(3, 1, 10, 8, 7, 9, 5, 1, 2, 4);
        bubbleSort.sort(toSort);
        List<Integer> expected = Arrays.asList(1, 1, 2, 3, 4, 5, 7, 8, 9, 10);
        Assertions.assertIterableEquals(expected, toSort);
    }

    @Test
    void testWithNull(){
        List<Integer> toSort = null;
        Assertions.assertThrows(IllegalArgumentException.class, () -> bubbleSort.sort(toSort));
    }

    @Test
    void testSortWithRecursion(){
        List<Integer> toSort = Arrays.asList(3, 1, 10, 8, 7, 9, 5, 2, 4);
        bubbleSort.recursiveSort(toSort);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 7, 8, 9, 10);
        Assertions.assertIterableEquals(expected, toSort);
    }

}