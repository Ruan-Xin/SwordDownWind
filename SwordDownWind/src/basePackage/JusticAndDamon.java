/*�ڶ�����*/
package basePackage;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.omg.CORBA.PUBLIC_MEMBER;

public class JusticAndDamon extends JFrame{
	private Image mImage;
	private threadChange tc;
	public JusticAndDamon() {
		// TODO Auto-generated constructor stub
		tc = new threadChange(100);
		setTitle("��ħ��ս");  
        Toolkit tool = getToolkit();  
        Dimension dim = tool.getScreenSize();  
        setBounds(0, 0, LenthAll.WINDOW_WIDTH, LenthAll.WINDOW_HEIGHT); 
        this.setLocation((int)(dim.getWidth() - LenthAll.WINDOW_WIDTH) / 2,(int)(dim.getHeight() - LenthAll.WINDOW_HEIGHT) / 2);//���õ�ǰ��������Ļ��������
        this.addWindowListener(new WindowAdapter() {
        	public void windowClosing(WindowEvent event) {
				System.exit(0);
        	}
        });//���ùرճ������
        this.setResizable(false);//�̶����ڴ�С���������������
        //----------------------�����Ǵ��ڴ���-------------------------------------------------
        JPanel jp = (JPanel)this.getContentPane();
        ImageIcon icon1 = new ImageIcon("src/imageSource/war.jpg");
        ImageIcon icon3 = new ImageIcon("src/imageSource/war_2.jpg");
        ImageIcon icon2 = new ImageIcon("src/imageSource/back_3.jpg");
        ImageIcon icon4 = new ImageIcon("src/imageSource/back.jpg");
		JLabel cp1 = new JLabel(icon1);
		JLabel cp2 = new JLabel(icon2);
		JLabel cp3 = new JLabel(icon3);
		JLabel cp4 = new JLabel(icon4);
		jp.add(cp1);
		setVisible(true); 
		tc.run();//��ʱ����
		MyDialog.showMessageDialog("  "+"����ǰ����ɲ������һ��������ţ�ֻ��ɹ��޾���ȡ�ÿ���˸\n  ����������ع�֮ʱ���޾����ϣ����κ��ˣ�������������������\n  �����׹⣬��һ����������⼫��֮�У���˿������",null,LenthAll.TALK_DIALOG_WIDTH,LenthAll.TALK_DIALOG_HEIGHT);
		MyDialog.showMessageDialog("  "+"����ع�֮��ʮ�꣬������Ѫ�ֶΣ��ո��޾����ܱ�����������ƾ\n  �����Լ��ľ����书��һͳħ��,�����������أ���������Ϊ��ɲ\n  ħ��", null, LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
		jp.add(cp2);
		cp1.setVisible(false);
		cp2.setVisible(true);
		jp.repaint();
		MyDialog.showMessageDialog("  "+"�ո�ħ�ź���ɲ�����Ұ�Ĳ�δ�õ����㣬����һ��ħ��������\n  ԭ����̤ɽ�ӡ�", null, LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
		jp.add(cp3);
		cp2.setVisible(false);
		cp3.setVisible(true);
		jp.repaint();
		MyDialog.showMessageDialog("  "+"��ʱ��ԭ��һ�ˣ�һ�����ɽ���������������ɸ��֣����նħ��\n  Ӣ������ɲ���ڶϻ��¾�һ��ս����һս����ν��ħ��ʷ�������\n  ��һս��", null, LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
		MyDialog.showMessageDialog("  "+"��ս֮�ձ��ǽ����º���ɲ����׷�׹�����䣬��ɲ�����Ȼ��ʮ\n  ������չѸ�٣�ȴ�����޷�������ǧ��Ļ���ϵȺţ���ɲ���\n  ����ȫ������Ҳ�Ǵ󴴶��飬���Ǻ��������ڴ�ӭ����ƽ����", null, LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
		jp.add(cp4);
		cp3.setVisible(false);
		cp4.setVisible(true);
		MyDialog.showMessageDialog("  "+"    ֻ�ǲ�֪����һ���Ľ������ֽ������������ȷ�Ѫ�ˣ�", null, LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
		setVisible(false);
	}

}
