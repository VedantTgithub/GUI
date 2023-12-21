import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;





class AddEmployee extends JFrame
{
Container c;
JLabel labEid,labEname;
JTextField txtEid,txtEname;
JButton btnSave,btnBack;


AddEmployee()
{
c=getContentPane();
c.setLayout(new FlowLayout());

labEid=new JLabel("Employee ID");
txtEid=new JTextField(15);
labEname=new JLabel("Employee Name");
txtEname=new JTextField(15);
btnSave=new JButton("Save");
btnBack=new JButton("Back");

Font f=new Font("Arial",Font.BOLD,40);

labEid.setFont(f);
txtEid.setFont(f);
labEname.setFont(f);
txtEname.setFont(f);
btnSave.setFont(f); 
btnBack.setFont(f);

c.add(labEid);
c.add(txtEid);
c.add(labEname);
c.add(txtEname);
c.add(btnSave); 
c.add(btnBack);


ActionListener a=(ae)->{
Connection con=null;
  try
    {
	
	

 	 DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
         String url="jdbc:mysql://localhost:3306/kc_20dec23";
         con=DriverManager.getConnection(url,"root","abc123");
         System.out.println("Connected");
         

          
   	String sql="insert into employee  values(?,?)";
	PreparedStatement pst=con.prepareStatement(sql);
	int eid=Integer.parseInt(txtEid.getText());
        String name=new String(txtEname.getText());
        pst.setInt(1,eid);
	pst.setString(2,name);
	pst.executeUpdate();
	System.out.println("record inserted");
    }
  catch(Exception e)
	{
			System.out.println(e);
	}
finally
{

try{
con.close();
System.out.println("Disconnected");
}
catch(Exception e)
{
System.out.println("Closing issue" +e);
}
}
   AddEmployee x=new AddEmployee();
	dispose();

};
btnSave.addActionListener(a);

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
