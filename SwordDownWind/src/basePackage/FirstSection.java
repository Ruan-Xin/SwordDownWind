/*���Ĳ���*/
package basePackage;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FirstSection extends JFrame{
	private threadChange tc;
	public FirstSection() {
		// TODO Auto-generated constructor stub
		tc = new threadChange(100);
		setTitle("��һ�£����֪�꼸��");  
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
        //--------------------------------------------------------------------------
        ImageIcon icon = new ImageIcon("src/imageSource/nightTown.jpg");
        ImageIcon icon_1 = new ImageIcon("src/imageSource/inHome.jpg");
        ImageIcon icon_2 = new ImageIcon("src/imageSource/furen.jpg");
        ImageIcon icon_3 = new ImageIcon("src/imageSource/voilet.jpg");
        ImageIcon icon_4 = new ImageIcon("src/imageSource/leavetantai.jpg");
        JLabel jl = new JLabel(icon);
        JLabel jl_1 = new JLabel(icon_1);
        JLabel jl_2 = new JLabel(icon_2);
        JLabel jl_3 = new JLabel(icon_3);
        JLabel jl_4 = new JLabel(icon_4);
        jp.add(jl);
        setVisible(true);
        tc.run();
        MyDialog.showMessageDialog("  "+"���ڡ�����������", "ҹ���˾���������", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
        MyDialog.showMessageDialog("  "+"��,������ô��û�������ҿ�Ҫ�����ˡ�", "����ͯ��", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
        jp.add(jl_1);
        jl.setVisible(false);
        jl_1.setVisible(true);
        MyDialog.showMessageDialog("  "+"�ٵȵȣ�������������������˰Ѹ��ӻ����ģ�����Ҫ�ȵ�������\n  ���ܳԡ�", "�̨��", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
        jp.add(jl_3);
        jl_1.setVisible(false);
        jl_3.setVisible(true);
        MyDialog.showMessageDialog("  "+"��...............����....�����⴫��һ����ɫ�Ĺ�â������һ���������\n  ������", "����һ�����", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
        jl_3.setVisible(false);
        jl_1.setVisible(true);
        MyDialog.showMessageDialog("  "+"�̨��վ����������ɫ���Ų���ײ�������µ����ӡ�", "����", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
        MyDialog.showMessageDialog("                                            "+"����ɫ���ţ������ô��", "С����", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
        MyDialog.showMessageDialog("                     "+"                                ��...............", null, LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
        jp.add(jl_2);
        jl_1.setVisible(false);
        jl_2.setVisible(true);
        MyDialog.showMessageDialog("  "+"����...........����ô����............(���壬�Ǵ����һλ�÷����ˡ�ƽ��\n  ����ྪ��һ���˼�Ϊ�չˡ�)", "С����", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
        jl_2.setVisible(false);
        jl_1.setVisible(true);
        MyDialog.showMessageDialog("  "+"                             ����ϥ���£�����Ըƴ������С�㰲Σ��", "����", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
        MyDialog.showMessageDialog("  "+"�����Ҳ�����˰�,�����ڽ��������һ�����������ˣ������\n  ���ˣ��������κ��˵�Լ����", "�̨��", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
        MyDialog.showMessageDialog("  "+"��С�㣬�������ף����罫���е������ѡ��������Ѿ͵����߲嵶\n  ��������Ȼ�书��΢��������̰������֮�������Ѷ��ӣ���������\n  ��", "����", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
        MyDialog.showMessageDialog("  "+"���У��ҵ�Ȼ�������Ƕ������ص����Ӻ������������밲ȫ�뿪��\n  ���������Ҫ�ġ�Ҳ���Һ�������ϣ���ġ�", "�̨��", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
        MyDialog.showMessageDialog("  "+"                                                      С�㣬���ǡ���","����", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
        MyDialog.showMessageDialog("  "+"���ˣ���������һ���ӵ����ѡ������գ��������������͡�������\n  ������С��ү�͵����ݳ���һ�ҽ���������Ʈ�㡱�ľ�¥������\n  Υ����", "�̨��", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
        MyDialog.showMessageDialog("  "+"(ժ�²����ϵ��ɺ���Ȫ���������С����������)������Ҫѧ����\n  ���չ��Լ��������Լ��������������ˡ�", "�̨��", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
        jp.add(jl_4);
        jl_1.setVisible(false);
        jl_4.setVisible(true);
        MyDialog.showMessageDialog("  "+"         (�������)���뿴���㳤�󰡡�����Ѱ��������ء�", "�̨��", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
        setVisible(false);
	}
}
