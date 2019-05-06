import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private JTextArea textArea;
    private JButton button;


    public MainFrame() {
        super("Hello World");

        setLayout(new BorderLayout());

        textArea = new JTextArea();
        button = new JButton("Click here");

        add(textArea, BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);

        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
