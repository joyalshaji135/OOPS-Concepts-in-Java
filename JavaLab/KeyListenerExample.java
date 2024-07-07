import java.awt.*;
import java.awt.event.*;

import Swing.Frame;

public class KeyListenerExample extends Frame implements KeyListener {

    private Label lblInfo;

    public KeyListenerExample() {
        setLayout(new FlowLayout());

        lblInfo = new Label();
        add(lblInfo);

        addKeyListener(this); 

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new KeyListenerExample();
    }

    
    @Override
    public void keyTyped(KeyEvent e) {
        lblInfo.setText("Key Typed: " + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        lblInfo.setText("Key Pressed: " + e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        lblInfo.setText("Key Released: " + e.getKeyChar());
    }
}
