package dhbw.daniel.main;

/**
 * Berechnung von Pi
 * Zurzeit WIP
 */
public class PiBerechnen {
    static int tropfenzahl = 1453739826; // Je höher desto Langsamer, aber genauere, Annhäherung an Pi


    /**
     *
     * @param args
     */
    public static void piBerechnen(String[] args) {
        PiBerechnen piBerechnen = new PiBerechnen();
    }

    /**
     * Sehr Langsame Annäherung von Pi
     */
    public static void calcPi() {

        double pi = 0;
        int innerhalb = 0;
        int gesamt = tropfenzahl;

        while (tropfenzahl > 0) { // generiere Tropfen und addiere je nach Zugehörigkeit
            double dotx = 2 * Math.random() - 1;
            double doty = 2 * Math.random() - 1;

            if (dotx*dotx + doty*doty <= 1) {
                // Punkt liegt innerhalb des Kreises
                innerhalb++;
            } else {
                // Punkt liegt außerhalb des Kreises
            }

            tropfenzahl--;
        }

        pi = 4*(double)innerhalb/gesamt;
        System.out.println(pi);


    }

}
