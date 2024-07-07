import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;
public class Menu_Program implements ActionListener
{ 
    JFrame frame;
JMenuBar mb; JMenu M1,M2,M3;
JMenuItem MI1,MI2,MI3,MI4,MI5,MI6,MI7;
Menu_Program()
{
frame=new JFrame("Menu"); mb=new JMenuBar();M1=new JMenu("File");M2=new JMenu("Edit");M3=new JMenu("view");MI1=new JMenuItem("New");
MI2=new JMenuItem("Open"); MI3=new JMenuItem("Exit"); MI4=new JMenuItem("Copy"); MI5=new JMenuItem("Paste"); MI6=new JMenuItem("cut"); MI7=new JMenuItem("ToolBars"); M1.add(MI1);
M1.add(MI2);
M1.add(MI3);
M2.add(MI4);
M2.add(MI5);
M2.add(MI6);
M3.add(MI7);
mb.add(M1);
mb.add(M2);
mb.add(M3); frame.setJMenuBar(mb); frame.setSize(300,300); frame.setVisible(true); frame.setLayout(null);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); M1.addActionListener(this);
M2.addActionListener(this); M3.addActionListener(this); MI1.addActionListener(this); MI2.addActionListener(this); MI3.addActionListener(this); MI4.addActionListener(this); MI5.addActionListener(this); MI6.addActionListener(this);
 
MI7.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==MI1)
{
JOptionPane.showMessageDialog(frame,"You Selected New");
}
if(ae.getSource()==MI2)
{
JOptionPane.showMessageDialog(frame,"You Selected Open");
}
if(ae.getSource()==MI3)
{
JOptionPane.showMessageDialog(frame,"You Selected Exit");
}
if(ae.getSource()==MI4)
{
JOptionPane.showMessageDialog(frame,"You Selected Copy");
}
if(ae.getSource()==MI5)
{
JOptionPane.showMessageDialog(frame,"You Selected Paste");
}
if(ae.getSource()==MI6)
{
JOptionPane.showMessageDialog(frame,"You Selected Cut");
}
if(ae.getSource()==MI7)
{
JOptionPane.showMessageDialog(frame,"You Selected ToolBars");
}
}
public static void main(String arg[])
{
new Menu_Program();
}
}
