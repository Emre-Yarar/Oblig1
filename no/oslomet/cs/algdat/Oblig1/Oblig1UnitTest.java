package no.oslomet.cs.algdat.Oblig1;

import jdk.swing.interop.SwingInterOpUtils;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Denne klassen kan du bruke til hjelp under utvikling av din oblig.
 * Lag små og enkle test-eksempler for å teste at metoden din fungerer som ønsket.
 */
class Oblig1UnitTest {

    @org.junit.jupiter.api.Test
    void maks() {

        int[] a = {23, 200, 13, 65, 11, 62, 76, 83, 9, 71, 84, 34, 96, 80};

        assertEquals(200, Oblig1.maks((a)));

    }

    @org.junit.jupiter.api.Test
    void ombyttinger() {

        int[] beste = {0, 1, 2, 3};
        assertEquals(0, Oblig1.ombyttinger(beste));


        int[] verste = {3, 2, 1, 0};
        assertEquals(3, Oblig1.ombyttinger(verste));

    }

    @org.junit.jupiter.api.Test
    void antallUlikeSortert() {

        int[] a = {3, 3, 4, 5, 5, 6, 7, 7, 7, 8};
        assertEquals(6, Oblig1.antallUlikeSortert(a));

        int[] b = {0};
        assertEquals(1, Oblig1.antallUlikeSortert(b));

        int[] c = {0, 0};
        assertEquals(1, Oblig1.antallUlikeSortert(c));
    }

    @org.junit.jupiter.api.Test
    void antallUlikeUsortert() {

        int[] a = {};
        assertEquals(0, Oblig1.antallUlikeUsortert(a));

        int[] b = {1};  // skal ikke kaste unntak her!
        assertEquals(1, Oblig1.antallUlikeUsortert(b));

        int[] c = {1, 1};
        assertEquals(1, Oblig1.antallUlikeUsortert(c));

        int[] d = {6, 2, 4, 6, 9, 1, 4, 9, 10};
        assertEquals(6, Oblig1.antallUlikeUsortert(d));

        int[] e = {5, 4, 3, 2, 1};
        assertEquals(5, Oblig1.antallUlikeUsortert(e));

        int[] f = {1, 2, 2, 2, 2, 2, 3};
        assertEquals(3, Oblig1.antallUlikeUsortert(f));

    }


    @org.junit.jupiter.api.Test
    void delsortering() {
        assertEquals(true, false, "Implementer delsortering og denne testen");
    }

    @org.junit.jupiter.api.Test
    void rotasjon() {

        char[] a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        char[] a0 = {'J','A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};

        Oblig1.rotasjon(a);
        assertEquals(a[0], a0[0]);

    }

    @org.junit.jupiter.api.Test
    void flett() {
        assertEquals(true, false, "Implementer flett og denne testen");
    }

    @org.junit.jupiter.api.Test
    void indekssortering() {
        assertEquals(true, false, "Implementer indekssortering og denne testen");
    }

    @org.junit.jupiter.api.Test
    void tredjeMin() {
        assertEquals(true, false, "Implementer tredjeMin og denne testen");
    }

    @org.junit.jupiter.api.Test
    void bokstavNr() {
        assertEquals(true, false, "Implementer bokstavNr og denne testen");
    }

    @org.junit.jupiter.api.Test
    void inneholdt() {
        assertEquals(true, false, "Implementer inneholdt og denne testen");
    }
}