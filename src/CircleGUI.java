import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CircleGUI extends JFrame {
    private JPanel pnlMain;
    private JTextField tfRadius;
    private JTextField tfArea;
    private JTextField tfCircumference;
    private JButton btnClear;
    private JButton btnCompute;

    // Constructor/
    public CircleGUI() {
        // Set up the GUI components
        // Add action listeners to the buttons
        btnCompute.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                // Get the radius value from the text field
                double radius = Double.parseDouble(tfRadius.getText());

                // Calculate the area and circumference
                double area = Math.PI * radius * radius;
                double circumference = 2 * Math.PI * radius;

                // Set the calculated values in the text fields
                tfArea.setText(String.format("%.2f", area));
                tfCircumference.setText(String.format("%.2f", circumference));
            }
        });

        btnClear.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                // Clear the text fields
                tfRadius.setText("");
                tfArea.setText("");
                tfCircumference.setText("");
            }
        });
    }

    public static void main(String[] args) {
        CircleGUI app = new CircleGUI();
        app.setContentPane(app.pnlMain);
        app.setSize(700, 700);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
