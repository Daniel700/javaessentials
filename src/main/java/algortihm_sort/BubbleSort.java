package algortihm_sort;

public class BubbleSort {

    public static int[] sort(int[] array){


        for (int i = 0; i < array.length-1; i++) {

            for (int j = i+1; j < array.length; j++) {

                if (array[i] > array[j]){
                    int tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }

            }

        }

        return array;
    }


}
