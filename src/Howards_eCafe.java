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
    private JButton hotchocolateButton;
    private JButton mochaButton;
    private JButton matchaButton;
    private JButton sodaButton;
    private JButton icedTeaButton;
    
    private JLabel latteInstructions;
    
    private JButton iceButton;
    private JButton milkButton;
    private JButton vanillaButton;
    private JButton caramelButton;
    private JButton whitechocolateButton;
    private JButton coffeeButton;
    private JButton chocolatepowderButton;
    private JButton whippedcreamButton;
    private JButton matchapowderButton;
    private JButton shakeButton;
    private JButton chocolatemilkButton;
    private JButton teaflavoringButton;
    private JButton sparkingwaterButton;
    private JButton syrupButton;
    private JButton croissantButton;
    private JButton chocchipcookieButton;
    private JButton bananabreadButton;
    private JButton donutButton;
    private JButton lemonloafButton;
    
    public int correct = 0;


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
        
        //menu
        latteButton = new JButton("Latte");
        latteButton.addActionListener(this);
        latteButton.setVisible(false);
        c.add(latteButton);

        hotchocolateButton = new JButton("Hot Chocolate");
        hotchocolateButton.addActionListener(this);
        hotchocolateButton.setVisible(false);
        c.add(hotchocolateButton);

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
        
        //Instructions
        latteInstructions = new JLabel("Ice, Milk, Flavoring, Coffee");
        c.add(latteInstructions);
        latteInstructions.setVisible(false);
        
        //Ingredients
        iceButton = new JButton("Ice");
        iceButton.addActionListener(this);
        iceButton.setVisible(false);
        c.add(iceButton);
        
        milkButton = new JButton("Milk");
        milkButton.addActionListener(this);
        milkButton.setVisible(false);
        c.add(milkButton);
        
        vanillaButton = new JButton("Vanilla");
        vanillaButton.addActionListener(this);
        vanillaButton.setVisible(false);
        c.add(vanillaButton);
        
        caramelButton = new JButton("Caramel");
        caramelButton.addActionListener(this);
        caramelButton.setVisible(false);
        c.add(caramelButton);
        
        chocolatepowderButton = new JButton("Chocolate Powder");
        chocolatepowderButton.addActionListener(this);
        chocolatepowderButton.setVisible(false);
        c.add(chocolatepowderButton);
        
        whitechocolateButton = new JButton("White Chocolate");
        whitechocolateButton.addActionListener(this);
        whitechocolateButton.setVisible(false);
        c.add(whitechocolateButton);
        
        coffeeButton = new JButton("Coffee");
        coffeeButton.addActionListener(this);
        coffeeButton.setVisible(false);
        c.add(coffeeButton);
        
        iceButton = new JButton("Ice");
        iceButton.addActionListener(this);
        iceButton.setVisible(false);
        c.add(iceButton);
        
        whippedcreamButton = new JButton("Whipped Cream");
        whippedcreamButton.addActionListener(this);
        whippedcreamButton.setVisible(false);
        c.add(whippedcreamButton);
        
        matchapowderButton = new JButton("Matcha Powder");
        matchapowderButton.addActionListener(this);
        matchapowderButton.setVisible(false);
        c.add(matchapowderButton);
        
        shakeButton = new JButton("Shake");
        shakeButton.addActionListener(this);
        shakeButton.setVisible(false);
        c.add(shakeButton);
        
        chocolatemilkButton = new JButton("Chocolate Milk");
        chocolatemilkButton.addActionListener(this);
        chocolatemilkButton.setVisible(false);
        c.add(chocolatemilkButton);
        
        teaflavoringButton = new JButton("Tea Flavoring");
        teaflavoringButton.addActionListener(this);
        teaflavoringButton.setVisible(false);
        c.add(teaflavoringButton);
        
        sparkingwaterButton = new JButton("Sparking Water");
        sparkingwaterButton.addActionListener(this);
        sparkingwaterButton.setVisible(false);
        c.add(sparkingwaterButton);
        
        syrupButton = new JButton("Syrup");
        syrupButton.addActionListener(this);
        syrupButton.setVisible(false);
        c.add(syrupButton);
        
        croissantButton = new JButton("Croissant");
        croissantButton.addActionListener(this);
        croissantButton.setVisible(false);
        c.add(croissantButton);
        
        chocchipcookieButton = new JButton("Chocolate Chip Cookie");
        chocchipcookieButton.addActionListener(this);
        chocchipcookieButton.setVisible(false);
        c.add(chocchipcookieButton);
        
        bananabreadButton = new JButton("Banana Bread");
        bananabreadButton.addActionListener(this);
        bananabreadButton.setVisible(false);
        c.add(bananabreadButton);
        
        donutButton = new JButton("Donut");
        donutButton.addActionListener(this);
        donutButton.setVisible(false);
        c.add(donutButton);
        
        lemonloafButton = new JButton("Lemon Loaf");
        lemonloafButton.addActionListener(this);
        lemonloafButton.setVisible(false);
        c.add(lemonloafButton);
    }

    public static void main(String[] args) {
        Howards_eCafe window = new Howards_eCafe();
        window.setBounds(100, 100, 400, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == continueButton) {
            welcomeLabel.setVisible(false);
            continueButton.setVisible(false);
            latteButton.setVisible(true);
            hotchocolateButton.setVisible(true);
            mochaButton.setVisible(true);
            matchaButton.setVisible(true);
            sodaButton.setVisible(true);
            icedTeaButton.setVisible(true);
            
        } else if (e.getSource() == latteButton) {
        	welcomeLabel.setVisible(false);
            continueButton.setVisible(false);
            latteButton.setVisible(false);
            hotchocolateButton.setVisible(false);
            mochaButton.setVisible(false);
            matchaButton.setVisible(false);
            sodaButton.setVisible(false);
            icedTeaButton.setVisible(false);
            iceButton.setVisible(true);
            milkButton.setVisible(true);
            vanillaButton.setVisible(true);
            caramelButton.setVisible(true);
            whitechocolateButton.setVisible(true);
            coffeeButton.setVisible(true);
            chocolatepowderButton.setVisible(true);
            whippedcreamButton.setVisible(true);
            matchapowderButton.setVisible(true);
            shakeButton.setVisible(true);
            chocolatemilkButton.setVisible(true);
            teaflavoringButton.setVisible(true);
            sparkingwaterButton.setVisible(true);
            syrupButton.setVisible(true);
            croissantButton.setVisible(true);
            chocchipcookieButton.setVisible(true);
            bananabreadButton.setVisible(true);
            donutButton.setVisible(true);
            lemonloafButton.setVisible(true);}
            
        else if (e.getSource() == iceButton && correct == 0) {
            	System.out.println("Hello");
            	correct = 1;
        }
        else if (correct == 1 && e.getSource() == milkButton) {
            		System.out.println("hello2");
            	}
            	
        else if (e.getSource() == hotchocolateButton) {    
        	welcomeLabel.setVisible(false);
            continueButton.setVisible(false);
            latteButton.setVisible(false);
            hotchocolateButton.setVisible(false);
            mochaButton.setVisible(false);
            matchaButton.setVisible(false);
            sodaButton.setVisible(false);
            icedTeaButton.setVisible(false);
            iceButton.setVisible(true);
            milkButton.setVisible(true);
            vanillaButton.setVisible(true);
            caramelButton.setVisible(true);
            whitechocolateButton.setVisible(true);
            coffeeButton.setVisible(true);
            chocolatepowderButton.setVisible(true);
            whippedcreamButton.setVisible(true);
            matchapowderButton.setVisible(true);
            shakeButton.setVisible(true);
            chocolatemilkButton.setVisible(true);
            teaflavoringButton.setVisible(true);
            sparkingwaterButton.setVisible(true);
            syrupButton.setVisible(true);
            croissantButton.setVisible(true);
            chocchipcookieButton.setVisible(true);
            bananabreadButton.setVisible(true);
            donutButton.setVisible(true);
            lemonloafButton.setVisible(true);
        } else if (e.getSource() == mochaButton) { 
        	welcomeLabel.setVisible(false);
            continueButton.setVisible(false);
            latteButton.setVisible(false);
            hotchocolateButton.setVisible(false);
            mochaButton.setVisible(false);
            matchaButton.setVisible(false);
            sodaButton.setVisible(false);
            icedTeaButton.setVisible(false);
            iceButton.setVisible(true);
            milkButton.setVisible(true);
            vanillaButton.setVisible(true);
            caramelButton.setVisible(true);
            whitechocolateButton.setVisible(true);
            coffeeButton.setVisible(true);
            chocolatepowderButton.setVisible(true);
            whippedcreamButton.setVisible(true);
            matchapowderButton.setVisible(true);
            shakeButton.setVisible(true);
            chocolatemilkButton.setVisible(true);
            teaflavoringButton.setVisible(true);
            sparkingwaterButton.setVisible(true);
            syrupButton.setVisible(true);
            croissantButton.setVisible(true);
            chocchipcookieButton.setVisible(true);
            bananabreadButton.setVisible(true);
            donutButton.setVisible(true);
            lemonloafButton.setVisible(true);
        } else if (e.getSource() == matchaButton) {  
        	welcomeLabel.setVisible(false);
            continueButton.setVisible(false);
            latteButton.setVisible(false);
            hotchocolateButton.setVisible(false);
            mochaButton.setVisible(false);
            matchaButton.setVisible(false);
            sodaButton.setVisible(false);
            icedTeaButton.setVisible(false);
            iceButton.setVisible(true);
            milkButton.setVisible(true);
            vanillaButton.setVisible(true);
            caramelButton.setVisible(true);
            whitechocolateButton.setVisible(true);
            coffeeButton.setVisible(true);
            chocolatepowderButton.setVisible(true);
            whippedcreamButton.setVisible(true);
            matchapowderButton.setVisible(true);
            shakeButton.setVisible(true);
            chocolatemilkButton.setVisible(true);
            teaflavoringButton.setVisible(true);
            sparkingwaterButton.setVisible(true);
            syrupButton.setVisible(true);
            croissantButton.setVisible(true);
            chocchipcookieButton.setVisible(true);
            bananabreadButton.setVisible(true);
            donutButton.setVisible(true);
            lemonloafButton.setVisible(true);
        } else if (e.getSource() == sodaButton) {
        	welcomeLabel.setVisible(false);
            continueButton.setVisible(false);
            latteButton.setVisible(false);
            hotchocolateButton.setVisible(false);
            mochaButton.setVisible(false);
            matchaButton.setVisible(false);
            sodaButton.setVisible(false);
            icedTeaButton.setVisible(false);
            iceButton.setVisible(true);
            milkButton.setVisible(true);
            vanillaButton.setVisible(true);
            caramelButton.setVisible(true);
            whitechocolateButton.setVisible(true);
            coffeeButton.setVisible(true);
            chocolatepowderButton.setVisible(true);
            whippedcreamButton.setVisible(true);
            matchapowderButton.setVisible(true);
            shakeButton.setVisible(true);
            chocolatemilkButton.setVisible(true);
            teaflavoringButton.setVisible(true);
            sparkingwaterButton.setVisible(true);
            syrupButton.setVisible(true);
            croissantButton.setVisible(true);
            chocchipcookieButton.setVisible(true);
            bananabreadButton.setVisible(true);
            donutButton.setVisible(true);
            lemonloafButton.setVisible(true);
        } else if (e.getSource() == icedTeaButton) {
        	welcomeLabel.setVisible(false);
            continueButton.setVisible(false);
            latteButton.setVisible(false);
            hotchocolateButton.setVisible(false);
            mochaButton.setVisible(false);
            matchaButton.setVisible(false);
            sodaButton.setVisible(false);
            icedTeaButton.setVisible(false);
            iceButton.setVisible(true);
            milkButton.setVisible(true);
            vanillaButton.setVisible(true);
            caramelButton.setVisible(true);
            whitechocolateButton.setVisible(true);
            coffeeButton.setVisible(true);
            chocolatepowderButton.setVisible(true);
            whippedcreamButton.setVisible(true);
            matchapowderButton.setVisible(true);
            shakeButton.setVisible(true);
            chocolatemilkButton.setVisible(true);
            teaflavoringButton.setVisible(true);
            sparkingwaterButton.setVisible(true);
            syrupButton.setVisible(true);
            croissantButton.setVisible(true);
            chocchipcookieButton.setVisible(true);
            bananabreadButton.setVisible(true);
            donutButton.setVisible(true);
            lemonloafButton.setVisible(true);
            
        }
    }
}