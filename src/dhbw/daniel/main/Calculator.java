package dhbw.daniel.main;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator extends Main {

    static boolean showMenu = true;

    public static void calculator(boolean showMenu) throws IOException {

        if(showMenu) {
            System.out.println("");
            System.out.println("========================================================== CALC MENU ==========================================================");
            System.out.println("betrag     Berechnet den Betrag");
            System.out.println("mw a       Mittelwert Arithmetisch");
            System.out.println("mw g       Mittelwert Geometrisch");
            System.out.println("mw h       Mittelwert Harmonisch");
            System.out.println("prim       Prüfen einer Primzahl");
            System.out.println("html       Konvertiere HTML zu Char");
        } else {
            System.out.println("");
            System.out.println("========================================================== CALC MENU ==========================================================");
            System.out.println("Bitte Programm auswählen:");
        }


        String option = null;

        try {
            option = ReadConsole.readInputString();
        } catch (IOException e) {
            System.exit(0);
        }

        switch (option) {
            case "betrag":
                calcBetrag();
                break;
            case "mw a":
                mittelwertArithmetisch();
                break;
            case "mw g":
                mittelwertGeometisch();
                break;
            case "mw h":
                mittelwertHarmonisch();
                break;
            case "prim":
                primTester();
                break;
            case "alex":
                try {
                    alex();
                } catch (Exception e) {
                    e.printStackTrace();
                    calculator(true);
                }
                break;
            /**
             * Konvertierung des HTML Codes zum jeweiligen Character
             * {@link https://unicode-table.com/de/}
             */
            case "html":
                System.out.println("HTML Code:");
                int htmlcode = ReadConsole.readInputInt();
                printhtmlToChar(htmlcode);
                break;
            default:
                System.out.println("Gehe zurück zum Hauptmenü");
                Main.menu(true);
                break;
        }
    }


    /**
     * Umwandlung von HTML (integer) zu Unicode Character (Char)
     * @param htmlcode
     * @throws IOException
     */
    private static void printhtmlToChar(int htmlcode) throws IOException {
        System.out.println(Character.valueOf((char) htmlcode));
        Calculator.calculator(false);
    }


    /**
     * Errechnet den Betrag
     * @throws IOException
     */
    private static void calcBetrag() throws IOException {
        System.out.println("Bitte Zahl eingeben:");
        double input = ReadConsole.readInputDouble();

        if (input < 0) {
            input = input - input - input;
        }
        System.out.println("Der Betrag ist " + input);
        Calculator.calculator(false);

    }

    private static void mittelwertArithmetisch() throws IOException {
        System.out.println("Bitte Zahl eingeben (1):");
        double inputA = ReadConsole.readInputDouble();
        System.out.println("Bitte Zahl eingeben (2):");
        double inputB = ReadConsole.readInputDouble();

        double output = (inputA + inputB)/2;
        System.out.println("Mittelwert von " + inputA + " und " + inputB + " ist " + output);
        Calculator.calculator(false);
    }

    private static void mittelwertGeometisch() throws IOException {
        System.out.println("Bitte Zahl eingeben (1):");
        double inputA = ReadConsole.readInputDouble();
        System.out.println("Bitte Zahl eingeben (2):");
        double inputB = ReadConsole.readInputDouble();

        double output = Math.sqrt(inputA * inputB);
        System.out.println("Mittelwert von " + inputA + " und " + inputB + " ist " + output);
        Calculator.calculator(false);
    }

    private static void mittelwertHarmonisch() throws IOException {
        System.out.println("Bitte Zahl eingeben (1):");
        double inputA = ReadConsole.readInputDouble();
        System.out.println("Bitte Zahl eingeben (2):");
        double inputB = ReadConsole.readInputDouble();

        double output = 2/((1/inputA)+(1/inputB));
        System.out.println("Mittelwert von " + inputA + " und " + inputB + " ist " + output);
        Calculator.calculator(false);
    }

    /**
     * Primzahlentester
     *
     * Eine Whileschleife die überprüft ob eine Zahl (input) nicht durch eine Zahl, die immer kleiner werdend (von input aus gehend)
     * teilbar ist (i). Sobald die Zahl (i) 1 erreicht hat ist diese Zahl eine Primzahl, da die Zahl (input) nur durch 1
     * (und durch sich selbst) teilbar ist.
     * @throws IOException
     */
    private static void primTester() throws IOException {
        System.out.println("Bitte Zahl eingeben:");
        int input = ReadConsole.readInputInt();
        @SuppressWarnings("unused")
        boolean isPrim = true;
        int i = input-1;
        if (input <= 1) {
            System.out.println("Bitte eine Zahl über 1 eingeben.");
            primTester();
        }

        while (input % i != 0) { // solange der Input nicht komplett durch i teilbar ist...
            i--;
        }
        if (i == 1) {
            System.out.println(input + " ist eine Primzahl");
        } else {
            System.out.print(input + " ist keine Primzahl, teilbar durch: " + i);
        }
        Calculator.calculator(false);
    }

    private static void alex() throws IOException {
        double  sum = 0,
                min = 0,
                max = 0,
                x = 1,
                stop = 1;
        int count = -1;
        while (stop != 0) {
            System.out.println("Statistiken für welchen Wert?");

            // Absichtliche Neuerstellung des Readers, um aus der Exception das Cancelling zu gewinnen
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            /**
             * Es wird versucht eine Double aus der Konsole zu lesen. Solange der Input eine Double ist, wird keine
             * Exception ausgeworfen. Wenn man nun "stop" eingibt, kann der Reader daraus keine Double erkennen und wirft
             * einen Fehler aus, den wir absichtlich abfangen und als beendigung des Mittelwerts sehen
             */
            try {
                x = Double.parseDouble(input.readLine());
            } catch (Exception e) {
                stop = 0;
            }

            if (count == -1) {
                min = x;
            }
            sum += x;
            count +=1;
            if (x > max) {
                max = x;
            }if (x < min) {
                min = x;
            }
            input.close();
        }
        if (count > 1) {
            double average = sum / count;
            System.out.println("Das Maximum der eingegebenen Werte ist " + max);
            System.out.println("Das Minimum der eingegebenen Werte ist " + min);
            System.out.println("Der Mittelwert der eingegebenen Werte ist " + average);

        }else {
            System.out.println("Bitte mindestens 2 Werte eingeben.");
        }

        calculator(false);
    }
}
