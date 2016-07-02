/*���岿��*/
package basePackage;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class liyunTown extends JFrame{
	private Image mImage;
	private threadChange tc;
	private int Person_x;
	private int Person_y;
	private Vector<JLabel> vcImage_mountain;//����ͼƬ����                   1
	private Vector<JLabel> vcImage_land;//�ذ��ͼƬ����            0
	private Vector<JLabel> vcImage_house;//���ݵ�ͼƬ                  3
	private Vector<JLabel> vcImage_person;
	private Vector<JLabel> vcImage_sea;
	private int ImageWidth;
	private int ImageHeiht;
	private int [][]matrix;
	public liyunTown() {
		vcImage_mountain = new Vector<JLabel>();
		vcImage_land = new Vector<JLabel>();
		vcImage_house = new Vector<JLabel>();
		vcImage_person = new Vector<JLabel>();
		vcImage_sea = new Vector<JLabel>();
		matrix = new int[LenthAll.COUNT_ROW][LenthAll.COUNT_COL];//�������1Ϊ
		matrix = readTxtFile.readFile("src/MapSource/liyunTown_Map.txt");
		// TODO Auto-generated constructor stub
		tc = new threadChange(100);
		setTitle("������");  
        Toolkit tool = getToolkit();  
        Dimension dim = tool.getScreenSize();  
        setBounds(0, 0, LenthAll.WINDOW_WIDTH, LenthAll.WINDOW_HEIGHT); 
        this.setLocation((int)(dim.getWidth() - LenthAll.WINDOW_WIDTH) / 2,(int)(dim.getHeight() - LenthAll.WINDOW_HEIGHT) / 2);//���õ�ǰ��������Ļ��������
        this.addWindowListener(new WindowAdapter() {
        	public void windowClosing(WindowEvent event) {
				System.exit(0);
        	}
        });//���ùرճ������
        //this.setResizable(false);
        this.setLayout(null);
        this.setResizable(false);//�̶����ڴ�С���������������
        JPanel jp = (JPanel) getContentPane();
        jp.setLayout(null);
        //-----------------------------����Ϊ��������-----------------------------------
        paintMap(matrix, jp);
        setVisible(true);
        MyDialog.showMessageDialog("һ���������ˣ��ÿ���ȥ��ϣ��������Ҫ��ʲô�²źá�", "�̨��", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
        this.addKeyListener(new KeyAdapter() {
        	public void keyPressed(KeyEvent e) {
				//System.out.println(e.getKeyCode());
				matrix = MoveLogic.moveStrategy(matrix,e.getKeyCode(),Person_x,Person_y);
				paintMap(matrix, jp);
				jp.updateUI();//ˢ������ҳ��
				if(Person_x == 5 && Person_y == 29){ 		//ÿ�ŵ�ͼ�̶�һ������
					setVisible(false);
		        	SecondSection ss = new SecondSection();
		        	System.out.println(1);
		        }
			}
		});
	}
	private void paintMap(int[][] matrix,JPanel jp) {
        init();
        int count_land = 0;
   	 	int count_mountain = 0;
   	 	int count_sea = 0;
        for(int i = 0;i < LenthAll.COUNT_ROW;i++){				//Y����
        	for(int j = 0; j < LenthAll.COUNT_COL;j++){			//X����
            	switch (matrix[i][j]) {
				case MapDeploy.MOUNTAIN_ON:
					vcImage_mountain.get(count_mountain).setBounds(-10 + j*LenthAll.IMAGE_WIDTH, -10 + i*LenthAll.IMAGE_HEIGHT,LenthAll.IMAGE_WIDTH, LenthAll.IMAGE_HEIGHT);
	            	jp.add(vcImage_mountain.get(count_mountain++));
					break;
				case MapDeploy.GRASSLAND_ON:
					vcImage_land.get(count_land).setBounds(-10 + j*LenthAll.IMAGE_WIDTH, -10 + i*LenthAll.IMAGE_HEIGHT, LenthAll.IMAGE_WIDTH, LenthAll.IMAGE_HEIGHT);
					jp.add(vcImage_land.get(count_land++));
					break;
				case MapDeploy.HOUSE_ON:
					vcImage_house.get(0).setBounds(-10 + j*LenthAll.IMAGE_WIDTH, -10 + i*LenthAll.IMAGE_HEIGHT, LenthAll.IMAGE_WIDTH, LenthAll.IMAGE_HEIGHT);
					jp.add(vcImage_house.get(0));
					break;
				case MapDeploy.SEA_ON:
					vcImage_sea.get(count_sea).setBounds(-10 + j*LenthAll.IMAGE_WIDTH, -10 + i*LenthAll.IMAGE_HEIGHT, LenthAll.IMAGE_WIDTH, LenthAll.IMAGE_HEIGHT);
					jp.add(vcImage_sea.get(count_sea++));
					break;
				case MapDeploy.PERSON_STAND:
					Person_x = i;
					Person_y = j;
					vcImage_person.get(0).setBounds(-10 + j*LenthAll.IMAGE_WIDTH,-10 + i * LenthAll.IMAGE_HEIGHT, LenthAll.IMAGE_WIDTH, LenthAll.IMAGE_HEIGHT);
					jp.add(vcImage_person.get(0));
					break;
				default:
					break;
				}
        	}  	
        }
	}
	/*1.����ɽ*/
	private void init() {
		ImageIcon icon1 = new ImageIcon("src/imageSource/��ɽ.png");
		ImageIcon icon2 = new ImageIcon("src/imageSource/�ݵ�.png");
		ImageIcon icon3 = new ImageIcon("src/imageSource/���䡣png");
		ImageIcon icon4 = new ImageIcon("src/imageSource/tantaixiang.png");
		ImageIcon icon5 = new ImageIcon("src/imageSource/����.png");
		for(int i = 0; i < LenthAll.COUNT_ROW;i++){
			for(int j = 0; j < LenthAll.COUNT_COL;j++){
				if(matrix[i][j] == MapDeploy.MOUNTAIN_ON){
		            JLabel cp1 = new JLabel(icon1);
		            vcImage_mountain.add(cp1);
				}
				else if(matrix[i][j] == MapDeploy.GRASSLAND_ON){
					JLabel cp2 = new JLabel(icon2);
					vcImage_land.add(cp2);
				}
				else if (matrix[i][j] == MapDeploy.HOUSE_ON) {
					JLabel cp3 = new JLabel(icon3);	
					//System.out.println(matrix[i][j]);
					vcImage_house.add(cp3);
				}
				else if(matrix[i][j] == MapDeploy.PERSON_STAND){
					JLabel cp4 = new JLabel(icon4);
					vcImage_person.add(cp4);
				}
				else if (matrix[i][j] == MapDeploy.SEA_ON){
					JLabel cp5 = new JLabel(icon5);
					vcImage_sea.add(cp5);
				}
			}       	 	
		}
	}
}
