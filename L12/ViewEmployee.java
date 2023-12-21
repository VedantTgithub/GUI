import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class ViewEmployee extends JFrame
{
Container c;
TextArea taData;
JButton btnBack;


ViewEmployee()
{
c=getContentPane();
c.setLayout(new FlowLayout());

taData=new TextArea(8,13);
btnBack=new JButton("Back to main");

Font f=new Font("Arial",Font.BOLD,40);

taData.setFont(f);
btnBack.setFont(f);

c.add(taData);
c.add(btnBack);



ActionListener b=(ae)->{
   Home h=new Home();
	dispose();
};
btnBack.addActionListener(b);

setSize(800,400);
setLocationRelativeTo(null);
setTitle("My First App");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);


}

}
