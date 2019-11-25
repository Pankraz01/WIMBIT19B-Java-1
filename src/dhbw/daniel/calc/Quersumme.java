package dhbw.daniel.calc;

import dhbw.daniel.main.Main;
import dhbw.daniel.main.ReadConsole;

public class Quersumme {
    @SuppressWarnings("unused")
    public static void quersumme(String[] args) {
     Quersumme quersumme = new Quersumme();
    }

    public static void getQuersumme() {
        int value, digitSum = 0;

        System.out.println("Quersumme eingeben:");
        value = ReadConsole.readInputInt();

        String valueString;
        valueString = Integer.toString(value);
        System.out.println(valueString);

        for (int pos = 0; pos < valueString.length(); pos++) {
            int digit = Integer.parseInt(String.valueOf(valueString.charAt(pos)));
            digitSum = digitSum + digit;
        }


        System.out.println("Quersumme von " + value + " ist " + digitSum);
        Main main = new Main();
        main.menu(false);
    }


}
