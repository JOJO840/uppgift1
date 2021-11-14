

public class SortMain {
    public static void main(String[] args) {

        int[] nyLista = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            nyLista[i] = Integer.parseInt(args[i]);
            System.out.println(nyLista[i]);

        }

    }

}

