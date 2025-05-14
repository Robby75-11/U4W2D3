import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Esercizio2 {
    /**
     * Funzione che accetta un intero N e restituisce una lista ordinata
     * di N interi casuali da 0 a 100.
     *
     * @param n Il numero di interi casuali da generare.
     * @return Una lista ordinata di N interi casuali.
     */
    public static List<Integer> generaListaOrdinata(int n) {
        List<Integer> lista = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            lista.add(random.nextInt(101)); // Genera numeri casuali tra 0 (incluso) e 101 (escluso)
        }
        Collections.sort(lista);
        return lista;
    }

    /**
     * Funzione che accetta una lista di interi e restituisce una nuova lista
     * composta dagli elementi della prima lista seguiti dagli stessi elementi
     * disposti in ordine inverso.
     *
     * @param listaOriginale La lista di interi originale.
     * @return Una nuova lista con gli elementi originali seguiti dagli stessi in ordine inverso.
     */
    public static List<Integer> concatenaInversa(List<Integer> listaOriginale) {
        List<Integer> listaConcatenata = new ArrayList<>(listaOriginale);
        List<Integer> listaInversa = new ArrayList<>(listaOriginale);
        Collections.reverse(listaInversa);
        listaConcatenata.addAll(listaInversa);
        return listaConcatenata;
    }

    /**
     * Funzione che accetta una lista di interi e un booleano:
     * se il booleano è true stampa i valori in posizioni pari,
     * altrimenti stampa i valori in posizioni dispari.
     * (Si considera la posizione iniziale 0 come pari).
     *
     * @param lista   La lista di interi da stampare.
     * @param stampaPari True per stampare elementi in posizioni pari, false per posizioni dispari.
     */
    public static void stampaPerPosizione(List<Integer> lista, boolean stampaPari) {
        System.out.println("Stampa elementi in posizioni " + (stampaPari ? "pari" : "dispari") + ":");
        for (int i = 0; i < lista.size(); i++) {
            if ((stampaPari && i % 2 == 0) || (!stampaPari && i % 2 != 0)) {
                System.out.print(lista.get(i) + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 10; // Esempio: genera una lista di 10 numeri casuali

        // Utilizzo della prima funzione
        List<Integer> listaOrdinata = generaListaOrdinata(n);
        System.out.println("Lista ordinata di " + n + " numeri casuali: " + listaOrdinata);

        // Utilizzo della seconda funzione
        List<Integer> listaConcatenata = concatenaInversa(listaOrdinata);
        System.out.println("Lista concatenata con ordine inverso: " + listaConcatenata);

        // Utilizzo della terza funzione (stampa posizioni pari)
        stampaPerPosizione(listaConcatenata, true);

        // Utilizzo della terza funzione (stampa posizioni dispari)
        stampaPerPosizione(listaConcatenata, false);
    }

}
