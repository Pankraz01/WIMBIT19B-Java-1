package dhbw.daniel.main;


import java.io.*;
import java.net.URISyntaxException;

public class Main {



    public static void main(String[] args) {
        Main main = new Main();
        main.menu(true);


    }


    public static void timeConversion(int totalSeconds) {
        int seconds, minutes, hours, days, years;
        Main main = new Main();

        // Compute the values seconds, minutes, hours, days, years

        seconds = totalSeconds % 60;
        minutes = (totalSeconds / 60) % 60;
        hours = (totalSeconds / 60 / 60) % 24;
        days = (totalSeconds / 60 / 60 / 24) % 365;
        years = totalSeconds / 60 / 60 / 24 / 365;


        System.out.println("Total Sekunden: " + totalSeconds + "s ");
        System.out.print(years + "y ");
        System.out.print(days + "d ");
        System.out.print(hours + "h ");
        System.out.print(minutes + "m ");
        System.out.println(seconds + "s");

        main.menu(false);
    }

    public static void schaltJahr(int year) {
        int days;
        Main main = new Main();

        // TODO Compute the number of days
        // NOTE: Do not work perfectly (400)

        if (year % 4 == 0 & (year % 100 != 0 & year % 400 != 0)) {
            days = 366;
        } else {
            days = 365;
        }

        System.out.println("Das Jahr " + year + " hat " + days + " Tage.");
        main.menu(false);
    }


    public static void menu(boolean showMenu /* Zeigt Menü an */) {
        Main main = new Main();
        String name;
        int year = 2000;

        //Enter data using BufferReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        if (showMenu) {
            System.out.println("");
            System.out.println("========================================================== MAIN MENU ==========================================================");
            System.out.println("");
            System.out.println("Bitte Programm auswählen:");
            System.out.println("time            Zeitumrechnung");
            System.out.println("schalt          Schaltjahranzeige");
            System.out.println("gui             GUI anzeigen");
            System.out.println("restart         Neutstart des System (WIP)");
            System.out.println("stop            Herunterfahren des System");
            System.out.println("quersumme       Berechnet die Quersumme");
            System.out.println("umkehren        Kehr einen Text um");
            System.out.println("count letters   Zählt Buchstaben");
            System.out.println("calc pi         Berechnet Pi");
            System.out.println("check even      Prüft Gerade / Ungerade");
            System.out.println("factorize       Zahl fakultät nehmen");
            System.out.println("calc            Öffnet Calculator");
            System.out.println("");

/*      System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
*/
        } else {
            System.out.println("");
            System.out.println("========================================================== MAIN MENU ==========================================================");
            System.out.println("");
            System.out.println("Bitte Programm auswählen:");
        }



        // Reading data using readLine
        try {
            name = reader.readLine();
            switch (name) {
                case "time":
                    System.out.println("Zeit in Sekunden:");
                    int time = ReadConsole.readInputInt();
                    Main.timeConversion(time);
                    break;
                case "schalt":
                    Main.schaltJahr(year);
                    break;
                case "restart":
                    Restart.restartApplication();
                    System.out.println("Restart System...");
                    break;
                case "gui":
                    //GUI.startGUI();
                    System.out.println("Leider Deaktiviert");
                    main.menu(true);
                    break;
                case "stop":
                    System.out.println("Shutting Down...");
                    System.exit(0);
                    break;
                case "quersumme":
                    Quersumme.getQuersumme();
                    break;
                case "umkehren":
                    TextUmkehren.changeText();
                    break;
                case "count letters":
                    VokaleUndKonsonanten.countLetters();
                    break;
                case "calc pi":
                    PiBerechnen.calcPi();
                    break;
                case "check even":
                    Paritaetest.isEven();
                    break;
                case "factorize":
                    Paritaetest.factorial();
                    break;
                case "count words":
                    VokaleUndKonsonanten.countWords();
                    break;
                case "calc":
                    Calculator.calculator(true);
                    break;
                case "books":
                    Book book = new Book("Daniel Juric", "Das Buch der Bücher", 10110010, true);
                    book.setAvailable(true);
                    System.out.println(book);
                    menu(false);
                    break;

                default:
                    System.out.println("Falscher Command. Zurück zum Hauptmenü");
                    main.menu(true);

                    break;
            }

        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }



    public void writeToFile(String str) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt"));
        writer.write(str);

        writer.close();
    }

}
