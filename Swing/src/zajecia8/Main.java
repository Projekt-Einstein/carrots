package zajecia8;

import javax.swing.*;

/**
 * Created by domino on 5/9/17.
 */
public class Main {
    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> new CalculatorFrame()); //a pomoca lambda wyrazenia

//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new CalculatorFrame();
//            }
//        }); //Starszy sposob

        SwingUtilities.invokeLater(() -> new Test());
    }

}
