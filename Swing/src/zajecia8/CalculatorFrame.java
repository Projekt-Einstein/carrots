package zajecia8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Dziedziczymy z JFrame bo tworzymy okienko.
 *
 */
public class CalculatorFrame extends JFrame {

    public CalculatorFrame() {
        super("Calculator"); //zawsze powinnismy wywolywac konstruktor klasy nadrzednej
        setDefaultCloseOperation(EXIT_ON_CLOSE); //co ma sie stac po kliknieciu 'x'

        setLocation(100, 100); // gdzie ma sie znajdowac prawy gorny rog naszego okna
//        setSize(300, 300); //wielkosc okna

        JButton btn = new JButton("Pointless button"); //przycisk
//        btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//              System.out.println("akcja")
//            }
//        });

        btn.addActionListener((ActionEvent e) -> //sluchacz zdarzen
            System.out.println("akcja")
        );

        JPanel panel = new JPanel(); //panel sluzy do zagniezdzania komponentow
        panel.setLayout(new GridLayout(2, 1                                                                                                                                                                                                                                                                                                                                                                                                    ));

        panel.add(new JButton("inny"));
        panel.add(new JButton("jescze jeden"));

        add(btn);
        add(panel, BorderLayout.SOUTH);

//        pack(); //dopasowuje rozmiar okna do tego co sie w nim znajduje
        setVisible(true);
    }


}
