package dhbw.daniel.main;

public class Quersumme {
    public static void quersumme(String[] args) {
     Quersumme quersumme = new Quersumme();
    }

    public static void getQuersumme() {
        int value = 7411, digitSum = 0;

        String valueString;
        valueString = Integer.toString(value);
        System.out.println(valueString);

        for (int pos = 0; pos < valueString.length(); pos++) {
            int digit = Integer.parseInt(String.valueOf(valueString.charAt(pos)));
            digitSum = digitSum + digit;
        }


        System.out.println("Quersumme von " + value + " ist " + digitSum);
    }


}