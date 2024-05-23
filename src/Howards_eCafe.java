import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.ImageIcon;


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
    //private JButton vanillaButton;
    //private JButton caramelButton;
    //private JButton whitechocolateButton;
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
    private JLabel wrongLabel;
    private JLabel rightLabel;
    
    public int correct = 0;
    public int drink = 0;


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
        ImageIcon iceImageIcon = new ImageIcon("src/imgs/ice.png");
        Image iceImage = iceImageIcon.getImage();
        Image iceNewimg = iceImage.getScaledInstance(80, 80,  java.awt.Image.SCALE_SMOOTH);
        Icon iceIcon = new ImageIcon(iceNewimg);
        iceButton = new JButton(iceIcon);
        iceButton.addActionListener(this);
        iceButton.setVisible(false);
        c.add(iceButton);
        
        ImageIcon milkImageIcon = new ImageIcon("src/imgs/milk.png");
        Image milkImage = milkImageIcon.getImage();
        Image milkNewimg = milkImage.getScaledInstance(80, 80,  java.awt.Image.SCALE_SMOOTH);
        Icon milkIcon = new ImageIcon(milkNewimg);
        milkButton = new JButton(milkIcon);
        milkButton.addActionListener(this);
        milkButton.setVisible(false);
        c.add(milkButton);
        
        /*vanillaButton = new JButton("Vanilla");
        vanillaButton.addActionListener(this);
        vanillaButton.setVisible(false);
        c.add(vanillaButton);
        
        caramelButton = new JButton("Caramel");
        caramelButton.addActionListener(this);
        caramelButton.setVisible(false);
        c.add(caramelButton);
        
        whitechocolateButton = new JButton("White Chocolate");
        whitechocolateButton.addActionListener(this);
        whitechocolateButton.setVisible(false);
        c.add(whitechocolateButton);*/
        
        ImageIcon chocpowderImageIcon = new ImageIcon("src/imgs/chocpowder.png");
        Image chocpowderImage = chocpowderImageIcon.getImage();
        Image chocpowderNewimg = chocpowderImage.getScaledInstance(80, 80,  java.awt.Image.SCALE_SMOOTH);
        Icon chocpowderIcon = new ImageIcon(chocpowderNewimg);
        chocolatepowderButton = new JButton(chocpowderIcon);
        chocolatepowderButton.addActionListener(this);
        chocolatepowderButton.setVisible(false);
        c.add(chocolatepowderButton);
        
        ImageIcon coffeeImageIcon = new ImageIcon("src/imgs/coffee.png");
        Image coffeeImage = coffeeImageIcon.getImage();
        Image coffeeNewimg = coffeeImage.getScaledInstance(80, 80,  java.awt.Image.SCALE_SMOOTH);
        Icon coffeeIcon = new ImageIcon(coffeeNewimg);
        coffeeButton = new JButton(coffeeIcon);
        coffeeButton.addActionListener(this);
        coffeeButton.setVisible(false);
        c.add(coffeeButton);
        
        ImageIcon whipcreamImageIcon = new ImageIcon("src/imgs/whipcream.png");
        Image whipcreamImage = whipcreamImageIcon.getImage();
        Image whipcreamNewimg = whipcreamImage.getScaledInstance(80, 80,  java.awt.Image.SCALE_SMOOTH);
        Icon whipcreamIcon = new ImageIcon(whipcreamNewimg);
        whippedcreamButton = new JButton(whipcreamIcon);
        whippedcreamButton.addActionListener(this);
        whippedcreamButton.setVisible(false);
        c.add(whippedcreamButton);
        
        ImageIcon matchapowderImageIcon = new ImageIcon("src/imgs/matchapowder.png");
        Image matchapowderImage = matchapowderImageIcon.getImage();
        Image matchapowderNewimg = matchapowderImage.getScaledInstance(80, 80,  java.awt.Image.SCALE_SMOOTH);
        Icon matchapowderIcon = new ImageIcon(matchapowderNewimg);
        matchapowderButton = new JButton(matchapowderIcon);
        matchapowderButton.addActionListener(this);
        matchapowderButton.setVisible(false);
        c.add(matchapowderButton);
        
        ImageIcon shakeImageIcon = new ImageIcon("src/imgs/shake.png");
        Image shakeImage = shakeImageIcon.getImage();
        Image shakeNewimg = shakeImage.getScaledInstance(80, 80,  java.awt.Image.SCALE_SMOOTH);
        Icon shakeIcon = new ImageIcon(shakeNewimg);
        shakeButton = new JButton(shakeIcon);
        shakeButton.addActionListener(this);
        shakeButton.setVisible(false);
        c.add(shakeButton);
        
        ImageIcon chocmilkImageIcon = new ImageIcon("src/imgs/chocmilk.png"); // load the image to a imageIcon
        Image chocmilkImage = chocmilkImageIcon.getImage(); // transform it 
        Image chocmilkNewimg = chocmilkImage.getScaledInstance(80, 80,  java.awt.Image.SCALE_SMOOTH);
        Icon chocmilkIcon = new ImageIcon(chocmilkNewimg);
        chocolatemilkButton = new JButton(chocmilkIcon);
        chocolatemilkButton.addActionListener(this);
        chocolatemilkButton.setVisible(false);
        c.add(chocolatemilkButton);
        
        ImageIcon teaImageIcon = new ImageIcon("src/imgs/tea.png");
        Image teaImage = teaImageIcon.getImage();
        Image teaNewimg = teaImage.getScaledInstance(80, 80,  java.awt.Image.SCALE_SMOOTH);
        Icon teaIcon = new ImageIcon(teaNewimg);
        teaflavoringButton = new JButton(teaIcon);
        teaflavoringButton.addActionListener(this);
        teaflavoringButton.setVisible(false);
        c.add(teaflavoringButton);
        
        ImageIcon clubsodaImageIcon = new ImageIcon("src/imgs/clubsoda.png");
        Image clubsodaImage = clubsodaImageIcon.getImage();
        Image clubsodaNewimg = clubsodaImage.getScaledInstance(80, 80,  java.awt.Image.SCALE_SMOOTH);
        Icon clubsodaIcon = new ImageIcon(clubsodaNewimg);
        sparkingwaterButton = new JButton(clubsodaIcon);
        sparkingwaterButton.addActionListener(this);
        sparkingwaterButton.setVisible(false);
        c.add(sparkingwaterButton);
        
        ImageIcon syrupImageIcon = new ImageIcon("src/imgs/syrup.png");
        Image syrupImage = syrupImageIcon.getImage();
        Image syrupNewimg = syrupImage.getScaledInstance(80, 80,  java.awt.Image.SCALE_SMOOTH);
        Icon syrupIcon = new ImageIcon(syrupNewimg);
        syrupButton = new JButton(syrupIcon);
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
            
        ImageIcon loseImageIcon = new ImageIcon("src/imgs/losescreen.png");
        Image loseImage = loseImageIcon.getImage();
        Image loseNewimg = loseImage.getScaledInstance(400, 600,  java.awt.Image.SCALE_SMOOTH);
        Icon loseIcon = new ImageIcon(loseNewimg);
        wrongLabel = new JLabel(loseIcon);
        wrongLabel.setVisible(false);
        c.add(wrongLabel);
        
        ImageIcon winImageIcon = new ImageIcon("src/imgs/winscreen.png");
        Image winImage = winImageIcon.getImage();
        Image winNewimg = winImage.getScaledInstance(400, 600,  java.awt.Image.SCALE_SMOOTH);
        Icon winIcon = new ImageIcon(winNewimg);
        rightLabel = new JLabel(winIcon);
        rightLabel.setVisible(false);
        c.add(rightLabel);
    }

    public static void main(String[] args) {
        Howards_eCafe window = new Howards_eCafe();
        window.setBounds(100, 100, 400, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	System.out.println(correct);
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
        	drink = 1;
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
            coffeeButton.setVisible(true);
            chocolatepowderButton.setVisible(true);
            whippedcreamButton.setVisible(true);
            matchapowderButton.setVisible(true);
            shakeButton.setVisible(true);
            chocolatemilkButton.setVisible(true);
            teaflavoringButton.setVisible(true);
            sparkingwaterButton.setVisible(true);
            syrupButton.setVisible(true);
            croissantButton.setVisible(false);
            chocchipcookieButton.setVisible(false);
            bananabreadButton.setVisible(false);
            donutButton.setVisible(false);
            lemonloafButton.setVisible(false);}
            	
        else if (e.getSource() == hotchocolateButton) {
        	drink = 2;
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
            coffeeButton.setVisible(true);
            chocolatepowderButton.setVisible(true);
            whippedcreamButton.setVisible(true);
            matchapowderButton.setVisible(true);
            shakeButton.setVisible(true);
            chocolatemilkButton.setVisible(true);
            teaflavoringButton.setVisible(true);
            sparkingwaterButton.setVisible(true);
            syrupButton.setVisible(true);
            croissantButton.setVisible(false);
            chocchipcookieButton.setVisible(false);
            bananabreadButton.setVisible(false);
            donutButton.setVisible(false);
            lemonloafButton.setVisible(false);
            
        } else if (e.getSource() == mochaButton) { 
        	drink = 3;
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
            coffeeButton.setVisible(true);
            chocolatepowderButton.setVisible(true);
            whippedcreamButton.setVisible(true);
            matchapowderButton.setVisible(true);
            shakeButton.setVisible(true);
            chocolatemilkButton.setVisible(true);
            teaflavoringButton.setVisible(true);
            sparkingwaterButton.setVisible(true);
            syrupButton.setVisible(true);
            croissantButton.setVisible(false);
            chocchipcookieButton.setVisible(false);
            bananabreadButton.setVisible(false);
            donutButton.setVisible(false);
            lemonloafButton.setVisible(false);
            
        } else if (e.getSource() == matchaButton) { 
        	drink = 4;
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
            coffeeButton.setVisible(true);
            chocolatepowderButton.setVisible(true);
            whippedcreamButton.setVisible(true);
            matchapowderButton.setVisible(true);
            shakeButton.setVisible(true);
            chocolatemilkButton.setVisible(true);
            teaflavoringButton.setVisible(true);
            sparkingwaterButton.setVisible(true);
            syrupButton.setVisible(true);
            croissantButton.setVisible(false);
            chocchipcookieButton.setVisible(false);
            bananabreadButton.setVisible(false);
            donutButton.setVisible(false);
            lemonloafButton.setVisible(false);
            
        } else if (e.getSource() == sodaButton) {
        	drink = 5;
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
            coffeeButton.setVisible(true);
            chocolatepowderButton.setVisible(true);
            whippedcreamButton.setVisible(true);
            matchapowderButton.setVisible(true);
            shakeButton.setVisible(true);
            chocolatemilkButton.setVisible(true);
            teaflavoringButton.setVisible(true);
            sparkingwaterButton.setVisible(true);
            syrupButton.setVisible(true);
            croissantButton.setVisible(false);
            chocchipcookieButton.setVisible(false);
            bananabreadButton.setVisible(false);
            donutButton.setVisible(false);
            lemonloafButton.setVisible(false);
            
        } else if (e.getSource() == icedTeaButton) {
        	drink = 6;
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
            coffeeButton.setVisible(true);
            chocolatepowderButton.setVisible(true);
            whippedcreamButton.setVisible(true);
            matchapowderButton.setVisible(true);
            shakeButton.setVisible(true);
            chocolatemilkButton.setVisible(true);
            teaflavoringButton.setVisible(true);
            sparkingwaterButton.setVisible(true);
            syrupButton.setVisible(true);
            croissantButton.setVisible(false);
            chocchipcookieButton.setVisible(false);
            bananabreadButton.setVisible(false);
            donutButton.setVisible(false);
            lemonloafButton.setVisible(false);
            
        }
        
        //Latte checking if the order is correct
        else if (drink == 1 && e.getSource() == iceButton && correct == 0) {
        	System.out.println("Ice");
        	iceButton.setVisible(false);
        	correct = 1;
        }
        else if (drink == 1 && e.getSource() == iceButton && correct != 0) {
        	correct = 20;
        }
        
        else if (drink == 1 && e.getSource() == milkButton && correct == 1) {
        	System.out.println("Milk");
        	milkButton.setVisible(false);
       		correct = 2;
        }
        
        else if (drink == 1 && e.getSource() == milkButton && correct != 1) {
        	System.out.println("Milk");
        	milkButton.setVisible(false);
       		correct = 20;
        }
        
        else if (drink == 1 && e.getSource() == coffeeButton && correct == 2) {
        	System.out.println("Coffee");
        	milkButton.setVisible(false);
       		correct = 10;
        }
        
        else if (drink == 1 && e.getSource() == coffeeButton && correct != 2) {
        	System.out.println("Coffee");
        	milkButton.setVisible(false);
       		correct = 20;
        }
        
        else if (drink == 1 && (e.getSource() == chocolatepowderButton || e.getSource() == whippedcreamButton || e.getSource() == matchapowderButton || e.getSource() == shakeButton || e.getSource() == chocolatemilkButton || e.getSource() == teaflavoringButton || e.getSource() == sparkingwaterButton || e.getSource() == syrupButton || e.getSource() == croissantButton || e.getSource() == chocchipcookieButton || e.getSource() == bananabreadButton || e.getSource() == donutButton || e.getSource() == lemonloafButton)) {
        	System.out.println("wrong");
        	correct = 20;
        }
        
        
        //Check if making hot chocolate order is correct or not
        else if (drink == 2 && e.getSource() == chocolatepowderButton && correct == 0) {
        	System.out.println("Choc powder");
        	chocolatepowderButton.setVisible(false);
        	correct = 1;
        	System.out.println(correct);
        }
        else if (drink == 2 && e.getSource() == chocolatepowderButton && correct != 0) {
        	System.out.println("You died");
        	correct = 20;
        }
        else if (drink == 2 && e.getSource() == milkButton && correct == 1) {
        	System.out.println("Milk");
        	milkButton.setVisible(false);
       		correct = 2;
       		System.out.println(correct);
        }
        
        else if (drink == 2 && e.getSource() == milkButton && correct != 1) {
        	System.out.println("Milk");
        	milkButton.setVisible(false);
       		correct = 20;
        }
        
        else if (drink == 2 && e.getSource() == whippedcreamButton && correct == 2) {
        	System.out.println("Whip cream");
        	whippedcreamButton.setVisible(false);
       		correct = 10;
        }
        
        else if (drink == 2 && e.getSource() == whippedcreamButton && correct != 2) {
        	System.out.println("whip cream");
        	whippedcreamButton.setVisible(false);
       		correct = 2;
        }
        
     // Mocha checking the order
        else if (drink == 3 && e.getSource() == iceButton && correct == 0) {
            System.out.println("Ice");
            iceButton.setVisible(false);
            correct = 1;
        }
        else if (drink == 3 && e.getSource() == iceButton && correct != 0) {
            correct = 20;
        }

        else if (drink == 3 && e.getSource() == chocolatemilkButton && correct == 1) {
            System.out.println("Chocolate Milk");
            chocolatemilkButton.setVisible(false);
            correct = 2;
        }

        else if (drink == 3 && e.getSource() == chocolatemilkButton && correct != 1) {
            correct = 20;
        }

        else if (drink == 3 && e.getSource() == coffeeButton && correct == 2) {
            System.out.println("Coffee");
            coffeeButton.setVisible(false);
            correct = 10;
        }

        else if (drink == 3 && e.getSource() == coffeeButton && correct != 2) {
            correct = 20;
        }

        else if (drink == 3 && (e.getSource() == milkButton || e.getSource() == chocolatepowderButton || e.getSource() == whippedcreamButton || e.getSource() == matchapowderButton || e.getSource() == shakeButton || e.getSource() == teaflavoringButton || e.getSource() == sparkingwaterButton || e.getSource() == syrupButton || e.getSource() == croissantButton || e.getSource() == chocchipcookieButton || e.getSource() == bananabreadButton || e.getSource() == donutButton || e.getSource() == lemonloafButton)) {
            System.out.println("wrong");
            correct = 20;
        }
       
       
     // Matcha checking the order
        else if (drink == 4 && e.getSource() == iceButton && correct == 0) {
            System.out.println("Ice");
            iceButton.setVisible(false);
            correct = 1;
        }
        else if (drink == 4 && e.getSource() == iceButton && correct != 0) {
            correct = 20;
        }
        else if (drink == 4 && e.getSource() == matchapowderButton && correct == 1) {
            System.out.println("Matcha Powder");
            matchapowderButton.setVisible(false);
            correct = 2;
        }
        else if (drink == 4 && e.getSource() == matchapowderButton && correct != 1) {
            correct = 20;
        }
        else if (drink == 4 && e.getSource() == milkButton && correct == 2) {
            System.out.println("Milk");
            milkButton.setVisible(true);
            correct = 3;
        }
        else if (drink == 4 && e.getSource() == milkButton && correct == 4) {
            System.out.println("Milk");
            milkButton.setVisible(false);
            correct = 10;
        }
        else if ((drink == 4 && e.getSource() == milkButton && correct != 4) && (drink == 4 && e.getSource() == milkButton && correct != 2)) {
            correct = 20;
        }
        else if (drink == 4 && e.getSource() == shakeButton && correct == 3) {
            System.out.println("Shake");
            shakeButton.setVisible(false);
            correct = 4;
        }
        else if (drink == 4 && e.getSource() == shakeButton && correct != 3) {
            correct = 20;
        }
        else if (drink == 4 && (e.getSource() == chocolatemilkButton || e.getSource() == chocolatepowderButton || e.getSource() == whippedcreamButton || e.getSource() == teaflavoringButton || e.getSource() == sparkingwaterButton || e.getSource() == syrupButton || e.getSource() == croissantButton || e.getSource() == chocchipcookieButton || e.getSource() == bananabreadButton || e.getSource() == donutButton || e.getSource() == lemonloafButton)) {
            System.out.println("wrong");
            correct = 20;
        }
          
        //Soda checking order
        else if (drink == 5 && e.getSource() == iceButton && correct == 0) {
            System.out.println("Ice");
            iceButton.setVisible(false);
            correct = 1;
        }
        else if (drink == 5 && e.getSource() == iceButton && correct != 0) {
            correct = 20;
        }
        else if (drink == 5 && e.getSource() == sparkingwaterButton && correct == 1) {
            System.out.println("Sparkling Water");
            sparkingwaterButton.setVisible(false);
            correct = 2;
        }
        else if (drink == 5 && e.getSource() == sparkingwaterButton && correct != 1) {
            correct = 20;
        }
        else if (drink == 5 && e.getSource() == syrupButton && correct == 2) {
            System.out.println("Syrup");
            syrupButton.setVisible(false);
            correct = 10;
        }
        else if (drink == 5 && e.getSource() == syrupButton && correct != 2) {
            correct = 20;
        }
        else if (drink == 5 && (e.getSource() == milkButton || e.getSource() == coffeeButton || e.getSource() == chocolatepowderButton || e.getSource() == whippedcreamButton || e.getSource() == matchapowderButton || e.getSource() == shakeButton || e.getSource() == chocolatemilkButton || e.getSource() == teaflavoringButton || e.getSource() == croissantButton || e.getSource() == chocchipcookieButton || e.getSource() == bananabreadButton || e.getSource() == donutButton || e.getSource() == lemonloafButton)) {
            System.out.println("wrong");
            correct = 20;
        }
        
         // Iced Tea checking order
        else if (drink == 6 && e.getSource() == iceButton && correct == 0) {
            System.out.println("Ice");
            iceButton.setVisible(false);
            correct = 1;
        }
        else if (drink == 6 && e.getSource() == iceButton && correct != 0) {
            correct = 20;
        }
        else if (drink == 6 && e.getSource() == milkButton && correct == 1) {
            System.out.println("Milk");
            milkButton.setVisible(false);
            correct = 2;
        }
        else if (drink == 6 && e.getSource() == milkButton && correct != 1) {
            correct = 20;
        }
        else if (drink == 6 && e.getSource() == teaflavoringButton && correct == 2) {
            System.out.println("Tea Flavoring");
            teaflavoringButton.setVisible(false);
            correct = 10;
        }
        else if (drink == 6 && e.getSource() == teaflavoringButton && correct != 2) {
            correct = 20;
        }
        else if (drink == 6 && (e.getSource() == coffeeButton || e.getSource() == chocolatepowderButton || e.getSource() == whippedcreamButton || e.getSource() == matchapowderButton || e.getSource() == shakeButton || e.getSource() == chocolatemilkButton || e.getSource() == sparkingwaterButton || e.getSource() == syrupButton || e.getSource() == croissantButton || e.getSource() == chocchipcookieButton || e.getSource() == bananabreadButton || e.getSource() == donutButton || e.getSource() == lemonloafButton)) {
            System.out.println("wrong");
            correct = 20;
            
        }
        
                /*else if (drink == 2 && (e.getSource() == coffeeButton || e.getSource() == iceButton || e.getSource() == matchapowderButton || e.getSource() == shakeButton || e.getSource() == chocolatemilkButton || e.getSource() == teaflavoringButton || e.getSource() == sparkingwaterButton || e.getSource() == syrupButton || e.getSource() == croissantButton || e.getSource() == chocchipcookieButton || e.getSource() == bananabreadButton || e.getSource() == donutButton || e.getSource() == lemonloafButton)) {
        	correct = 20;
        }*/
        
        //Correct or not screens
        if (correct == 10) {
        	System.out.println("You got it right!");
        	welcomeLabel.setVisible(false);
            continueButton.setVisible(false);
            latteButton.setVisible(false);
            hotchocolateButton.setVisible(false);
            mochaButton.setVisible(false);
            matchaButton.setVisible(false);
            sodaButton.setVisible(false);
            icedTeaButton.setVisible(false);
            iceButton.setVisible(false);
            milkButton.setVisible(false);
            coffeeButton.setVisible(false);
            chocolatepowderButton.setVisible(false);
            whippedcreamButton.setVisible(false);
            matchapowderButton.setVisible(false);
            shakeButton.setVisible(false);
            chocolatemilkButton.setVisible(false);
            teaflavoringButton.setVisible(false);
            sparkingwaterButton.setVisible(false);
            syrupButton.setVisible(false);
            croissantButton.setVisible(false);
            chocchipcookieButton.setVisible(false);
            bananabreadButton.setVisible(false);
            donutButton.setVisible(false);
            lemonloafButton.setVisible(false);
            rightLabel.setVisible(true);
        }
        if (correct == 20) {
        	System.out.println("You got it wrong.");
        	welcomeLabel.setVisible(false);
            continueButton.setVisible(false);
            latteButton.setVisible(false);
            hotchocolateButton.setVisible(false);
            mochaButton.setVisible(false);
            matchaButton.setVisible(false);
            sodaButton.setVisible(false);
            icedTeaButton.setVisible(false);
            iceButton.setVisible(false);
            milkButton.setVisible(false);
            coffeeButton.setVisible(false);
            chocolatepowderButton.setVisible(false);
            whippedcreamButton.setVisible(false);
            matchapowderButton.setVisible(false);
            shakeButton.setVisible(false);
            chocolatemilkButton.setVisible(false);
            teaflavoringButton.setVisible(false);
            sparkingwaterButton.setVisible(false);
            syrupButton.setVisible(false);
            croissantButton.setVisible(false);
            chocchipcookieButton.setVisible(false);
            bananabreadButton.setVisible(false);
            donutButton.setVisible(false);
            lemonloafButton.setVisible(false);
            wrongLabel.setVisible(true);
           
        }
    }
}

