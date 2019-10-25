package dhbw.daniel.main;

/**
 * Berechnung von Pi
 *
 * @author danieljuric
 * @version 1.0
 *      24.10.2019
 */
public class PiBerechnen {

    // Statische Variable Pi. Keit Wert enthalten.
    static double pi;

    /**
     * Main Methode wird nicht verwendet
     * @param args
     */
    public static void piBerechnen(String[] args) {
        PiBerechnen piBerechnen = new PiBerechnen();
    }

    /**
     * Methode zur Berechnung von Pi
     */
    public static void calcPi() {
        /**
         * Die For-Schleife berechnet 10 Millionen Mal die Formel zur Berechnung von Pi.
         * Dabei wird der Wert an 3,14159262... angenähert. Die Formel ist Rekursiv, da jede
         * Annäherung in den Vorherigen Wert addiert werden muss. Ist dies nicht der Fall, also wird der
         * vorherige Wert nicht dazu addiert, so erhalten wir nur ein Zwischenergebnis aus der Summenformel
         *
         * Der Input gibt an, wie oft, die For-Schleife laufen soll. Je höher, desto genauer, desto, langsamer die Rechnung
         */
        System.out.println("Bitte Anzahl der Wiederholungen angeben:");
        double duration = ReadConsole.readInputDouble();
        for (double i = 0; i < duration; i++) { // Für i = 0; solange i kleiner als eingegebene Duration; Erhöhre i um 1

            pi = pi + ((Math.pow((-1), i))/((2*i)+1))*4; // Quelle der Formel: Wikipedia
        }

        // Ausgabe von Pi
        System.out.println("Die Kreiszahl Pi: " + pi);
        pi = 0; // Löschen des Wertes, damit die Zahl bei erneutem Aufrufen wieder 0 ist
        Main main = new Main();
        main.menu(false);

    }

}
