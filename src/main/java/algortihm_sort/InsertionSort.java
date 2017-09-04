package algortihm_sort;

public class InsertionSort {


    public static int[] sort(int[] array){

        int tmp;

        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {

                if (array[j-1] > array[j]){
                    tmp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = tmp;
                }

            }
        }

        return array;
    }


}
