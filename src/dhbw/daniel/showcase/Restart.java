package dhbw.daniel.showcase;

import dhbw.daniel.main.Main;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;

/**
 * Restarts the Application
 */

public class Restart {
    @SuppressWarnings("unused")
    public static void restart(String[] args) {
        Restart restart = new Restart();
    }


    /**
     * Restarts the Application if it is a .jar File
     *
     * @throws IOException
     * @throws URISyntaxException
     */
    public static void restartApplication() throws IOException, URISyntaxException {

        final String javaBin = System.getProperty("java.home") + File.separator + "bin" + File.separator + "java";
        final File currentJar = new File(Main.class.getProtectionDomain().getCodeSource().getLocation().toURI());

        /* is it a jar file? */
        if (!currentJar.getName().endsWith(".jar")) {
            System.out.println("Not .jar");
            return;
        }
        /* Build command: java -jar application.jar */
        final ArrayList<String> command = new ArrayList<String>();
        command.add(javaBin);
        command.add("-jar");
        command.add(currentJar.getPath());

        final ProcessBuilder builder = new ProcessBuilder(command);
        builder.start();
        System.exit(0);

    }

}


