/* This file contains implementations of sorting algorithms.
 * You are NOT allowed to modify any of the given method headers.
 */


public class SortingAlgorithms {

    /*
     * You may define additional helper functions here if you need to.
     * Make sure the helper functions have the private access modifier, as
     * they will only be used in this class.
     */

    public void insertionSort(Record[] arr, int n) {
        // TODO: Implement this sorting algorithm here.
        int i, j;
        Record key = null;
        for(i = 1; i < n; i++)
        {
            key = arr[i];
            j = i - 1;
            while(j >= 0 && arr[j].getIdNumber() > key.getIdNumber())
            {
                arr[j+1] = arr[j];
                j = j - 1;
            }
            System.out.println("\nkey ID: " + key.getIdNumber());
            arr[j+1] = key;
        }
        printArr(arr, n);
    }

    public void selectionSort(Record[] arr, int n) {
        // TODO: Implement this sorting algorithm here.
        int i, j, minIndex;
        for(i = 0; i < n; i++)
        {
            minIndex = i;
            for(j = i+1; j < n; j++)
            {
                if (arr[minIndex].getIdNumber() > arr[j].getIdNumber())
                {
                    minIndex = j;
                }
                System.out.println(arr[minIndex].getIdNumber() + " " + arr[j].getIdNumber());
            }
            Record minim = new Record("", 0);
            minim = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = minim;
        }
        printArr(arr, n);
    }

    public void mergeSort(Record[] arr, int p, int r) {
        // TODO: Implement this sorting algorithm here.

    }

    /*
     * Define AT LEAST ONE more sorting algorithm here, apart from the
     * ones given above. Make sure that the method accepts an array of
     * records
     */
    public void printArr(Record[] arr, int size)
    {
        int i;
        for(i = 0; i < size; i++)
        {
            System.out.println(i + " " + arr[i].getIdNumber() + " " +arr[i].getName());
        }
    }
}