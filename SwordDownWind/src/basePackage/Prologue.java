/*��������*/
package basePackage;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.sound.midi.ShortMessage;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Prologue extends JFrame{
	private threadChange tc;
	public Prologue() {
		// TODO Auto-generated constructor stub
		tc = new threadChange(100);
		setTitle("���£�����ɽ��");  
        Toolkit tool = getToolkit();  
        Dimension dim = tool.getScreenSize();  
        setBounds(0, 0, LenthAll.WINDOW_WIDTH, LenthAll.WINDOW_HEIGHT); 
        this.setLocation((int)(dim.getWidth() - LenthAll.WINDOW_WIDTH) / 2,(int)(dim.getHeight() - LenthAll.WINDOW_HEIGHT) / 2);//���õ�ǰ��������Ļ��������
        this.addWindowListener(new WindowAdapter() {
        	public void windowClosing(WindowEvent event) {
				System.exit(0);
        	}
        });//���ùرճ������
        JPanel jp = (JPanel) getContentPane();
        this.setResizable(false);//�̶����ڴ�С���������������
        //-------------------------���ڽ����ָ���-----------------------------------------
        ImageIcon icon = new ImageIcon("src/imageSource/snow.jpg");
        JLabel jl = new JLabel(icon);
        jp.add(jl);
        setVisible(true);
        
        MyDialog.showMessageDialog("                                                   "+"�㻹�����ִ��!", "��������", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
        MyDialog.showMessageDialog("                                                   "+"������"+"............\n                                            ����������һ���壡", "��������", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
        MyDialog.showMessageDialog("                                    "+"����.......�����ƺ��ܾ�û�ж��Ĺ���!", "��������",LenthAll.TALK_DIALOG_WIDTH , LenthAll.TALK_DIALOG_HEIGHT);
        MyDialog.showMessageDialog("                                                   "+"�����ߵ�������", "��������", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
        setVisible(false);
        new FirstSection();
	}
}
