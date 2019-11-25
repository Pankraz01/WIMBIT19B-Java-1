package dhbw.daniel.text;

import dhbw.daniel.main.Main;
import dhbw.daniel.main.ReadConsole;

import java.io.IOException;

/**
 *  Die Zeichen eines String werden vertauscht
 *
 * @author danieljuric
 * @version 1.0
 *      23.10.2019
 */

public class TextUmkehren {
    /**
     * Main Methode
     * @param args
     * @deprecated Wird nicht benutzt
     */
    @SuppressWarnings("unused")
    public static void textUmkehren(String[] args) {
        TextUmkehren textUmkehren = new TextUmkehren(); // Wird nicht benutzt
    }

    /**
     * Eigentliche Methode zum Text umkehren
     *
     * Hier wird ein Input mit einem Text gegeben und ein Result, welches am Anfang leer ist.
     * Die for-Schleife macht nichts anderes als den Text von hinten nach Vorne durchzugehen
     */
    public static void changeText() throws IOException {
        String result = "";

        /**
         * Input für zum Umkehren
         */
        System.out.println("Bitte Text zum Umkehren eingeben");
        String input = ReadConsole.readInputString();

        for (int pos = input.length(); pos > 0; pos--) { // für Position = Länge des Textes; Solange Position größer 0; verrigere Position um 1

            /**
             * Der String inputTeil enthält immer genau 1 Zeichen, welches durch die Position aus der for-Schleife
             * festgelegt ist.
             *
             * Demnach wird hier bei der Letzten Stelle angefangen und dann zwischen gespeichert (später in Result), die Position
             * um eins Verringert und wiederholt
             *
             * ACHTUNG: Die erste Stelle eines Strings hat die Position 0, aber die Länge 1. Demnach wollen wir
             *          Länge - 1 um die Position zu erhalten
             * String.valueOf() ändert input.charAt() vom Typ Character in Typ String, da man in der Variable Character
             * nur 1 Zeichen speichern kann
             */
            String inputTeil = String.valueOf(input.charAt(pos-1));  // Parsing Char to String

            /**
             * Füge nach jedem Durchlauf den Letzten Buchstaben nach vorn.
             */
            result = result + inputTeil;


        }
        // Ausgabe des Result
        System.out.println(result);
        Main main = new Main();
        main.menu(false);

    }
}
