/*��һ����*/
package basePackage;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.omg.CORBA.PUBLIC_MEMBER;

public class liyunMap extends JFrame{
	private Image mImage;
	private threadChange tc;
	public liyunMap() {
		// TODO Auto-generated constructor stub
		tc = new threadChange(100);
		setTitle("�����ǰ����ʷ");  
        Toolkit tool = getToolkit();  
        Dimension dim = tool.getScreenSize();  
        setBounds(0, 0, LenthAll.WINDOW_WIDTH, LenthAll.WINDOW_HEIGHT); 
        this.setLocation((int)(dim.getWidth() - LenthAll.WINDOW_WIDTH) / 2,(int)(dim.getHeight() - LenthAll.WINDOW_HEIGHT) / 2);//���õ�ǰ��������Ļ��������
        this.addWindowListener(new WindowAdapter() {
        	public void windowClosing(WindowEvent event) {
				System.exit(0);
        	}
        });//���ùرճ������
        //--------------------------------------------------------------------------
        ImageIcon icon1=new ImageIcon("src/imageSource/bieyunmountain.jpg");
		JLabel cp1=new JLabel(icon1);
		cp1.setIcon(icon1);
		this.add(cp1);
		this.setResizable(false);//�̶����ڴ�С���������������
		tc.run();//��ʱ����
		setVisible(true);
		MyDialog.showMessageDialog("  "+"�����ǰ,������Զ���ı���ɽ�Ͻ��է�֣���Ϊ�񼣣�������\n  ����ʿĤ��հ����",null,LenthAll.TALK_DIALOG_WIDTH,LenthAll.TALK_DIALOG_HEIGHT);//�����ֱ��������ģ����ݣ����⣬��ICON
		//JOptionPane.showMessageDialog(this,"hello world","alert",JOptionPane.WARNING_MESSAGE);
		MyDialog.showMessageDialog("  "+"����Ϊ�������ٳ����׷�����ڴˣ�ϣ���õ����˵㻯��������\n  �ַ׷�ɽ��Ѱ�٣���ͼѰ����Ե�������ʥ���κ������Ӵ�ˮһ\n  ���գ���������ɽ������ɽ��������������������", null, LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
		MyDialog.showMessageDialog("  "+"����ʧ��֮�����׷��뿪�����򣬵���һȺ���Գ�Ѱ���ߣ�ʼ�չ�\n  ����������������Ľ��������ߣ�������ɽ������ʼ����ɽ�µȴ�\n  �ϣ�ǫ����������ʧ������֮ʱ������Ҳ���������ȥ��ĬĬ��\n  �����꣬���Ҳ�ڴ������������������֪�Ƿ��������黤�ӣ���\n  ��ǰ����ħ��ս����׳�ң�ȴҲδ�������ˡ�", null, LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
		setVisible(false);
		new JusticAndDamon();
	}
}
