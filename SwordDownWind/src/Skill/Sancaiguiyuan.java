package Skill;

import org.omg.CORBA.portable.ValueBase;

public class Sancaiguiyuan implements SkillAll{
	private static int level = 1;
	private static int consumable = 30;
	private static int value = 40;
	@Override
	public int consume() {
		// TODO Auto-generated method stub
		return consumable;
	}

	@Override
	public int DamageValue() {
		// TODO Auto-generated method stub
		return value;
	}

	@Override
	public String getSkillname() {
		// TODO Auto-generated method stub
		return "���Ź�Ԫ��";
	}

	@Override
	public int level() {
		// TODO Auto-generated method stub
		return level;
	}

	@Override
	public void level_plus() {
		// TODO Auto-generated method stub
		level++;
	}

	@Override
	public void setConsume(int para_Consume) {
		// TODO Auto-generated method stub
		this.consumable = para_Consume;
	}

	@Override
	public void setDamageValue(int para_Value) {
		// TODO Auto-generated method stub
		this.value = para_Value;
	}

	@Override
	public Double GrowthValue() {
		// TODO Auto-generated method stub
		return 0.2;
	}

	@Override
	public Double MPGrowthValue() {
		// TODO Auto-generated method stub
		return 0.05;
	}

}
