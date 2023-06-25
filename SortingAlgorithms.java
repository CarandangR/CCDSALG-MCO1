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
            }
            Record minim = new Record("", 0);
            minim = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = minim;
        }
    }

    private void merge(Record[] arr, int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;
 
        Record[] L = new Record[n1];
        Record[] R = new Record[n2];
 
        for (int i=0; i<n1; ++i)
        {
            L[i] = arr[l + i];
        }
        for (int j=0; j<n2; ++j)
        {
            R[j] = arr[m + 1+ j];
        }

        int i = 0, j = 0;
        int k = l;

        while (i < n1 && j < n2)
        {
            if (L[i].getIdNumber() <= R[j].getIdNumber())
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
 
    public void mergeSort(Record[] arr, int l, int r)
    {
        if (l < r)
        {
            int m = (l+r)/2;
            mergeSort(arr, l, m);
            mergeSort(arr , m+1, r);
            merge(arr, l, m, r);
        }
    }

    /*
     * Define AT LEAST ONE more sorting algorithm here, apart from the
     * ones given above. Make sure that the method accepts an array of
     * records
     */

    public void shellSort(Record[] arr)
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
}