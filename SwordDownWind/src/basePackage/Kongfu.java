/*ϰ�ù��򣬵�ʮ��*/
package basePackage;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.imageio.stream.MemoryCacheImageInputStream;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Medicament.jinchuanggao;
import Medicament.yuexiancao;
import PersonAll.Hero;
import PersonAll.PersonAll;
import Skill.Longhuquan;
import Skill.Sancaiguiyuan;
import Weapon.Bahuangnulong;

public class Kongfu extends JFrame{
	private Hero player;
	public Kongfu(Hero player) {
		
		this.player = player;
		
		
		// TODO Auto-generated constructor stub
		setTitle("�ڶ��£�������ˮ������");
		Toolkit tool = getToolkit();
		Dimension dim = tool.getScreenSize();
		setBounds(0, 0, LenthAll.WINDOW_WIDTH, LenthAll.WINDOW_HEIGHT);
		this.setLocation((int) (dim.getWidth() - LenthAll.WINDOW_WIDTH) / 2,
				(int) (dim.getHeight() - LenthAll.WINDOW_HEIGHT) / 2);// ���õ�ǰ��������Ļ��������
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent event) {
				System.exit(0);
			}
		});// ���ùرճ������
		JPanel jp = (JPanel) getContentPane();
		this.setResizable(false);// �̶����ڴ�С���������������
		setVisible(true);
		/*-------------------------windows create---------------------------------*/
		ImageIcon icon = new ImageIcon("src/imageSource/insidehome.jpg");
		ImageIcon icon_1 = new ImageIcon("src/imageSource/inHome.jpg");
		ImageIcon icon_2 = new ImageIcon("src/imageSource/����.jpeg");
		ImageIcon icon_3 = new ImageIcon("src/imageSource/����.jpg");
		ImageIcon icon_4 = new ImageIcon("src/imageSource/����.jpg");
		
		JLabel Drinking = new JLabel(icon);
		JLabel home = new JLabel(icon_1);
		JLabel DrinkTogether = new JLabel(icon_2);
		JLabel Kongfu = new JLabel(icon_3);
		JLabel time = new JLabel(icon_4);
		
		jp.add(Drinking);
		jp.validate();
		MyDialog.showMessageDialog("               ������Σ�һ��Ҫ����λ��ᣬ��ʦ�����ҹ���~", "�ྪ��", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
		jp.add(home);
		Drinking.setVisible(false);
		jp.validate();
		MyDialog.showMessageDialog("                         ʦ��������~", "�ྪ��", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
		MyDialog.showMessageDialog("                               �ƹ���Ѳ........", null, LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
		home.setVisible(false);
		jp.add(DrinkTogether);
		jp.validate();
		MyDialog.showMessageDialog("          ʦ�����������������������࣬����ȴ��δ������һ��һʽ������ѬѬ��", "�ྪ��", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
		MyDialog.showMessageDialog("                              ร����ż��ˣ�", "������",LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
		MyDialog.showMessageDialog("            ����������ܲ������㵱��ŵ�ң�����ѧ��ʮ�꣬����ʵ��\n    Ѱ�ø�ĸ������������ȥ����ȴ��δ�а����Ϊ��", "�ྪ��", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
		MyDialog.showMessageDialog("                 ����ľ���һ��仯��û�У�", "������", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
		MyDialog.showMessageDialog("                 ��ʲô�仯��Ϊ����һ���Ҳδ�о�", "�ྪ��", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
		MyDialog.showMessageDialog("                   �ã���Ȼ������ż������������ұ㴫�����书��", "������", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
		MyDialog.showMessageDialog("                    ����...........", "�ྪ��", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
		DrinkTogether.setVisible(false);
		jp.add(Kongfu);
		jp.validate();
		MyDialog.showMessageDialog("                        ����", null, LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
		MyDialog.showMessageDialog("                      �ӽ��տ�ʼ�㴫���书�������޼�Ϊ�ڣ����Ź�Ԫ����\n   �����Ƶ��⹦Ϊ����", "������", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
		MyDialog.showMessageDialog("                     �����Ƽ����������������Ժ�", null, LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
		Kongfu.setVisible(false);
		jp.add(time);
		jp.validate();
		MyDialog.showMessageDialog("                      ��ϲ��ϰ���ڹ��ķ� �����޼�", "��ʾ", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
		MyDialog.showMessageDialog("                      ��ϲ��ϰ���⹦ ���Ź�Ԫ��", "��ʾ", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
		MyDialog.showMessageDialog("                      ��ϲ��ϰ���⹦ ������", "��ʾ", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
		player.addSkill(new Longhuquan());
		player.addSkill(new Sancaiguiyuan());
		MyDialog.showMessageDialog("                      ʮ�����ţ���Ҳ����㵱��ĳ�ŵ���ڴˣ�����һ�Ѱ�\n   ��ŭ��������������ҩ�����ɲݣ�", "������", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
		MyDialog.showMessageDialog("                               ��ð˻�ŭ����", "��ʾ", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
		MyDialog.showMessageDialog("                               ��ý�ҩ��2", "��ʾ", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
		MyDialog.showMessageDialog("                               ������ɲݡ�2", "��ʾ", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
		player.addMedicament("��ҩ", new jinchuanggao(),2);
		player.addMedicament("���ɲ�", new yuexiancao(), 2);
		player.addWeapon("�˻�ŭ����", new Bahuangnulong());
		MyDialog.showMessageDialog("             �����ѧ���ѳɣ�ֻԸ����ɽ֮���������壬��������\n    ���������У�","������", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
		MyDialog.showMessageDialog("                  �ǣ�ʦ�������Ӷ�������ʦ�ţ�","�ྪ��", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
		new wanlipiaoxiang(player);
		setVisible(false);
		}
}