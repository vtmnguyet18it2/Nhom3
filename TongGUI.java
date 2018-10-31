package demmo;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TongGUI extends JFrame implements ActionListener {
  JLabel lblSoN;
  JTextField tfSoN;
  JLabel lblKQ;
  JTextField tfKQ;
  JButton btnTT;
  public TongGUI(){
	    lblSoN= new JLabel();
		lblSoN.setText("Số N");
		tfSoN= new JTextField(10);
		lblKQ=new JLabel();
		lblKQ.setText("Kết Quả");
		tfKQ=new JTextField(20);
		btnTT =new JButton();
	    btnTT.setText("Tính Tong");
	    
	    btnTT.addActionListener(this);
	    Container cont= this.getContentPane();
	    setSize(400, 200);
	    cont.setLayout(new FlowLayout());
	    cont.add(lblSoN);
	    cont.add(tfSoN);
	    cont.add(lblKQ);
	    cont.add(tfKQ);
	    cont.add(btnTT);
	    setVisible(true);
	    
  }
  public void actionPerformed (ActionEvent e){
	  String SoN=tfSoN.getText();
	  int n= Integer.parseInt(SoN);
	  float tong=0;
	  //	Tính S=1+1/2+1/3+...+1/n
	  for (int i = 1; i <= n; i++) 
	  {
          tong += (float) 1/i; 
      }
         
	  tfKQ.setText(String.valueOf(tong));
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    TongGUI obj=new TongGUI();
	}

}
