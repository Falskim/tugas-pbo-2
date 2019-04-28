package inherit;

public class Bow {
	private String name;
	private int damage;
	private int effectiveRange;
	
	public Bow() {
	}
	public Bow(String name, int damage, int effectiveRange) {
		this.name = name;
		this.damage = damage;
		this.effectiveRange = effectiveRange;
	}
	
	/*
	 *	Setter and getter 
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getEffectiveRange() {
		return effectiveRange;
	}
	public void setEffectiveRange(int effectiveRange) {
		this.effectiveRange = effectiveRange;
	}
}
