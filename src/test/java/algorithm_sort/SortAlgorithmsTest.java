package algorithm_sort;

import algortihm_sort.BubbleSort;
import algortihm_sort.InsertionSort;
import algortihm_sort.SelectionSort;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class SortAlgorithmsTest {

    int[] unsortedArray;
    int[] sortedArray;

    @Before
    public void setUp() throws Exception {
        unsortedArray = new int[]{5,7,3,1,0,8,3,3,2};
        sortedArray = new int[]{0,1,2,3,3,3,5,7,8};
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testInsertionSort() throws Exception {

        System.out.println("Insertion Sort");
        System.out.println("Original Array: " + Arrays.toString(unsortedArray));
        System.out.println("Sorted Array: " + Arrays.toString(InsertionSort.sort(unsortedArray)));
        System.out.println("");

        Assert.assertArrayEquals(sortedArray, InsertionSort.sort(unsortedArray));

    }

    @Test
    public void testSelectionSort() throws Exception {

        System.out.println("Selection Sort");
        System.out.println("Original Array: " + Arrays.toString(unsortedArray));
        System.out.println("Sorted Array: " + Arrays.toString(SelectionSort.sort(unsortedArray)));
        System.out.println("");

        Assert.assertArrayEquals(sortedArray, SelectionSort.sort(unsortedArray));

    }

    @Test
    public void testBubbleSort() throws Exception {

        System.out.println("Bubble Sort");
        System.out.println("Original Array: " + Arrays.toString(unsortedArray));
        System.out.println("Sorted Array: " + Arrays.toString(BubbleSort.sort(unsortedArray)));
        System.out.println("");

        Assert.assertArrayEquals(sortedArray, BubbleSort.sort(unsortedArray));

    }


}
