package dhbw.daniel.main;

public class VokaleUndKonsonanten {
    public static void vokaleUndKonsonanten(String[] args) {
        VokaleUndKonsonanten vokaleUndKonsonanten = new VokaleUndKonsonanten();
    }

    public static void countLetters() {
        String input = "abcdefghijklmnopqrstuvwxyzäöü.,!? ";
        String output = "";
        int consonants = 0;
        int vowels = 0;
        int uml = 0;
        int leer = 0;
        int sum = 0;

        for (int pos = 0; pos < input.length(); pos++) {
            char digit;
            digit = input.charAt(pos);
            switch (digit) {
                case 'a': case 'e': case 'i': case 'o': case 'u':
                    vowels++;
                    break;
                case 'ä': case 'ö': case 'ü':
                    uml++;
                    break;
                case ' ': case '!': case '?': case '.': case ',':
                    leer++;
                    break;
                default:
                    consonants++;
                    break;
            }
        }
        System.out.println("Das Wort " + input + "\nhat " + vowels + " Vokale, " + consonants + " Konsonanten, " + uml + " Umlaute und " + leer + " Leerzeichen bzw Satzzeichen \nLänge des Inputs: " + input.length());
    }

}
