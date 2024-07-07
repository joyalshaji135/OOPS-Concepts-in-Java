import java.io.*; import java.net.*;

import Swing.Frame;

import java.awt.*;
import java.awt.event.*;

class CFrame extends Frame implements ActionListener

{

Button bst,bs,br,be; TextField t;
List I; Socket cs;
DataInputStream sin; DataOutputStream sout; public CFrame()
{

super("Client"); t=new TextField(10); I=new List(5);
bst=new Button("Connect"); bs=new Button("Send"); br=new Button("Receive"); be=new Button("Exit"); setLayout(new FlowLayout()); add(bst);
add(be);
add(I);
add(br);
add(t);
add(bs); bst.addActionListener(this); bs.addActionListener(this); be.addActionListener(this);
 
br.addActionListener(this); setSize(300,300); setVisible(true);
}

public void actionPerformed(ActionEvent ae)
{
try

{
if(ae.getSource()==bst)
{

cs=new Socket("localhost",8888);
sin=new DataInputStream(cs.getInputStream()); sout=new DataOutputStream(cs.getOutputStream());
}

else if(ae.getSource()==bs)

{


sout.writeUTF(t.getText()); I.add(t.getText());
t.setText(" ");

}


else if(ae.getSource()==br)

{

String str= sin.readUTF(); I.add(str);
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

public class chatboxclient

{

public static void main(String ar[]) { CFrame obj=new CFrame();
}

}
