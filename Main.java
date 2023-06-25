import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void outputfile (String filename, Record[] record)
    {
        try {
            FileWriter output = new FileWriter(filename);
            int i;
            for(i = 0; i < record.length; i++)
            {
                output.write(i + " " + record[i].getIdNumber() + " " +record[i].getName());
                output.write("\n");
            }
            output.close();
        } catch (IOException e){
            System.out.println("Error creating file: " + e.getMessage());
        }
    }
    public static void main(String[] args) 
    {
        // TODO: Use this method to run your experiments.
        int controlVariable = 1;
        int choice;
        long startTime = 0, endTime = 0;
        String algoUsed="";
        long[] executionTime = new long[7];
        boolean isSorted = false;
        //Change file doc string if you changed your dircetory.
        String filedoc = "C:/Users/matth/Documents/LASALLECOLLEGE/Year1Term3/CCDSALG/mco/source";
        FileReader file = new FileReader();
        SortingAlgorithms Sorter = new SortingAlgorithms();
        Scanner sc = new Scanner(System.in);
        do
        {
            do
            {
                System.out.println("Pick option to generate text files:");
                System.out.println("[1] Insertion Sort\n[2] Selection Sort");
                System.out.println("[3] Merge Sort\n[4] Shell Sort\n[0] Exit");
                choice = sc.nextInt();
                if(choice == 0)
                {
                    System.out.println("Terminating Program");
                    controlVariable = 0;
                }
                else if(choice < 0 || choice > 5)
                {
                    System.out.println("Invalid Option");
                }
            }while(choice < 0 || choice > 5);
            Record[] rand100 = file.readFile(filedoc+"/data/random100.txt");
            Record[] rand25k = file.readFile(filedoc+"/data/random25000.txt");
            Record[] rand50k = file.readFile(filedoc+"/data/random50000.txt");
            Record[] rand75k = file.readFile(filedoc+"/data/random75000.txt");
            Record[] rand100k = file.readFile(filedoc+"/data/random100000.txt");
            Record[] recAlmostSort = file.readFile(filedoc+"/data/almostsorted.txt");
            Record[] recTotallyRev = file.readFile(filedoc+"/data/totallyreversed.txt");

            if(choice == 1)
            {
                startTime = System.currentTimeMillis();
                Sorter.insertionSort(rand100, rand100.length);
                endTime = System.currentTimeMillis();
                executionTime[0] = endTime - startTime;

                startTime = System.currentTimeMillis();
                Sorter.insertionSort(rand25k, rand25k.length);
                endTime = System.currentTimeMillis();
                executionTime[1] = endTime - startTime;

                startTime = System.currentTimeMillis();
                Sorter.insertionSort(rand50k, rand50k.length);
                endTime = System.currentTimeMillis();
                executionTime[2] = endTime - startTime;

                startTime = System.currentTimeMillis();
                Sorter.insertionSort(rand75k, rand75k.length);
                endTime = System.currentTimeMillis();
                executionTime[3] = endTime - startTime;

                startTime = System.currentTimeMillis();
                Sorter.insertionSort(rand100k, rand100k.length);
                endTime = System.currentTimeMillis();
                executionTime[4] = endTime - startTime;

                startTime = System.currentTimeMillis();
                Sorter.insertionSort(recAlmostSort, recAlmostSort.length);
                endTime = System.currentTimeMillis();
                executionTime[5] = endTime - startTime;

                startTime = System.currentTimeMillis();
                Sorter.insertionSort(recTotallyRev, recTotallyRev.length);
                endTime = System.currentTimeMillis();
                executionTime[6] = endTime - startTime;

                algoUsed = "Insertion";
                isSorted = true;
            }

            else if(choice == 2)
            {
                startTime = System.currentTimeMillis();
                Sorter.selectionSort(rand100, rand100.length);
                endTime = System.currentTimeMillis();
                executionTime[0] = endTime - startTime;

                startTime = System.currentTimeMillis();
                Sorter.selectionSort(rand25k, rand25k.length);
                endTime = System.currentTimeMillis();
                executionTime[1] = endTime - startTime;

                startTime = System.currentTimeMillis();
                Sorter.selectionSort(rand50k, rand50k.length);
                endTime = System.currentTimeMillis();
                executionTime[2] = endTime - startTime;

                startTime = System.currentTimeMillis();
                Sorter.selectionSort(rand75k, rand75k.length);
                endTime = System.currentTimeMillis();
                executionTime[3] = endTime - startTime;

                startTime = System.currentTimeMillis();
                Sorter.selectionSort(rand100k, rand100k.length);
                endTime = System.currentTimeMillis();
                executionTime[4] = endTime - startTime;

                startTime = System.currentTimeMillis();
                Sorter.selectionSort(recAlmostSort, recAlmostSort.length);
                endTime = System.currentTimeMillis();
                executionTime[5] = endTime - startTime;

                startTime = System.currentTimeMillis();
                Sorter.selectionSort(recTotallyRev, recTotallyRev.length);
                endTime = System.currentTimeMillis();
                executionTime[6] = endTime - startTime;

                algoUsed = "Selection";
                isSorted = true;
            }

            else if(choice == 3)
            {
                startTime = System.currentTimeMillis();
                Sorter.mergeSort(rand100, 0, rand100.length-1);
                endTime = System.currentTimeMillis();
                executionTime[0] = endTime - startTime;

                startTime = System.currentTimeMillis();
                Sorter.mergeSort(rand25k, 0, rand25k.length-1);
                endTime = System.currentTimeMillis();
                executionTime[1] = endTime - startTime;

                startTime = System.currentTimeMillis();
                Sorter.mergeSort(rand50k, 0, rand50k.length-1);
                endTime = System.currentTimeMillis();
                executionTime[2] = endTime - startTime;

                startTime = System.currentTimeMillis();
                Sorter.mergeSort(rand75k, 0, rand75k.length-1);
                endTime = System.currentTimeMillis();
                executionTime[3] = endTime - startTime;

                startTime = System.currentTimeMillis();
                Sorter.mergeSort(rand100k, 0, rand100k.length-1);
                endTime = System.currentTimeMillis();
                executionTime[4] = endTime - startTime;

                startTime = System.currentTimeMillis();
                Sorter.mergeSort(recAlmostSort, 0, recAlmostSort.length-1);
                endTime = System.currentTimeMillis();
                executionTime[5] = endTime - startTime;

                startTime = System.currentTimeMillis();
                Sorter.mergeSort(recTotallyRev, 0, recTotallyRev.length-1);
                endTime = System.currentTimeMillis();
                executionTime[6] = endTime - startTime;

                algoUsed = "Merge";
                isSorted = true;
            }

            else if(choice == 4)
            {
                startTime = System.currentTimeMillis();
                Sorter.shellSort(rand100);
                endTime = System.currentTimeMillis();
                executionTime[0] = endTime - startTime;

                startTime = System.currentTimeMillis();
                Sorter.shellSort(rand25k);
                endTime = System.currentTimeMillis();
                executionTime[1] = endTime - startTime;

                startTime = System.currentTimeMillis();
                Sorter.shellSort(rand50k);
                endTime = System.currentTimeMillis();
                executionTime[2] = endTime - startTime;

                startTime = System.currentTimeMillis();
                Sorter.shellSort(rand75k);
                endTime = System.currentTimeMillis();
                executionTime[3] = endTime - startTime;

                startTime = System.currentTimeMillis();
                Sorter.shellSort(rand100k);
                endTime = System.currentTimeMillis();
                executionTime[4] = endTime - startTime;

                startTime = System.currentTimeMillis();
                Sorter.shellSort(recAlmostSort);
                endTime = System.currentTimeMillis();
                executionTime[5] = endTime - startTime;

                startTime = System.currentTimeMillis();
                Sorter.shellSort(recTotallyRev);
                endTime = System.currentTimeMillis();
                executionTime[6] = endTime - startTime;

                algoUsed = "Shell";
                isSorted = true;
            }

            if(isSorted == true)
            {
                System.out.println(algoUsed+" Sort Run Times:");
                System.out.println("Random 100: "+executionTime[0]);
                System.out.println("Random 25k: "+executionTime[1]);
                System.out.println("Random 50k: "+executionTime[2]);
                System.out.println("Random 75k: "+executionTime[3]);
                System.out.println("Random 100k: "+executionTime[4]);
                System.out.println("Random Almost Sorted: "+executionTime[5]);
                System.out.println("Random Totally Reversed: "+executionTime[6]);

                outputfile (algoUsed+"Rand100.txt", rand100);
                outputfile (algoUsed+"Rand25k.txt", rand25k);
                outputfile (algoUsed+"Rand50k.txt", rand50k);
                outputfile (algoUsed+"Rand75k.txt", rand75k);
                outputfile (algoUsed+"Rand100k.txt", rand100k);
                outputfile (algoUsed+"almostsorted.txt", recAlmostSort);
                outputfile (algoUsed+"totallyreversed.txt", recTotallyRev);
                System.out.println("Check folder for the output .txt file. ");
                choice = -1;
                isSorted = false;
            }
        }while(controlVariable>0);

        sc.close();
    }
}