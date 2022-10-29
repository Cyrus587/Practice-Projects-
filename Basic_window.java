import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class Game {
    JFrame window;
    Container = new Con; // creating the varible for the JFrame

    public static void main( String[] args) {
        new Game(); //calling the Frame
    }
    public Game (){
        JFrame window = new JFrame();
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
        window.setVisible(true); 
        Con = window.getContainerPane();
        }
    
}

