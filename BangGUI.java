package demmo;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class BangGUI extends JFrame implements ActionListener {
  JLabel lblname;
  JTextField tfname;
  JLabel lblpass;
  JTextField tfpass;
  JButton btnlogin;
  JButton btnregis;
  public BangGUI(){
	  lblname=new JLabel();
	  lblname.setText("User Name");
	  tfname=new JTextField(20);
	  lblpass=new JLabel();
	  lblpass.setText("Password");
	  tfpass=new JTextField(20);
	  btnlogin =new JButton();
	  btnlogin.setText("Login");
	  btnregis =new JButton();
	  btnregis.setText("Register");
	  btnlogin.addActionListener(this);
	  btnregis.addActionListener(this);
	  Container cont= this.getContentPane();
	  setSize(500, 500);
	  cont.setLayout(new FlowLayout());
	  cont.add(lblname);
	  cont.add(tfname);
	  cont.add(lblpass);
	  cont.add(tfpass);
	  cont.add(btnlogin);
	  cont.add(btnregis);
	  setVisible(true);
	  
  }
  public void actionPerformed (ActionEvent e){
	  JOptionPane.showConfirmDialog(null,"Hello "+tfname.getText());
	  JOptionPane.showConfirmDialog(null,"Password is "+tfpass.getText());
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 BangGUI obj=new BangGUI();
	}

}
