import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Howards_eCafe extends JFrame implements ActionListener {

    private JLabel welcomeLabel;
    private JButton continueButton;
    private JButton latteButton;
    private JButton cappuccinoButton;
    private JButton mochaButton;
    private JButton matchaButton;
    private JButton sodaButton;
    private JButton icedTeaButton;

    public Howards_eCafe() {
        super("Howards_eCafe");

        Container c = getContentPane();
        c.setBackground(Color.WHITE);
        c.setLayout(new FlowLayout());

        welcomeLabel = new JLabel("Welcome to Howards eCafe!");
        c.add(welcomeLabel);

        continueButton = new JButton("Continue");
        continueButton.addActionListener(this);
        c.add(continueButton);

        latteButton = new JButton("Latte");
        latteButton.addActionListener(this);
        latteButton.setVisible(false);
        c.add(latteButton);

        cappuccinoButton = new JButton("Cappuccino");
        cappuccinoButton.addActionListener(this);
        cappuccinoButton.setVisible(false);
        c.add(cappuccinoButton);

        mochaButton = new JButton("Mocha");
        mochaButton.addActionListener(this);
        mochaButton.setVisible(false);
        c.add(mochaButton);

        matchaButton = new JButton("Matcha");
        matchaButton.addActionListener(this);
        matchaButton.setVisible(false);
        c.add(matchaButton);

        sodaButton = new JButton("Soda");
        sodaButton.addActionListener(this);
        sodaButton.setVisible(false);
        c.add(sodaButton);

        icedTeaButton = new JButton("Iced Tea");
        icedTeaButton.addActionListener(this);
        icedTeaButton.setVisible(false);
        c.add(icedTeaButton);
    }

    public static void main(String[] args) {
        Howards_eCafe window = new Howards_eCafe();
        window.setBounds(100, 100, 800, 800);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == continueButton) {
            welcomeLabel.setVisible(false);
            continueButton.setVisible(false);
            latteButton.setVisible(true);
            cappuccinoButton.setVisible(true);
            mochaButton.setVisible(true);
            matchaButton.setVisible(true);
            sodaButton.setVisible(true);
            icedTeaButton.setVisible(true);
        } else if (e.getSource() == latteButton) {
            
        } else if (e.getSource() == cappuccinoButton) {
            
        } else if (e.getSource() == mochaButton) {
            
        } else if (e.getSource() == matchaButton) {
            
        } else if (e.getSource() == sodaButton) {
            
        } else if (e.getSource() == icedTeaButton) {
            
        }
    }
}