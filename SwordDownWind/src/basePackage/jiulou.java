package basePackage;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class jiulou extends JFrame{
	private JPanel jp;
	public jiulou() {
		// TODO Auto-generated constructor stub
		setTitle("�����£�һ�뽭�����ƺ�");
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
		jp = (JPanel) getContentPane();
		this.setResizable(false);// �̶����ڴ�С���������������
		setVisible(true);
		/*-------------------------windows create---------------------------------*/
		ImageIcon icon = new ImageIcon("src/imageSource/insidehome.jpg");
		
		JLabel insidehome = new JLabel(icon);
		jp.add(insidehome);
		jp.validate();
		MyDialog.showMessageDialog("                       С�������������ϰ�������", "�ྪ��", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
		MyDialog.showMessageDialog("                         Ŷ�������ϰ�������ȥ�����ˣ�����Ż������","�Ƶ�С��", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
		MyDialog.showMessageDialog("                        Ŷ���õģ����鷳����ҿ�һ���ϵȷ���", "�ྪ��",LenthAll.TALK_DIALOG_WIDTH , LenthAll.TALK_DIALOG_HEIGHT);
		MyDialog.showMessageDialog("                                                        ����", "��ʾ", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
	}
}