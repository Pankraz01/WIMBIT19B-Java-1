package dhbw.daniel.main;

/**
 * Sammelklasse für kleine Mathematische Berechnungen
 * - Prüfen ob Zahl gerade ist
 * - Zahl Faktorisieren
 *
 * @author danieljuric
 * @version 1.0
 *      24.10.2019
 */
public class Paritaetest {

    /**
     * Methode zum prüfen, ob eine Zahl gerade oder ungerade ist.
     * hierbei wird die Zahl Modulo 2 genommen, wenn das 0 ist, dann ist die Zahl
     * durch 2 Teilbar und dementsprechend gerade
     */
    public static void isEven() {
        Main main = new Main();

        System.out.println("Geben Sie eine Zahl ein");
        int number = ReadConsole.readInputInt();

        if (number % 2 == 0) {
            System.out.println("Die Zahl " + number + " ist gerade");
            main.menu(false);
            return;
        }
        System.out.println("Die Nummer " + number + " ist ungerade");
        main.menu(false);

    }

    /**
     * Methode zum Faktorisieren einer Zahl
     *
     * Es wird eine Zahl angegeben, die in einer For-Schleife Faktorisiert wird
     */
    public static void factorial() {
        long result = 1;

        System.out.println("Bitte Zahl zum Faktorieren eingeben");
        int number = ReadConsole.readInputInt();                    // Input

        for (int factor = 2; factor <= number; factor++) { // Für faktor 2; solange faktor kleiner gleich nummer der Faktorisierenden Zahl; erhöhe Faktor um 1
            result *= factor;
        }
        /**
         * Wenn das Ergebnis kleiner 0 ist, dann ist die Zahl zu groß für den Datentyp Ingeter gewesen. Dies wird dann ausgegeben
         */
        if (result < 0) {
            System.out.println("Integer Overflow. Das Limit wurde erreicht!");
            Main main = new Main();
            main.menu(false);
            return;
        }
        System.out.println("Faktorisiert macht die Zahl " + number + ": " + result); // Output

        Main main = new Main();
        main.menu(false);

    }
}
