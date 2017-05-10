package zajecia8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/**
 * Inny przyklad okienek w swingu.
 */
public class CoordinateFrame extends JFrame implements MouseMotionListener {

    private JLabel coordiantesMovingLabel = new JLabel("Moving coordinates: (0, 0)");
    private JLabel coordiantesDraggingLabel = new JLabel("Dragging coordinates: (0, 0)");
    private JLabel leftClickLabel = new JLabel("Mouse left clicks: 0");
    private JLabel rightClickLabel = new JLabel("Mouse right clicks: 0");

    private int leftClickCount = 0;
    private int rightClickCount = 0;

    public CoordinateFrame() {
        super("Coordinate frame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); //ustawia lewy gorny rog na srodku ekranu
        setSize(400, 400);

        //Mouse motion listener slucha zdarzen takich jak ruch myszki i "przeciaganie" myszki
        addMouseMotionListener(this);

        // mouse listener odpowiada za akcje zwiazane z klikaniem myszki
        // uzywam mouse adapter bo jest tam duzo metod ktore sa mi nie potrzebne i gdybym implementowal
        // interfejs musilbym je zaimplementowac
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                if (mouseEvent.getButton() == MouseEvent.BUTTON1) {
                    leftClickCount++;
                    leftClickLabel.setText("Mouse left clicks: " + leftClickCount);
                } else if (mouseEvent.getButton() == MouseEvent.BUTTON3) {
                    rightClickCount++;
                    rightClickLabel.setText("Mouse right clicks: " + rightClickCount);
                }
            }
        });

        JPanel mainPanel = new JPanel(new GridLayout(4, 1));

        mainPanel.add(coordiantesMovingLabel);
        mainPanel.add(coordiantesDraggingLabel);
        mainPanel.add(leftClickLabel);
        mainPanel.add(rightClickLabel);

        add(mainPanel);

        setVisible(true);
    }


    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        int x = mouseEvent.getX();
        int y = mouseEvent.getY();

        coordiantesDraggingLabel.setText("Dragging coordinates: (" + x + ", " + y + ")");
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        int x = mouseEvent.getX();
        int y = mouseEvent.getY();

        coordiantesMovingLabel.setText("Moving coordinates: (" + x + ", " + y + ")");
    }
}
