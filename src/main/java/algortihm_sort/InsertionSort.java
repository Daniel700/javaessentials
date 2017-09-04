package algortihm_sort;

public class InsertionSort {


    public static int[] sort(int[] array){

        int tmp;

        for (int i = 1; i < array.length; i++) {

            int j = i;
            while (j > 0 && (array[j-1] > array[j])){
                tmp = array[j-1];
                array[j-1] = array[j];
                array[j] = tmp;
                j--;
            }

        }

        return array;
    }


}
