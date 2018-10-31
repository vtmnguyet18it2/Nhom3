package demmo;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class sqrtGUI extends JFrame implements ActionListener  {
	 JLabel lblSoN;
	  JTextField tfSoN;
	  JLabel lblKQ;
	  JTextField tfKQ;
	  JButton btnTT;
	  public sqrtGUI(){
		    lblSoN= new JLabel();
			lblSoN.setText("Số N");
			tfSoN= new JTextField(10);
			lblKQ=new JLabel();
			lblKQ.setText("Kết Quả");
			tfKQ=new JTextField(20);
			btnTT =new JButton();
		    btnTT.setText("Tính");
		    
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
		  double tong=0;
		  double sqrt;
		  // S=sqrt(1)+sqrt(2)+...
		  for (int i=1;i<=n; i++)
		  {
			 tong=tong+ Math.sqrt(i) ;
		  }
		  tfKQ.setText(String.valueOf(tong));
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 sqrtGUI obj= new sqrtGUI();
	}

}
