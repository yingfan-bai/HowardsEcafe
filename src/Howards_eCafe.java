import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Howards_eCafe extends JFrame implements ActionListener {

    private JLabel welcomeLabel;
    private JButton continueButton;
    private JButton latteButton;
    private JButton hotchocolateButton;
    private JButton mochaButton;
    private JButton matchaButton;
    private JButton sodaButton;
    private JButton icedTeaButton;
    private JButton instructionsButton;
    private JButton menuButton;
    
    private JLabel latteInstructions;
      
    private JButton iceButton;
    private JButton milkButton;
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
    private JLabel backgroundLabel;
    private JLabel recipeLabel;
    private JLayeredPane layeredPane;
    
    public int correct = 0;
    public int drink = 0;
    private Clip correctClip;
    private Clip wrongClip;

    public Howards_eCafe() {
        super("Howards_eCafe");

        Container c = getContentPane();
        c.setBackground(Color.white);
        c.setLayout(new FlowLayout());

        welcomeLabel = new JLabel("Welcome to Howards eCafe!");
        //c.add(welcomeLabel);
        
     // Create a layered pane
        layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(400, 600)); // Set the size of the layered pane
        
        // Load the background image
        ImageIcon backgroundImageIcon = new ImageIcon("src/imgs/startscreennostart.png");
        Image backgroundImage = backgroundImageIcon.getImage();
        Image scaledBackgroundImage = backgroundImage.getScaledInstance(400, 600, Image.SCALE_SMOOTH); // Adjust the size as needed
        ImageIcon scaledBackgroundIcon = new ImageIcon(scaledBackgroundImage);

        // Create a JLabel with the background image and add it to the layered pane
        JLabel backgroundLabel = new JLabel(scaledBackgroundIcon);
        backgroundLabel.setBounds(-5, 0, 400, 600); // Set the bounds to cover the entire layered pane
        layeredPane.add(backgroundLabel, JLayeredPane.DEFAULT_LAYER); // Add the background to the default layer
        
        // Add other components (buttons, labels, etc.) directly to the content pane of the layered pane
        ImageIcon startImageIcon = new ImageIcon("src/imgs/startbutton.png");
        Image startImage = startImageIcon.getImage();
        Image startNewimg = startImage.getScaledInstance(136, 53,  java.awt.Image.SCALE_SMOOTH);
        Icon startIcon = new ImageIcon(startNewimg);
        continueButton = new JButton(startIcon);
        continueButton.setBounds(135, 400, 136, 53); // Set the bounds of the button
        continueButton.addActionListener(this);
        layeredPane.add(continueButton, JLayeredPane.PALETTE_LAYER); // Add the button to the palette layer

        // Add the layered pane to the frame
        getContentPane().add(layeredPane, BorderLayout.CENTER);

        setSize(400, 400); // Adjust the size according to your needs
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        //Menu
                        
        ImageIcon latteImageIcon = new ImageIcon("src/imgs/icedlatte.png");
        Image latteImage = latteImageIcon.getImage();
        Image latteNewimg = latteImage.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH);
        Icon latteIcon = new ImageIcon(latteNewimg);
        latteButton = new JButton(latteIcon);
        latteButton.addActionListener(this);
        latteButton.setVisible(false);
        c.add(latteButton);
        
        ImageIcon hotchocImageIcon = new ImageIcon("src/imgs/hotchoc.png");
        Image hotchocImage = hotchocImageIcon.getImage();
        Image hotchocNewimg = hotchocImage.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH);
        Icon hotchocIcon = new ImageIcon(hotchocNewimg);
        hotchocolateButton = new JButton(hotchocIcon);
        hotchocolateButton.addActionListener(this);
        hotchocolateButton.setVisible(false);
        c.add(hotchocolateButton);

        ImageIcon mochaImageIcon = new ImageIcon("src/imgs/mocha.png");
        Image mochaImage = mochaImageIcon.getImage();
        Image mochaNewimg = mochaImage.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH);
        Icon mochaIcon = new ImageIcon(mochaNewimg);
        mochaButton = new JButton(mochaIcon);
        mochaButton.addActionListener(this);
        mochaButton.setVisible(false);
        c.add(mochaButton);

        ImageIcon matchaImageIcon = new ImageIcon("src/imgs/matcha.png");
        Image matchaImage = matchaImageIcon.getImage();
        Image matchaNewimg = matchaImage.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH);
        Icon matchaIcon = new ImageIcon(matchaNewimg);
        matchaButton = new JButton(matchaIcon);
        matchaButton.addActionListener(this);
        matchaButton.setVisible(false);
        c.add(matchaButton);

        ImageIcon sodaImageIcon = new ImageIcon("src/imgs/soda.png");
        Image sodaImage = sodaImageIcon.getImage();
        Image sodaNewimg = sodaImage.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH);
        Icon sodaIcon = new ImageIcon(sodaNewimg);
        sodaButton = new JButton(sodaIcon);
        sodaButton.addActionListener(this);
        sodaButton.setVisible(false);
        c.add(sodaButton);
        
        ImageIcon icedteaImageIcon = new ImageIcon("src/imgs/icedtea.png");
        Image icedteaImage = icedteaImageIcon.getImage();
        Image icedteaNewimg = icedteaImage.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH);
        Icon icedteaIcon = new ImageIcon(icedteaNewimg);
        icedTeaButton = new JButton(icedteaIcon);
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
        
        instructionsButton = new JButton("Instructions");
        instructionsButton.addActionListener(this);
        instructionsButton.setVisible(false);
        c.add(instructionsButton);

        menuButton = new JButton("Return to Menu");
        menuButton.addActionListener(this);
        menuButton.setVisible(false);
        c.add(menuButton);
            
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
        
        ImageIcon recipeImageIcon = new ImageIcon("src/imgs/recipes.png");
        Image recipeImage = recipeImageIcon.getImage();
        Image recipeNewimg = recipeImage.getScaledInstance(350, 500,  java.awt.Image.SCALE_SMOOTH);
        Icon recipeIcon = new ImageIcon(recipeNewimg);
        recipeLabel = new JLabel(recipeIcon);
        recipeLabel.setVisible(false);
        c.add(recipeLabel);
        
        try {
            AudioInputStream correctAudioStream = AudioSystem.getAudioInputStream(new File("src/audio/correct_answer.wav"));
            correctClip = AudioSystem.getClip();
            correctClip.open(correctAudioStream);

            AudioInputStream wrongAudioStream = AudioSystem.getAudioInputStream(new File("src/audio/wrong_answer.wav"));
            wrongClip = AudioSystem.getClip();
            wrongClip.open(wrongAudioStream);
        } catch (Exception e) { //catch is used to handle exceptions, it declares  that this block can handle exceptions of type Exception
            e.printStackTrace(); //The variable e is a reference to the actual exception object that was thrown.
//printStackTrace() is a method of the Throwable class (which Exception extends) that prints the stack trace of the exception to the standard error stream. The stack trace is a list of method calls that shows where the exception occurred, which is useful for debugging
            e.printStackTrace();
        }        
        playBackgroundMusic("src/audio/background_music.wav");
    }

    public static void main(String[] args) {
        Howards_eCafe window = new Howards_eCafe();
        window.setBounds(100, 100, 400, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
    
    private void playBackgroundMusic(String filePath) {
        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(new File(filePath));
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void playSoundEffect(String filePath) {
        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(new File(filePath));
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == continueButton) {
        	System.out.println("continute");
            welcomeLabel.setVisible(false);
            recipeLabel.setVisible(false);
            layeredPane.setVisible(false);
            continueButton.setVisible(false);
            latteButton.setVisible(true);
            hotchocolateButton.setVisible(true);
            mochaButton.setVisible(true);
            matchaButton.setVisible(true);
            sodaButton.setVisible(true);
            icedTeaButton.setVisible(true);
            instructionsButton.setVisible(true);
            menuButton.setVisible(false);
            
        } else if (e.getSource() == latteButton) {
        	drink = 1;
        	welcomeLabel.setVisible(false);
        	recipeLabel.setVisible(false);
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
            instructionsButton.setVisible(false);
            menuButton.setVisible(false);
            }
            	
        else if (e.getSource() == hotchocolateButton) {
        	drink = 2;
        	welcomeLabel.setVisible(false);
        	recipeLabel.setVisible(false);
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
            instructionsButton.setVisible(false);
            menuButton.setVisible(false);            
            
        } else if (e.getSource() == mochaButton) { 
        	drink = 3;
        	welcomeLabel.setVisible(false);
        	recipeLabel.setVisible(false);
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
            instructionsButton.setVisible(false);
            menuButton.setVisible(false);           
            
        } else if (e.getSource() == matchaButton) { 
        	drink = 4;
        	welcomeLabel.setVisible(false);
        	recipeLabel.setVisible(false);
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
            instructionsButton.setVisible(false);
            menuButton.setVisible(false);
                       
        } else if (e.getSource() == sodaButton) {
        	drink = 5;
        	welcomeLabel.setVisible(false);
        	recipeLabel.setVisible(false);
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
            instructionsButton.setVisible(false);
            menuButton.setVisible(false);          
            
        } else if (e.getSource() == icedTeaButton) {
        	drink = 6;
        	welcomeLabel.setVisible(false);
        	recipeLabel.setVisible(false);
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
            instructionsButton.setVisible(false);
            menuButton.setVisible(false); 
            
            
        } else if (e.getSource() == instructionsButton) {
                continueButton.setVisible(false);
                recipeLabel.setVisible(true);
                instructionsButton.setVisible(false);
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
                menuButton.setVisible(true); 
                
        } else if (e.getSource() == menuButton) {
            continueButton.setVisible(false);
            instructionsButton.setVisible(true);
            welcomeLabel.setVisible(false);
            recipeLabel.setVisible(false);
            continueButton.setVisible(false);
            latteButton.setVisible(true);
            hotchocolateButton.setVisible(true);
            mochaButton.setVisible(true);
            matchaButton.setVisible(true);
            sodaButton.setVisible(true);
            icedTeaButton.setVisible(true);
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
            menuButton.setVisible(false); 
            }
                   
        //Latte checking if the order is correct
        if (drink == 1 && e.getSource() == iceButton && correct == 0) {
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
        }
        
        else if (drink == 2 && e.getSource() == chocolatepowderButton && correct != 0) {
        	System.out.println("You died");
        	correct = 20;
        }
        
        else if (drink == 2 && e.getSource() == milkButton && correct == 1) {
        	System.out.println("Milk");
        	milkButton.setVisible(false);
       		correct = 2;
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
        
        else if (drink == 2 && (e.getSource() == iceButton || e.getSource() == coffeeButton || e.getSource() == matchapowderButton || e.getSource() == shakeButton || e.getSource() == chocolatemilkButton || e.getSource() == teaflavoringButton || e.getSource() == sparkingwaterButton || e.getSource() == syrupButton || e.getSource() == croissantButton || e.getSource() == chocchipcookieButton || e.getSource() == bananabreadButton || e.getSource() == donutButton || e.getSource() == lemonloafButton)) {
        	System.out.println("wrong");
        	correct = 20;
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
            instructionsButton.setVisible(false);
            menuButton.setVisible(false);
            playSoundEffect("src/audio/correct_answer.wav"); 
        }

        // After you check if the answer is wrong
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
            instructionsButton.setVisible(false);
            menuButton.setVisible(false);
            playSoundEffect("src/audio/wrong_answer.wav");         
            }
    }
}




