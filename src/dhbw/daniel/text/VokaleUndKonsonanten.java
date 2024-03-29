package dhbw.daniel.text;

import dhbw.daniel.main.Main;
import dhbw.daniel.main.ReadConsole;

import java.io.IOException;

/**
 *  Zählen der Vokale und Konsonanten
 *
 * @author danieljuric
 * @version 1.0
 *      23.10.2019
 */

public class VokaleUndKonsonanten {
    /**
     * Main Methode
     * @param args
     */
    @SuppressWarnings("unused")
    public static void vokaleUndKonsonanten(String[] args) {
        VokaleUndKonsonanten vokaleUndKonsonanten = new VokaleUndKonsonanten();
    }

    /**
     * Eigentliche Methode zum Buchstaben zählen
     *
     * Input ist ein String, der ein Wort oder Satz enthält.
     * Eine for-Schleife geht von Position zu Position und schaut, was das für ein Buchstabe ist
     */
    public static void countLetters() throws IOException {
        System.out.println("Satz zum Zählen eingeben:");
        String input = ReadConsole.readInputString();
        int consonants = 0; // Konsonanten
        int vowels = 0;     // Vokale
        int uml = 0;        // Umlaute
        int leer = 0;       // Satzzeichen

        for (int pos = 0; pos < input.length(); pos++) { // für Position = 0 (Erste Stelle des String); solange position kleiner als Länge des Input; erhöhe Position

            /**
             * Die Schleife geht von Position zu Position. Über einen switch-case wird dann entschieden, welche Variable um 1 erhört wird
             * BSP: Stelle 2 im String ist ein "F": Dann läuft der switch zum case default, da dieser ein Konsonant ist und nicht speziell vorher
             *      als Fall gekennzeichnet wurde.
             */

            switch (input.charAt(pos)) {
                case 'a': case 'e': case 'i': case 'o': case 'u':       // Fall: Vokale
                    vowels++;
                    break;
                case 'ä': case 'ö': case 'ü':                           // Fall: Umlaute
                    uml++;
                    break;
                case ' ': case '!': case '?': case '.': case ',':       // Fall: Satzzeichen
                    leer++;
                    break;
                default:                                                // Fall: Konsonanten (bzw. alles was vorher nicht speziell definiert ist)
                    consonants++;
                    break;
            }
        }

        // Ausgabe der Anzahl der Vokale, Konsonanten, ...
        System.out.println("Der String " + input + "\nhat " + vowels + " Vokale, " + consonants + " Konsonanten, " + uml + " Umlaute und " + leer + " Leerzeichen bzw Satzzeichen \nLänge des Inputs: " + input.length());
        Main main = new Main();
        main.menu(false);
    }


    public static void countWords() {
        System.out.println("Bitte Text eingeben");

        String text = null;
        try {
            text = ReadConsole.readInputString();
        } catch (IOException e) {
            e.printStackTrace();
        }

        text = text.trim();
        int counter = 0;
        for (int pos = 0; pos < text.length(); pos++) {
            if (text.charAt(pos) == ' ' ) {
                counter++;
            }

        }
        counter++;
        System.out.println("Wörter: " +counter);
        Main.menu(false);
    }

}
