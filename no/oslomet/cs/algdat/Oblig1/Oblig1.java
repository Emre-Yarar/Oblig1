package no.oslomet.cs.algdat.Oblig1;
// Emre Yarar s314635
////// Løsningsforslag Oblig 1 ////////////////////////

import Hjelpevariabler.Sortering;

import java.util.ArrayList;


public class Oblig1 {

    private Oblig1() {
    }

    ///// Oppgave 1 //////////////////////////////////////
    public static int maks(int[] a) {

        if (a.length == 0)

            throw new java.util.NoSuchElementException("Tabellen er tom!");

        for (int i = 1; i < a.length; i++) {

            if (a[i - 1] > a[i]) {

                int temp = a[i];
                a[i] = a[i - 1];
                a[i - 1] = temp;

            }
        }
        return a[a.length - 1];
    }


    public static int ombyttinger(int[] a) {

        if (a.length == 0)

            throw new java.util.NoSuchElementException("Tabellen er tom!");

        int ombyttinger = 0;

        for (int i = 1; i < a.length; i++) {

            if (a[i - 1] > a[i]) {

                int temp = a[i];
                a[i] = a[i - 1];
                a[i - 1] = temp;
                ombyttinger++;

            }
        }
        return ombyttinger;
    }

    ///// Oppgave 2 //////////////////////////////////////
    public static int antallUlikeSortert(int[] a) {

        int antallUlike = 0;

        if (a.length == 0) {

            return antallUlike;

        } else {

            antallUlike = 1;

        }

        for (int i = 1; i < a.length; i++) {

            if (a[i - 1] > a[i]) {

                throw new IllegalStateException("Tabellen er ikke sortert i stigende rekkefolge!");

            }

            ArrayList<Integer> forskjelligeNummer = new ArrayList<>();

            for (int k : a) {

                if (!forskjelligeNummer.contains(k)) {

                    forskjelligeNummer.add(k);

                }

            }

            antallUlike = forskjelligeNummer.size();
        }

        return antallUlike;

    }


    ///// Oppgave 3 //////////////////////////////////////
    public static int antallUlikeUsortert(int[] a) {

        if (a.length == 0)

            return 0;

        int like = 0;

        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {

                if (a[j] == a[i])
                    like++;

            }

        }

        if (a.length - like < 0) {

            return -1 * (a.length - like);

        }

        return a.length - like;

    }

    ///// Oppgave 4 //////////////////////////////////////
    public static void delsortering(int[] a) {

        int oddeTallIndeks = 0;

        int temp;

        for (int i = 0; i < a.length; i++) {

            if ((Math.abs(a[i]) % 2) != 0) {

                temp = a[oddeTallIndeks];
                a[oddeTallIndeks++] = a[i];
                a[i] = temp;

            }
        }

        Sortering.quickSort(a, 0, oddeTallIndeks - 1);
        Sortering.quickSort(a, oddeTallIndeks, a.length - 1);

    }


    ///// Oppgave 5 //////////////////////////////////////
    public static void rotasjon(char[] a) {

        if (a.length == 0)
            return;

        char temp = a[a.length - 1];

        for (int i = a.length - 1; i > 0; i--) {

            a[i] = a[i - 1];

        }

        a[0] = temp;

    }

    ///// Oppgave 6 //////////////////////////////////////
    public static void rotasjon(char[] a, int k) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 7 //////////////////////////////////////
    /// 7a)
    public static String flett(String s, String t) {
        throw new UnsupportedOperationException();
    }

    /// 7b)
    public static String flett(String... s) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 8 //////////////////////////////////////
    public static int[] indekssortering(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 9 //////////////////////////////////////
    public static int[] tredjeMin(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 10 //////////////////////////////////////
    public static int bokstavNr(char bokstav) {
        throw new UnsupportedOperationException();
    }

    public static boolean inneholdt(String a, String b) {
        throw new UnsupportedOperationException();
    }

}  // Oblig1
