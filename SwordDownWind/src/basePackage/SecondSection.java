/*��������*/
package basePackage;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Vector;

import javax.naming.InitialContext;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import PersonAll.yannanzheng;
import PersonAll.zhenghaotian;
import dialogPackage.fightDialog;
import warFrame.fightScence_1;

public class SecondSection extends JFrame{
	private threadChange tc;
	private Vector<JLabel> Tree;
	private Vector<JLabel> Land;
	private Vector<JLabel> Boss;
	private Vector<JLabel> Person;
	private int [][]matrix;
	private int Person_x;
	private int Person_y;
	public SecondSection() {
		// TODO Auto-generated constructor stub
		tc = new threadChange(100);
		Tree = new Vector<JLabel>();
		Land = new Vector<JLabel>();
		Boss = new Vector<JLabel>();
		Person = new Vector<JLabel>();
		matrix = new int[LenthAll.COUNT_ROW][LenthAll.COUNT_COL];
		matrix = readTxtFile.readFile("src/MapSource/liyunTown_forest.txt");
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
        //-----------------------------------���ڽ���----------------------------------------------
        ImageIcon icon = new ImageIcon("src/imageSource/Բ��.jpg");
        ImageIcon icon2 = new ImageIcon("src/imageSource/������δ����.jpg");
        ImageIcon icon3 = new ImageIcon("src/imageSource/֣����.jpeg");
        ImageIcon icon4 = new ImageIcon("src/imageSource/����������.jpeg");
        JLabel jl = new JLabel(icon);//Բ��
        JLabel jl_1 = new JLabel(icon2);//δ����ʱ��������
        JLabel jl_2 = new JLabel(icon3);//֣����
        JLabel jl_3 = new JLabel(icon4);//����ʱ��������
        jp.add(jl);
        setVisible(true);
        MyDialog.showMessageDialog("  "+"                                     ����........����.....", "��ҹ",LenthAll.TALK_DIALOG_WIDTH,LenthAll.TALK_DIALOG_HEIGHT);
        MyDialog.showMessageDialog("  "+"                                      ��Щ����ÿɺã�֣ʦ��.", "��������", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
        MyDialog.showMessageDialog("    �������벻��,��֪������ѭ�浸�أ�������������֮Χ�������\n  ���ҵ�ȷ�ǲ�����", "������һ��֣����", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
        jl.setVisible(false);
        jp.add(jl_2);
        jp.validate();
        MyDialog.showMessageDialog("  "+"         �������������顷�����䣬�ұ���ʦ��˵��δ�й����ǵ�����\n  ��", "֣����", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
        jl_2.setVisible(false);
        jp.add(jl_1);
        jp.validate();
        MyDialog.showMessageDialog("  "+ "�������������ɺ쳾�⣬���׺��������ģ�ʮ��ǰ���ұ���߹���\n  �ǣ��Ҵ�δ�������������顷��ֻ�����˸���ָ�㣬���˶��飬��\n  ����ͻ���ͽ������������ˡ��������顷��  ���书", "������", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
        jl_1.setVisible(false);
        jl_2.setVisible(true);
        jp.validate();
        MyDialog.showMessageDialog("  "+"							ʦ�ܣ���Ȼ��ִ���ڴˣ��Ǳ��ݹ��������ˡ�", "֣����", LenthAll.TALK_DIALOG_WIDTH,LenthAll.TALK_DIALOG_HEIGHT);
        jl_2.setVisible(false);
        init();
        paintMap(matrix, jp);
        jp.validate();
        
        this.addKeyListener(new KeyAdapter() {
        	public void keyPressed(KeyEvent e) {
				matrix = MoveLogic.moveStrategy(matrix, e.getKeyCode(), Person_x, Person_y);
				paintMap(matrix, jp);
				jp.updateUI();
				if(Person_x == 11 && Person_y == 25){
					dispose();
					new fightScence_1(new yannanzheng(), new zhenghaotian(),1);
				}
			}
		});
	}
	private void init() {
		ImageIcon tree = new ImageIcon("src/imageSource/ɭ��.png");
		ImageIcon boss = new ImageIcon("src/imageSource/person.png");
		ImageIcon land = new ImageIcon("src/imageSource/�ݵ�.png");
		ImageIcon person = new ImageIcon("src/imageSource/��������.jpg");
		for(int i = 0; i < LenthAll.COUNT_ROW;i++)
			for(int j = 0;j < LenthAll.COUNT_COL;j++){
				if(matrix[i][j] == MapDeploy.BOSS_ON){
					JLabel J_BOOS = new JLabel(boss);
					Boss.add(J_BOOS);
				}
				else if(matrix[i][j] == MapDeploy.TREE_ON){
					JLabel J_TREE = new JLabel(tree);
					Tree.add(J_TREE);
				}
				else if(matrix[i][j] == MapDeploy.PERSON_STAND){
					JLabel J_PERSON = new JLabel(person);
					Person.add(J_PERSON);
				}
				else if(matrix[i][j] == MapDeploy.GRASSLAND_ON){
					JLabel J_LAND = new JLabel(land);
					Land.add(J_LAND);
				}
			}
	}
	private void paintMap(int [][]matrix,JPanel jp){
		int count_tree = 0;
		int count_land = 0;
		for(int i = 0; i < LenthAll.COUNT_ROW;i++){
			for(int j = 0; j < LenthAll.COUNT_COL;j++){
				switch (matrix[i][j]) {
				case MapDeploy.BOSS_ON:
					Boss.get(0).setBounds(-10 + j*LenthAll.IMAGE_WIDTH, -10 + i*LenthAll.IMAGE_HEIGHT,LenthAll.IMAGE_WIDTH, LenthAll.IMAGE_HEIGHT);
	            	jp.add(Boss.get(0));
					break;
				case MapDeploy.GRASSLAND_ON:
					Land.get(count_land).setBounds(-10 + j*LenthAll.IMAGE_WIDTH, -10 + i*LenthAll.IMAGE_HEIGHT,LenthAll.IMAGE_WIDTH, LenthAll.IMAGE_HEIGHT);
	            	jp.add(Land.get(count_land++));
					break;
				case MapDeploy.TREE_ON:
					Tree.get(count_tree).setBounds(-10 + j*LenthAll.IMAGE_WIDTH, -10 + i*LenthAll.IMAGE_HEIGHT,LenthAll.IMAGE_WIDTH, LenthAll.IMAGE_HEIGHT);
	            	jp.add(Tree.get(count_tree++));
	            	break;
				case MapDeploy.PERSON_STAND:
					Person.get(0).setBounds(-10 + j*LenthAll.IMAGE_WIDTH, -10 + i*LenthAll.IMAGE_HEIGHT,LenthAll.IMAGE_WIDTH, LenthAll.IMAGE_HEIGHT);
	            	jp.add(Person.get(0));
	            	Person_x = i;
	            	Person_y = j;
					break;
				default:
					break;
				}
			}
		}
	}
}
