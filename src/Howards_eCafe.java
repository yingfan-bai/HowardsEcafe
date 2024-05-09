import java.awt.Color; 
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Howards_eCafe extends JFrame implements ActionListener {

	public Howards_eCafe (){ 
		super("Howards_eCafe");

        Container c = getContentPane(); 
        c.setBackground(Color.WHITE); 
        c.setLayout(new FlowLayout());

    }
	
	public static void main(String[] args) {
		Howards_eCafe window = new Howards_eCafe(); 
        window.setBounds(100,100, 800, 800); 
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        window.setVisible(true); 

    }

	}


