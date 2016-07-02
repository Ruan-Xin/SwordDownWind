package PersonAll;
import java.awt.event.MouseWheelEvent;
import java.util.HashMap;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Medicament.medicament;
import Skill.SkillAll;
import Weapon.Weapon;

public class Hero implements PersonAll{
	private static int limitedHP;
	private static int limitedMP;
	private static int nowHP;
	private static int nowMP;
	private static int Level;//关于升级算法，后谈。
	private static int priority;
	private static int ex;//经验
	private static int baseAttack; //基础攻击力会随着，等级的增加而改变。
	private static int adderAttack;
	private static String name;
	private static HashMap<String, Weapon> prosseWeapon;
	private static HashMap<String, medicament> prosseMedicament;
	private static Vector<SkillAll> prosseSkill;//为达到泛型选择vector
	
	public Hero() {
		// TODO Auto-generated constructor stub
		name = "燕惊寒";
		prosseSkill = new Vector<>();
	}
	public void setlimitedHP(int paraHP) {
		limitedHP = paraHP;						//根据等级算法来设置血条上线
	}
	public int getlimitedHP(){
		return limitedHP;
	}
	public void setlimitedMP(int paraMP){
		limitedMP = paraMP;
	}
	public int getlimitedMP() {
		return limitedMP;
	}
	public int getnowHP() {						//当前血量不设置set方法，仅用add和sub进行调整
		return nowHP;
	}
	public int getnowMP() {
		return nowMP;
	}
	public void subHP(int paraHP) {
		if(nowHP - paraHP < 0){
			nowHP = 0;
		}
		else{
			nowHP -= paraHP;	
		}
	}
	public void subMP(int paraMP) {
		if(nowMP - paraMP < 0){
			nowMP = 0;
		}
		else{
			nowMP -= paraMP;	
		}
	}
	public void addHP(int paraHP) {				//人物的加血功能实现。
		int temp = paraHP + nowHP;
		if(temp > limitedHP){
			nowHP = limitedHP;
		}
		else{
			nowHP = temp;
		}
			
	}
	public void addMP(int paraMP) {
		int temp = paraMP + nowMP;
		if(temp > limitedMP){
			nowMP = limitedMP;
		}
		else{
			nowMP = temp;
		}
	}
	public void setBaseAttack(int paraBaseAttack){
		baseAttack = paraBaseAttack;
	}
	public int getBaseAttack() {
		return baseAttack;
	}
	public void adderAttack(int paraAdderAttack) {		//通过持有武器或使用技能，对基础攻击力进行加成
		adderAttack = baseAttack + paraAdderAttack;
	}
	public int getAdderAttack() {
		return adderAttack;
	}
	public void addWeapon(String name,Weapon wp){
		prosseWeapon.put(name, wp);
	}
	public void throwWeapon(String name) {
		prosseWeapon.remove(name);
	}
	public void addMedicament(String name,medicament md) {
		prosseMedicament.put(name, md);
	}
	public void throwMedicament(String name) {
		prosseMedicament.remove(name);
	}
	public void addSkill(SkillAll skill) {//习得技能
		prosseSkill.add(skill);
	}
	public void throwSkill(String name) {
		prosseSkill.remove(name);
	}
	public String getname() {
		return name;
	}
	public JLabel getHeadPhoto() {
		ImageIcon icon = new ImageIcon("src/imageSource/燕惊寒.jpeg");
		JLabel jl_head = new JLabel(icon);
		return jl_head;
	}
	@Override
	public int getPriority() {
		// TODO Auto-generated method stub
		return priority;
	}
	@Override
	public Vector<SkillAll> getSkillAll() {
		// TODO Auto-generated method stub
		return prosseSkill;
	}
	@Override
	public int probablity() {
		// TODO Auto-generated method stub
		return 0;
	}
}
