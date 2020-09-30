package searching;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class BinarySearchTest {
    private final BinarySearch binarySearch = new BinarySearch();


    @Test
    void testSearchFirstAppearance() {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 101; i++) {
            list.add(i);
        }
        int searchedElementIndex = binarySearch.search(list, 3);
        Assertions.assertEquals(2, searchedElementIndex);
    }

    @Test
    void testSearchOfNotPresentElement() {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 101; i++) {
            list.add(i);
        }
        Assertions.assertThrows(NullPointerException.class, () -> binarySearch.search(list, 103));
    }

    @Test
    void testNullAsGivenList() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> binarySearch.search(null, 5));
    }

    @Test
    void testNullAsGivenNumber() {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 101; i++) {
            list.add(i);
        }
        Assertions.assertThrows(IllegalArgumentException.class, () -> binarySearch.search(list, null));
    }

}