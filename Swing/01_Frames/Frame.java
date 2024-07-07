import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class Frame{
    public static void main(String[] args) {
        JFrame frame = new JFrame(); // Create a Frame 

        frame.setTitle("Java Frame Code"); // Frame Title of the frame

        // frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);  // DO_NOTHING_ON_CLOSE is not close the window

        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); // Exit out of the Application

        frame.setResizable(false); // Not Resizing the window
        
        frame.setSize(420,420); // Set the Size of the Frame setSize(x,y);  x-Dimensional, y-Dimensional  

        frame.setVisible(true); // make frame visible

        ImageIcon image = new ImageIcon("unremoveed.jpg"); // Create an ImageIcon

        frame.setIconImage(image.getImage()); // change icon of the frame 

        frame.getContentPane().setBackground(Color.GREEN); // Change the color of the windows

        // frame.getContentPane().setBackground(new Color(1,1,1));

    }
}