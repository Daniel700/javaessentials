package algorithm_sort;

import algortihm_sort.InsertionSort;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class SortAlgorithmsTest {

    int[] array1;
    int[] sortedArray;

    @Before
    public void setUp() throws Exception {
        array1 = new int[]{5,7,3,1,0,8,3,3,2};
        sortedArray = new int[]{0,1,2,3,3,3,5,7,8};
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testInsertionSort() throws Exception {

        System.out.println("Original Array: " + Arrays.toString(array1));
        System.out.println("Sorted Array: " + Arrays.toString(InsertionSort.sort(array1)));

        Assert.assertArrayEquals(sortedArray, InsertionSort.sort(array1));

    }


}
