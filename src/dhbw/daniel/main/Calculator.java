package dhbw.daniel.main;

import java.io.IOException;

public class Calculator {

    static boolean showMenu = true;

    public static void calculator(boolean showMenu) {

        if(showMenu) {
            System.out.println("");
            System.out.println("========================================================== CALC MENU ==========================================================");
            System.out.println("betrag     Berechnet den Betrag");
            System.out.println("mw a       Mittelwert Arithmetisch");
            System.out.println("mw g       Mittelwert Geometrisch");
            System.out.println("mw h       Mittelwert Harmonisch");
            System.out.println("prim       Prüfen einer Primzahl");
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
            default:
                System.out.println("Gehe zurück zum Hauptmenü");
                Main.menu(true);
                break;
        }
    }




    public static void calcBetrag() {
        System.out.println("Bitte Zahl eingeben:");
        double input = ReadConsole.readInputDouble();

        if (input < 0) {
            input = input - input - input;
        }
        System.out.println("Der Betrag ist " + input);
        Calculator.calculator(false);

    }

    public static void mittelwertArithmetisch() {
        System.out.println("Bitte Zahl eingeben (1):");
        double inputA = ReadConsole.readInputDouble();
        System.out.println("Bitte Zahl eingeben (2):");
        double inputB = ReadConsole.readInputDouble();

        double output = (inputA + inputB)/2;
        System.out.println("Mittelwert von " + inputA + " und " + inputB + " ist " + output);
        Calculator.calculator(false);
    }

    public static void mittelwertGeometisch() {
        System.out.println("Bitte Zahl eingeben (1):");
        double inputA = ReadConsole.readInputDouble();
        System.out.println("Bitte Zahl eingeben (2):");
        double inputB = ReadConsole.readInputDouble();

        double output = Math.sqrt(inputA * inputB);
        System.out.println("Mittelwert von " + inputA + " und " + inputB + " ist " + output);
        Calculator.calculator(false);
    }

    public static void mittelwertHarmonisch() {
        System.out.println("Bitte Zahl eingeben (1):");
        double inputA = ReadConsole.readInputDouble();
        System.out.println("Bitte Zahl eingeben (2):");
        double inputB = ReadConsole.readInputDouble();

        double output = 2/((1/inputA)+(1/inputB));
        System.out.println("Mittelwert von " + inputA + " und " + inputB + " ist " + output);
        Calculator.calculator(false);
    }

    public static void primTester() {
        System.out.println("Bitte Zahl eingeben:");
        int input = ReadConsole.readInputInt();
        @SuppressWarnings("unused")
        boolean isPrim = true;
        int i = input-1;
        while (input % i != 0) { // solange der Input nicht komplett durch i teilbar ist...
            i--;
        }
        if (i == 1) {
            System.out.println(input + " ist eine Primzahl");
        } else {
            System.out.println(input + " ist keine Primzahl");
        }
        Calculator.calculator(false);
    }

}
