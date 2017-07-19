import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class employee implements ActionListener,KeyListener
{
	JFrame frm;
	GridLayout grdobj;
	JLabel lbln,lblid,lblpost,lblgen,lbls,lblhobby;
	JTextField txtn,txtid;
	JRadioButton rbm,rbf;
	JComboBox cdx1,cdx2;
	JCheckBox cbs,cbd,cbr,cbc;
	String[] stream={"---Select---","EMP","Mang","CEO"};
	String[] stream1={"--Select--","Part-time","night","morning"};
	JPanel pnlen,pnl1,pnl2;
	JButton btnadd,btndel,btnup;
	ButtonGroup bGp = new ButtonGroup();
	
	public void createcomp()
	{
		frm=new JFrame("EMPLOYEE");
		grdobj=new GridLayout(7,2);

		lbln=new JLabel("NAME:");
		lblid=new JLabel("EMPLOYEE ID");
		lblpost=new JLabel("POST");
		lblgen=new JLabel("GENDER");
		lbls=new JLabel("SHIFT");
		lblhobby=new JLabel("HOBBY");
		
		txtn=new JTextField(10);	
		txtid=new JTextField(10);
	
		rbm=new JRadioButton("MALE");
		bGp.add(rbm);
		rbf=new JRadioButton("FEMALE");
		bGp.add(rbf);

		pnlen=new JPanel();
		pnl1=new JPanel();
		pnl2=new JPanel();

		cdx1=new JComboBox(stream);	
		cdx2=new JComboBox(stream1);

		cbs=new JCheckBox("Singing");
		cbr=new JCheckBox("READING");
		cbd=new JCheckBox("DANCING");
		cbc=new JCheckBox("CRICKET");
		
		btnadd=new JButton("ADD");
		
		btndel=new JButton("DELETE");
		btnup=new JButton("UPDATE"); 	
		
	}
	public void displaycomp()
	{
		frm.setLayout(grdobj);
		frm.add(lbln);
		frm.add(txtn);	
		frm.add(lblid);
		frm.add(txtid);
		
		frm.add(lblgen);
		frm.add(pnlen);
		pnlen.add(rbm);		
		pnlen.add(rbf);

		frm.add(lbls);
		frm.add(cdx2);
		frm.add(lblpost);
		frm.add(cdx1);
		
		
		frm.add(lblhobby);
		frm.add(pnl2);
		pnl2.add(cbs);
		pnl2.add(cbr);
		pnl2.add(cbd);
		pnl2.add(cbc);
		
		frm.add(pnl1);
		pnl1.add(btnadd);
		pnl1.add(btndel);
		pnl1.add(btnup);
	
		frm.setSize(300,300);	
		frm.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource().equals(btnadd) || ae.getSource().equals(btnup) || ae.getSource().equals(btndel))	
		{
			
			if(txtn.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, "Enter Name??__","ERROR",JOptionPane.ERROR_MESSAGE);
			}
			if(txtid.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, "Enter EMPLOYEE ID??__","ERROR",JOptionPane.ERROR_MESSAGE);
			}
			else if(!(rbm.isSelected() ||rbf.isSelected()) )
			{
				JOptionPane.showMessageDialog(null, "Gender???","ERROR",JOptionPane.ERROR_MESSAGE);
			}
			
			else if(cdx1.getSelectedItem().equals("---Select---"))
			{
				JOptionPane.showMessageDialog(null, "Select post ???","ERROR",JOptionPane.ERROR_MESSAGE);
			}
			else if(cdx2.getSelectedItem().equals("--Select--"))
			{
				JOptionPane.showMessageDialog(null, "Select shift ???","ERROR",JOptionPane.ERROR_MESSAGE);
			}
			else if(!(cbr.isSelected() ||cbc.isSelected()||cbd.isSelected()||cbs.isSelected()))
			{
				JOptionPane.showMessageDialog(null, "Select Hobby???","ERROR",JOptionPane.ERROR_MESSAGE);
			}
		}	
		
	}
	public void keyPressed(KeyEvent ke)	
	{
	
	}	
	public void keyReleased(KeyEvent ke)	
	{
	
	}
	public void keyTyped(KeyEvent ke)	
	{
		if(ke.getSource().equals(txtn))
		{
			if(ke.getKeyChar()>='A' && ke.getKeyChar()<='Z' || ke.getKeyChar()>='a' && ke.getKeyChar()<='z')
			{
			
			}
			else
			{	
				if(ke.getKeyChar()=='\b')	
				{
				
				}
				else 
				{
					JOptionPane.showMessageDialog(null, "Enter ALPHABET","ERROR",JOptionPane.ERROR_MESSAGE);
					ke.consume();
				}
			}
		}
		if(ke.getSource().equals(txtid))
		{
			if(ke.getKeyChar()>='0' && ke.getKeyChar()<='9')
			{
			
			}
			else
			{	

				if(ke.getKeyChar()=='\b')    	
				{
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Enter numeric values","ERROR",JOptionPane.ERROR_MESSAGE);
					ke.consume();
				}
			}
		}
	}
	public void reg()
	{
		btnadd.addActionListener(this);
		btndel.addActionListener(this);
		btnup.addActionListener(this);
		

		txtn.addKeyListener(this);
		txtid.addKeyListener(this);
		
	
	}
	public static void main(String args[])
	{
		employee obj=new employee();
		obj.createcomp();
		obj.displaycomp();
		obj.reg();
	}

}