import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
/**
 * Write a description of class BattleshipBoard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Battleship implements ActionListener
{
    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel title_panel = new JPanel();
    JPanel button_panel = new JPanel();
    JLabel textfield = new JLabel();
    JButton[] buttons = new JButton[16];
    double missCount = 0;

    Battleship(){
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.getContentPane().setBackground(new Color(50,50,50));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        
        textfield.setBackground(new Color(25,25,25));
        textfield.setForeground(new Color(25,255,0));
        textfield.setFont(new Font("Ink Free",Font.BOLD,50));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText("Battleship");
        textfield.setOpaque(true);
        
        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0,0,800,100);
        
        button_panel.setLayout(new GridLayout(4,4));
        button_panel.setBackground(new Color(150,150,150));
        
        for(int i=0; i<16; i++) {
            buttons[i] = new JButton();
            button_panel.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli",Font.BOLD,120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
            buttons[i].setBackground(Color.white);
        }
        
        int i = (int)(Math.random()*16);
        buttons[i].setText("X");
        buttons[i].setForeground(Color.white);
        if(i == 2 ||i == 3 ||i == 6 ||i == 7 ||i == 10 ||i == 11 ||i == 14 ||i == 15) {
            buttons[i - 1].setText("X");
            buttons[i - 2].setText("X");
            // to make bigger just do "- 3", "- 4", ect.
            // to make smaller do the opposite (ex. get rid of buttons[i - 2].setText("X"))
            buttons[i - 1].setForeground(Color.white);
            buttons[i - 2].setForeground(Color.white);
        }
        else {
            buttons[i + 1].setText("X");
            buttons[i + 2].setText("X");
            // to make bigger just do "+ 3", "+ 4", ect.
            // to make smaller do the opposite (ex. get rid of buttons[i - 2].setText("X"))
            buttons[i + 1].setForeground(Color.white);
            buttons[i + 2].setForeground(Color.white);
        }
        
        title_panel.add(textfield);
        frame.add(title_panel,BorderLayout.NORTH);
        frame.add(button_panel);
          
        firstTurn();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i = 0; i < 16; i++) {
            if(e.getSource() == buttons[i]) {
                   if(buttons[i].getText()=="") {
			buttons[i].setBackground(Color.gray);
			textfield.setText("Miss");
			missCount++;
			check();
                   }
		   if(buttons[i].getText()=="X") {
			buttons[i].setBackground(Color.red);
			textfield.setText("Hit");
			check();
                   }
            }  
        }
    }
    public void firstTurn() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        textfield.setText("Make your guess");
    }
    public void check() {
            if((buttons[0].getBackground() == Color.red)&&
                (buttons[1].getBackground() == Color.red)&&
                (buttons[2].getBackground() == Color.red)) {
                    
                win(0,1,2);
                 
            }
            if((buttons[1].getBackground() == Color.red)&&
                (buttons[2].getBackground() == Color.red)&&
                (buttons[3].getBackground() == Color.red)) {
                    
                win(1,2,3);
                 
            } 
            if((buttons[4].getBackground() == Color.red)&&
                (buttons[5].getBackground() == Color.red)&&
                (buttons[6].getBackground() == Color.red)) {
                    
                win(4,5,6);
                 
            } 
            if((buttons[5].getBackground() == Color.red)&&
                (buttons[6].getBackground() == Color.red)&&
                (buttons[7].getBackground() == Color.red)) {
                    
                win(5,6,7);
                 
            } 
            if((buttons[8].getBackground() == Color.red)&&
                (buttons[9].getBackground() == Color.red)&&
                (buttons[10].getBackground() == Color.red)) {
                    
                win(8,9,10);
                 
            } 
            if((buttons[9].getBackground() == Color.red)&&
                (buttons[10].getBackground() == Color.red)&&
                (buttons[11].getBackground() == Color.red)) {
                    
                win(9,10,11);
                 
            } 
            if((buttons[12].getBackground() == Color.red)&&
                (buttons[13].getBackground() == Color.red)&&
                (buttons[14].getBackground() == Color.red)) {
                    
                win(12,13,14);
                 
            } 
            if((buttons[13].getBackground() == Color.red)&&
                (buttons[14].getBackground() == Color.red)&&
                (buttons[15].getBackground() == Color.red)) {
                
                win(13,14,15);
                 
            } 
    }
    public void win(int a,int b,int c) {
        
        buttons[a].setBackground(Color.green);
        buttons[b].setBackground(Color.green);
        buttons[c].setBackground(Color.green);
        
        double score = (missCount/16.0) * 100;
        score =(100 - score);
        
        for(int i = 0; i < 16; i++) {
            buttons[i].setEnabled(false);
        }
        
        textfield.setText("Your score is " + score +"/100.0");
        
    }
}


