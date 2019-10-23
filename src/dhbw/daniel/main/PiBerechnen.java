package dhbw.daniel.main;

/**
 * Berechnung von Pi
 * Zurzeit WIP
 */
public class PiBerechnen {

    static double pi;

    public static void piBerechnen(String[] args) {
        PiBerechnen piBerechnen = new PiBerechnen();
    }

    public static void calcPi() {
        for (double i = 0; i != 10000; i++) {
            double k = i + 1;
            pi = (Math.pow((-1), k))/(2*k+1);
        }

        System.out.println("Die Kreiszahl Pi: " + pi/4);

    }

}
