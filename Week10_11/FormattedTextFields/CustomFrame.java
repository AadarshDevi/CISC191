package week_10_11.lab2;

import javax.swing.*;
import java.awt.*;

public class CustomFrame extends JFrame {

    public static Dimension WINDOW_SIZE = new Dimension(518, 260);

    public CustomFrame(String title) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(WINDOW_SIZE);
        setPreferredSize(WINDOW_SIZE);
        setLocationRelativeTo(null);
    }


    public CustomFrame(String title, int jFrameDefaultCloseOperation) {
        setTitle(title);
        setDefaultCloseOperation(jFrameDefaultCloseOperation);
        setSize(WINDOW_SIZE);
        setPreferredSize(WINDOW_SIZE);
        setLocationRelativeTo(null);
    }

    public void showGUI() {
        setVisible(true);
    }

    public void hideGUI() {
        setVisible(false);
    }


}
