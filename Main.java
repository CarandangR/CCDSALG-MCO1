
public class Main {
    public static void main(String[] args) {
        // TODO: Use this method to run your experiments.
        FileReader file = new FileReader();
        SortingAlgorithms Sorter = new SortingAlgorithms();
        //Creation of Record arrays based on given file
        Record[] rand100Ins = file.readFile("C:\\Users\\matth\\Documents\\LASALLECOLLEGE\\Year1Term3\\CCDSALG\\mco\\source\\data\\random100.txt"); //edit depending on storage
        Record[] rand100Selec = file.readFile("C:\\Users\\matth\\Documents\\LASALLECOLLEGE\\Year1Term3\\CCDSALG\\mco\\source\\data\\random100.txt"); //edit depending on storage

        Record[] rand25k = file.readFile("C:\\Users\\matth\\Documents\\LASALLECOLLEGE\\Year1Term3\\CCDSALG\\mco\\source\\data\\random25000.txt");
        Record[] rand50k = file.readFile("C:\\Users\\matth\\Documents\\LASALLECOLLEGE\\Year1Term3\\CCDSALG\\mco\\source\\data\\random50000.txt");
        Record[] rand75k = file.readFile("C:\\Users\\matth\\Documents\\LASALLECOLLEGE\\Year1Term3\\CCDSALG\\mco\\source\\data\\random75000.txt");
        Record[] rand100k = file.readFile("C:\\Users\\matth\\Documents\\LASALLECOLLEGE\\Year1Term3\\CCDSALG\\mco\\source\\data\\random100000.txt");
        Record[] recAlmostSort = file.readFile("C:\\Users\\matth\\Documents\\LASALLECOLLEGE\\Year1Term3\\CCDSALG\\mco\\source\\data\\almostsorted.txt");
        Record[] recTotallyRev = file.readFile("C:\\Users\\matth\\Documents\\LASALLECOLLEGE\\Year1Term3\\CCDSALG\\mco\\source\\data\\totallyreversed.txt");

        long start = System.currentTimeMillis();
        Sorter.insertionSort(rand100Ins, rand100Ins.length);
        long end = System.currentTimeMillis();
        long execTime = end-start;
        System.out.println("\nInsertion Sort Execution time: "+ execTime);

        Sorter.printArr(rand100Selec, rand100Selec.length);
        long start2 = System.currentTimeMillis();
        Sorter.selectionSort(rand100Selec, rand100Selec.length);
        long end2 = System.currentTimeMillis();
        long execTime2 = end2-start2;
        //Sorter.allSorts(rand100);
        System.out.println("\nSelection Sort Execution time: "+ execTime2);
    }

}



