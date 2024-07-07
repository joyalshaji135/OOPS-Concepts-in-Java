import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Labels {
    public static void main(String[] args) {
        
        JLabel label = new JLabel();
        label.setText("Hi How Are You ..........");
        JFrame frame = new JFrame();
        

        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setResizable(false);
        ImageIcon image = new ImageIcon("unremoveed.jpg");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(Color.GREEN);
        frame.setTitle("Label Frame");
        frame.setSize(500,500);
        frame.setVisible(true);
        
        
        
        
        frame.add(label);
    }
}
