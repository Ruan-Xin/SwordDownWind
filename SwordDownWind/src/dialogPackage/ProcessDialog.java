package dialogPackage;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

public class ProcessDialog extends JDialog implements ActionListener{
	private JButton weapon;
	private JButton medicanment;
	private JButton Skill;
	public ProcessDialog() {
		// TODO Auto-generated constructor stub
		weapon = new JButton("װ��");
		medicanment = new JButton("ҩ��");
		Skill = new JButton("����");
		JPanel jp = (JPanel) getContentPane();
		setBounds(400, 300, 500, 150);
		jp.setLayout(new GridLayout(1, 3));
		weapon.addActionListener(this);
		medicanment.addActionListener(this);
		jp.add(weapon);
		jp.add(medicanment);
		jp.add(Skill);
		show();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("װ��")){
			new weaponProcess();
		}
		else if(e.getActionCommand().equals("ҩ��")){
			new medicanmentProcess();
		}
		else if(e.getActionCommand().equals("����")){
			
		}
	}
}