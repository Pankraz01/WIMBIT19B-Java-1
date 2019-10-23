package dhbw.daniel.main;

public class TextUmkehren {
    public static void textUmkehren(String[] args) {
        TextUmkehren textUmkehren = new TextUmkehren();
    }

    public static void changeText() {
        String result = "";
        String input = "Hallo, das ist ein Test";

        for (int pos = input.length(); pos > 0; pos--) {
            String inputTeil = String.valueOf(input.charAt(pos-1));

            result = result + inputTeil;


        }

        System.out.println(result);

    }
}
