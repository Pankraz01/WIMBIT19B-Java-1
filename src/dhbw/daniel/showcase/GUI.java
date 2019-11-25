package dhbw.daniel.showcase;

import dhbw.daniel.main.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class GUI {

    public static void GUI(String[] args) {
        GUI gui = new GUI();
    }

    /**
     * Starts the GUI
     */
    @SuppressWarnings("unused")
    public static void startGUI(){
        JFrame f = new JFrame("Hauptmenü");
        f.setSize(500, 150);
        f.setLocation(512, 360);
        final JTextArea textArea = new JTextArea(10, 40);
        f.getContentPane().add(BorderLayout.CENTER, textArea);

        // Create Button 1
        final JButton button = new JButton("Time Convertion");
        f.getContentPane().add(BorderLayout.NORTH, button);
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                int totalSeconds = 123456789;
                int seconds, minutes, hours, days, years;
                Main main = new Main();



                seconds = totalSeconds % 60;
                minutes = (totalSeconds / 60) % 60;
                hours = (totalSeconds / 60 / 60) % 24;
                days = (totalSeconds / 60 / 60 / 24) % 365;
                years = totalSeconds / 60 / 60 / 24 / 365;

                try {
                    main.writeToFile("Total Sekunden: " + totalSeconds + "s " + years + "y " + days + "d " + hours + "h " + minutes + "m " + seconds + "s \n");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                textArea.setText(null);
                textArea.append("Total Sekunden: " + totalSeconds + "s " + years + "y " + days + "d " + hours + "h " + minutes + "m " + seconds + "s");
            }
        });

        final JButton button2 = new JButton("Exit");
        button2.setLayout(null);
        //button2.setBounds(0, 0, 150, 10);
        f.getContentPane().add(BorderLayout.SOUTH, button2);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        f.setVisible(true);
        Main main = new Main();
        main.menu(false);

    }


}
