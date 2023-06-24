/* This file contains implementations of sorting algorithms.
 * You are NOT allowed to modify any of the given method headers.
 */


public class SortingAlgorithms 
{

    /*
     * You may define additional helper functions here if you need to.
     * Make sure the helper functions have the private access modifier, as
     * they will only be used in this class.
     */

    public void insertionSort(Record[] arr, int n) 
    {
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
    }

    public void selectionSort(Record[] arr, int n) 
    {
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
    }

    public void mergeSort(Record[] arr, int p, int r) 
    {
        // TODO: Implement this sorting algorithm here.
        int q;
        if(p < r)
        {
            q = (p + r)/2;

            mergeSort(arr, p, q);
            mergeSort(arr, q+1, r);
            merge(arr, p, q, r);
        }
    }

    /*
     * Define AT LEAST ONE more sorting algorithm here, apart from the
     * ones given above. Make sure that the method accepts an array of
     * records
     */

     public  void shellSort(Record[] arr)
     {
        int n = arr.length;
        int i, j, gap;
        Record tempRecord = new Record("null", 0);
        
        for(gap = n / 2; gap > 0; gap /= 2)
        {
            for(i = gap; i < n; i++)
            {
                tempRecord = arr[i];
                j = i;

                while(j >= gap && arr[j - gap].getIdNumber() > tempRecord.getIdNumber())
                {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }

                arr[j] = tempRecord;
            }
        }
     }

     private void merge(Record[] arr, int p, int q, int r) 
     {
        int sizeL = q - p + 1, sizeR = r - q + 1;
        Record[] arrL = new Record[sizeL];
        Record[] arrR = new Record[sizeR];

        for(int i = 0; i < sizeL; i++)
        {
            arrL[i] = arr[p+i];
        }
        for(int i = 0; i < sizeR; i++)
        {
            arrR[i] = arr[q + 1 + i];
        }

        int i = 0, j = 0, k = p;

        while(i < sizeL && j < sizeR)
        {
            if(arrL[i].getIdNumber() <= arrR[j].getIdNumber()) 
            {
                arr[k] = arrL[i];
                i++;
            }
            else 
            {
                arr[k] = arrR[j];
                j++;
            }
            k++;
        }

        while(i < sizeL) 
        {
            arr[k] = arrL[i];
            i++;
            k++;
        }
        while(j < sizeR) 
        {
            arr[k] = arrR[j];
            j++;
            k++;
        }
    }
}