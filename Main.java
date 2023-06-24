import java.util.Scanner;

public class Main {
    public static void main(String[] args) 
    {
        // TODO: Use this method to run your experiments.
        int controlVariable = 1;
        int choice;
        long startTime = 0, endTime = 0;
        long[] executionTime = new long[5];
        //Change file doc string if you changed your dircetory.
        String filedoc = "C:/Users/matth/Documents/LASALLECOLLEGE/Year1Term3/CCDSALG/mco/source";
        FileReader file = new FileReader();
        SortingAlgorithms Sorter = new SortingAlgorithms();
        do
        {
            Scanner sc = new Scanner(System.in);
            do
            {
                choice = sc.nextInt();
                System.out.println("Pick option to generate text files:");
                System.out.println("[1] Insertion Sort\n[2] Selection Sort");
                System.out.println("[3] Merge Sort\n[4] Shell Sort\n[0] Exit");
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
            Record[] recTotallyRev = file.readFile(filedoc+"/data/totallyreversed.txt\"");

            if(choice == 1)
            {
                startTime = System.currentTimeMillis();
                Sorter.insertionSort(rand100, rand100.length);
                endTime = System.currentTimeMillis();
                executionTime[0] = endTime = startTime;
                startTime = System.currentTimeMillis();
                Sorter.insertionSort(rand25k, rand25k.length);
                endTime = System.currentTimeMillis();
                executionTime[1] = endTime = startTime;
                startTime = System.currentTimeMillis();
                Sorter.insertionSort(rand50k, rand50k.length);
                endTime = System.currentTimeMillis();
                executionTime[2] = endTime = startTime;
                startTime = System.currentTimeMillis();
                Sorter.insertionSort(rand75k, rand75k.length);
                endTime = System.currentTimeMillis();
                executionTime[3] = endTime = startTime;
                startTime = System.currentTimeMillis();
                Sorter.insertionSort(rand100k, rand100k.length);
                endTime = System.currentTimeMillis();
                executionTime[4] = endTime = startTime;
                startTime = System.currentTimeMillis();
                Sorter.insertionSort(recAlmostSort, recAlmostSort.length);
                endTime = System.currentTimeMillis();
                executionTime[5] = endTime = startTime;
                startTime = System.currentTimeMillis();
                Sorter.insertionSort(recTotallyRev, recTotallyRev.length);
                endTime = System.currentTimeMillis();
                executionTime[6] = endTime = startTime;
            }

            else if(choice == 2)
            {
                
            }

            else if(choice == 3)
            {
                
            }

            else if(choice == 4)
            {
                
            }
        }while(controlVariable>0);
    }
}



