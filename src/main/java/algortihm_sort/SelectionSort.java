package algortihm_sort;

public class SelectionSort {


    public static int[] sort(int[] array) {

        for (int i = 0; i < array.length-1; i++) {

            //assume minimum is the first element
            int minimum = i;

            for (int j = i+1; j < array.length; j++) {
                //find minimum in array
                if (array[j] < array[minimum])
                    minimum = j;
            }

            //Swap minimum to front
            int tmp = array[i];
            array[i] = array[minimum];
            array[minimum] = tmp;

        }

        return array;
    }


}
