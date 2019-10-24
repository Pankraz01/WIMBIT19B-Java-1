package dhbw.daniel.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Klasse zum Lesen der Konsoleneingaben des Users
 *
 * @author danieljuric
 * @version 1.0
 *      24.10.2019
 */

public class ReadConsole {
    /**
     * @return Gibt den Input aus der Konsole als String aus
     * @throws IOException
     */

    public static String readInputString() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        return input;
    }

    /**
     * @return Gibt den Input aus der Konsole als Integer aus
     */
    public static int readInputInt() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        /**
         * @throws IOException           Wenn Input kein Integer ist
         * @throws NumberFormatException Wenn Input kein Integer ist
         */
        try {
            int input = Integer.parseInt(reader.readLine());
            return input;
        } catch (NumberFormatException | IOException e) {
            //e.printStackTrace();
            System.out.println("Exception: Eingabe ist keine Integer");
            Main main = new Main();
            main.menu(true);
        }
        // Standard Return Wert, wenn eine Exception throws
        return 0;
    }

    public static double readInputDouble() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            double input = Double.parseDouble(reader.readLine());
            return input;
        } catch (Exception e) {
            System.out.println("Exception: Eingabe ist kein Double");
            Main main = new Main();
            main.menu(true);
        }
        return 0;
    }

}
