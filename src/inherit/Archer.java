package inherit;

public class Archer extends Character{
	private Bow weapon;
	private int archerySkill;
	private int arrowTotal;
	
	
	public Archer() {
	}
	public Archer(String name, Bow weapon) {
		super(name);
		this.archerySkill = 0;
		this.arrowTotal = 10;
		this.weapon = weapon;
	}
	

	/*
	 *	Setter and getter 
	 */
	public Bow getWeapon() {
		return weapon;
	}
	public void setWeapon(Bow weapon) {
		this.weapon = weapon;
	}
	public int getArcherySkill() {
		return archerySkill;
	}
	public void setArcherySkill(int archerySkill) {
		this.archerySkill = archerySkill;
	}
	public int getArrowTotal() {
		return arrowTotal;
	}
	public void setArrowTotal(int arrowTotal) {
		this.arrowTotal = arrowTotal;
	}
	
	
	public void shootArrow() {
		if(arrowTotal > 0) {
			arrowTotal--;
			System.out.println("Shoot an arrow ! (" + getArrowTotal() + " arrow(s) remaining)");
		}
		else System.out.println("Your quiver is empty !");
	}
	public void pickArrow(int x) {
		arrowTotal += x;
		System.out.println("Picked up " + x + " arrow(s) (current arrow " + getArrowTotal() + ")");
	}
	
}
