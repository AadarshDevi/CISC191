
import javax.swing.*;
import java.awt.*;

public class CustomFrame extends JFrame {

    public static Dimension windowSize = new Dimension(518, 260);

    public CustomFrame(String title) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(windowSize);
        setPreferredSize(windowSize);
        setLocationRelativeTo(null);
    }


    public CustomFrame(String title, int jFrameDefaultCloseOperation) {
        setTitle(title);
        setDefaultCloseOperation(jFrameDefaultCloseOperation);
        setSize(windowSize);
        setPreferredSize(windowSize);
        setLocationRelativeTo(null);
    }

    public void showGUI() {
        setVisible(true);
    }

    public void hideGUI() {
        setVisible(false);
    }


}
