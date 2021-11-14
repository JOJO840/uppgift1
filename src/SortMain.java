

public class SortMain {
    public static void main(String[] args) {

        int[] nyLista = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            nyLista[i] = Integer.parseInt(args[i]);
        }
            //  gör en instans av klassen Sorter
        Sorter sorter = new Sorter();

            // returnerar en lista till klassen
       int[] SortList = sorter.sort(nyLista);

       // testar git




    }

}

