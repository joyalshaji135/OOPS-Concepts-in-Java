import java.io.*; import java.net.*; import java.awt.*;
import java.awt.event.*;
class SFrame extends Frame implements ActionListener
{
Button bst,bs,br,be; TextField t;
List I; ServerSocket ss; Socket s;
DataInputStream sin; DataOutputStream sout; public SFrame()
{
super("Server"); t=new TextField(10); I=new List(5);
bst=new Button("Listen"); bs=new Button("Send"); br=new Button("Receive"); be=new Button("Exit"); setLayout(new FlowLayout()); add(bst);
add(be);
add(I);
add(br);
add(t);
 
add(bs); bst.addActionListener(this); bs.addActionListener(this); be.addActionListener(this); br.addActionListener(this); setSize(300,300); setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
try
{
if(ae.getSource()==bst)
{
ss=new ServerSocket(8888); s=ss.accept();
sin=new DataInputStream(s.getInputStream()); sout=new DataOutputStream(s.getOutputStream());
}
else if(ae.getSource()==bs)
{
sout.writeUTF(t.getText()); I.add(t.getText());
t.setText(" ");
}
else if(ae.getSource()==br)
{
String str=sin.readUTF(); I.add(str);
}
else
{
System.exit(0);
}
}
catch(Exception e)
{
System.out.println("Error:"+e);
}
}
}
public class chatboxserver
{
public static void main(String ar[]) { SFrame obj=new SFrame();
}
}
