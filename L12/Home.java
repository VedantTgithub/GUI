import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Home extends JFrame
{
Container c;
JButton btnAdd,btnView;


Home()
{
c=getContentPane();
c.setLayout(new FlowLayout());

btnAdd=new JButton("ADD");
btnView=new JButton("VIEW");

Font f=new Font("Arial",Font.BOLD,40);

btnAdd.setFont(f);
btnView.setFont(f);


c.add(btnAdd);
c.add(btnView);

ActionListener a=(ae)->{
   AddEmployee x=new AddEmployee();
	dispose();
};
btnAdd.addActionListener(a);

ActionListener b=(ae)->{
   ViewEmployee y=new ViewEmployee();
	dispose();
};
btnView.addActionListener(b);

setSize(800,400);
setLocationRelativeTo(null);
setTitle("My First App");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);


}

}
