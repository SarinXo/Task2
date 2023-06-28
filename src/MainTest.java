import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testMinElementInShiftedArr(){
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(1, Main.minElementInShiftedArr(arr1));

        int[] arr2 = {9, 1, 2, 3, 4, 5, 6, 7, 8};
        assertEquals(1, Main.minElementInShiftedArr(arr2));

        int[] arr3 = {2, 3, 4, 5, 6, 7, 8, 9, 1};
        assertEquals(1, Main.minElementInShiftedArr(arr3));

        int[] arr4 = {9, 10, 1, 2, 3, 4, 5, 6, 7, 8};
        assertEquals(1, Main.minElementInShiftedArr(arr4));

        int[] arr5 = {2, 3, 4, 5, 6, 7, 8, 9, 10, 1};
        assertEquals(1, Main.minElementInShiftedArr(arr5));

        int[] arr6 = {2, 2, 2, 2};
        assertEquals(2, Main.minElementInShiftedArr(arr6));

        int[] arr7 = {9};
        assertEquals(9, Main.minElementInShiftedArr(arr7));

        int[] arr8 = {2, 1, 2, 2, 2, 2};
        assertEquals(1, Main.minElementInShiftedArr(arr8));
    }

}