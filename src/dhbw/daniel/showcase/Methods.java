package dhbw.daniel.showcase;

/**
 * Erkärt Methoden
 *
 * @author danieljuric
 * @version 1.0       28.10.2019
 */
public class Methods {


    /**
     * Method1 ist eine Methode, in der nichts an die Aufrufende Klasse zurückgegeben wird (void)
     * wird diese Methode aufgerufen, dann Arbeitet sie Schritt für Schritt ihren inhalt ab.
     */
    @SuppressWarnings("unused")
    public void method1() {
        System.out.println("Methode 1 wurde ausgeführt");
    }

    /**
     * Methode2 ist eine Methode, in der ebenfalls nichts zurückgegeben wird (void)
     * Anders als bei Mehtode1 ist hier die Methode statisch. Das bedeutet, dass diese,
     * ohne ein Objekt zu erzeugen, in einer anderen Klasse aufgerufen werden kann.
     * Sie übernimmt dementsprechend die Eigenschaften der Klasse.
     * <p>
     * Nicht Statische Methode in anderer Klasse aufrufen:
     * <p>
     * Methods methods = new Methods();
     * methods.method2();
     */
    @SuppressWarnings("unused")
    public static void method2(){
        System.out.println("Methode 2 wurde ausgeführt. \n sie ist statisch");
    }

    /**
     * Methode 3 ist eine Methode, in der auch nichts zurückgegeben wird (void)
     * Hier ist nun der Fall, dass beim Aufrufen der Methode diese eine Integer (Ganzzahl) als übergabe wert verlangt
     *
     * @param integer the integer
     */
    @SuppressWarnings("unused")
    public static void method3(int integer /* Übergebener Wert aus der Aufrufenden Klassen */) {
        System.out.println("Methode 3 wurde ausgeführt. \n Der Wert " + integer + " wurde in die Methode übergeben");
    }

    /**
     * Methode 4 ist eine Methode, in der ein Integer Wert zurückgegeben werden soll. Es werden keine
     * Parameter verlangt. Nach aufrufen der Methode, wir der Wert, der in Methode 4 zurückgegeben wird
     * in die Aufrufende Klasse übergeben.
     * <p>
     * Beispiel:
     * <p>
     * int integer = method4();
     *
     * @return 0 int
     */
    @SuppressWarnings("unused")
    public int method4() {
        return 0; // Rückgabe Wert an die Aufrufende Klasse
    }

    /**
     * Methode 5 ist eine Methode, in der sowohl ein Wert Verlangt wird (Integer) als auch ein Wert wieder übergeben wird (String)
     * Diese müssen nicht vom selben Datentyp sein
     *
     * @param integer the integer
     * @return string
     */
    @SuppressWarnings("unused")
    public String method5(int integer /* Übergebener Wert aus der Aufrufenden Klassen */) {
        return String.valueOf(integer); // Rückgabe Wert an die Aufrufende Klasse INFO: Der Integer Wert wirt hier als String geändert (aus 5 wird dann "5")
    }


}
