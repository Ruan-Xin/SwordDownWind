/*��ʱ������*/
package dialogPackage;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

import PersonAll.PersonAll;
import basePackage.LenthAll;
import basePackage.MyDialog;


public class fightDialog extends JDialog{
	private String blanck = "                        ";
	private JPanel jp1;
	private JButton attack = new JButton("����");
	private JButton defence = new JButton("ʹ�õ���");
	private JButton Skill = new JButton("ʹ�ü���");
	private JButton leave = new JButton("����");
	public fightDialog(PersonAll player,PersonAll boss) {
		// TODO Auto-generated constructor stub
		jp1 = new JPanel();
		GridLayout gl = new GridLayout(2, 2);
		jp1.setLayout(gl);
		jp1.add(attack);
		jp1.add(defence);
		jp1.add(Skill);
		jp1.add(leave);
		attack.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
			}
		});
		this.add(jp1); 
		this.setBounds(450, 500, LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
	}
}
