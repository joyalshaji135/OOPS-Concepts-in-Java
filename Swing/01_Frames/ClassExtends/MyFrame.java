import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
    MyFrame()
    {
        this.setTitle("Java Extended Frame");
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setResizable(false);
        this.setSize(420,420);
        this.setVisible(true);

        ImageIcon image = new ImageIcon("./unremoveed.jpg");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(Color.RED);

    }
}
