import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private TextPanel textPanel;
    private JButton button;
    private Toolbar toolbar;
    private FormPanel formPanel;


    public MainFrame() {
        super("Hello World");

        setLayout(new BorderLayout());
        toolbar = new Toolbar();
        textPanel = new TextPanel();
        button = new JButton("Click here");
        formPanel = new FormPanel();

        toolbar.setStringListener(new StringListener() {
            @Override
            public void textEmitted(String text) {
                textPanel.appendText(text);
            }
        });

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPanel.appendText("Hello\n");
            }
        });

        formPanel.setFormListener(new FormListener() {
            public void formEventOccurred(FormEvent e){
                String name = e.getName();
                String occupation = e.getOccupation();

                textPanel.appendText(name + ": " + occupation + "\n");
            }
        });

        add(formPanel, BorderLayout.WEST);
        add(toolbar, BorderLayout.NORTH);
        add(textPanel, BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);

        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
