package Skill;

public class ziqidonglai implements SkillAll{
	private String skillname;
	
	public ziqidonglai(){
		skillname = "��������";
	}
	public int consume() {				//������������300MP
		// TODO Auto-generated method stub
		return 300;
	}

	@Override
	public int DamageValue() {
		// TODO Auto-generated method stub
		return 500;						//ɱ�����ڻ���������׷��500.
	}
	
	public String getSkillname() {
		return skillname;
	}
}