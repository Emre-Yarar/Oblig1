package no.oslomet.cs.algdat.Oblig1.Hjelpevariabler;

public class Sortering {


    public static void quickSort(int[] a, int start, int slutt) {

        if (start < slutt) {

            int partisjonIndeks = partisjonering(a, start, slutt);

            quickSort(a, start, partisjonIndeks-1);
            quickSort(a, partisjonIndeks+1, slutt);

        }

    }


    public static int partisjonering(int[] a, int start, int slutt) {

        int pivot = a[slutt];
        int i = (start - 1);

        for (int j = start; j < slutt; j++) {

            if (a[j] <= pivot) {

                i++;

                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;

            }

        }

        int temp = a[i + 1];
        a[i + 1] = a[slutt];
        a[slutt] = temp;

        return i + 1;

    }

}
