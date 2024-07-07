import java.awt.*;
import java.awt.event.*;


class MyWindowListener implements WindowListener {
    
    public void windowOpened(WindowEvent e) {
        System.out.println("Window Opened");
    }

    
    public void windowClosing(WindowEvent e) {
        System.out.println("Window Closing");
        System.exit(0);
    }

    
    public void windowClosed(WindowEvent e) {
        System.out.println("Window Closed");
    }

    
    public void windowIconified(WindowEvent e) {
        System.out.println("Window Minimized");
    }

   
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window Restored");
    }

    
    public void windowActivated(WindowEvent e) {
        System.out.println("Window Activated");
    }

    
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window Deactivated");
    }
}

public class _15_WindowListenerExample {
    public static void main(String[] args) {
        Frame frame = new Frame("Window Listener Example");

        
        MyWindowListener listener = new MyWindowListener();

        
        frame.addWindowListener(listener);

        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
