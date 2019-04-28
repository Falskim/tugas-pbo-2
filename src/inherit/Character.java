package inherit;

public class Character {
	private String name;
	private int health;
	private int level;
	
	public Character() {
		this.health = 100;
		this.level = 1;
	}
	public Character(String name) {
		this();
		this.name = name;
	}
	

	/*
	 *	Setter and getter 
	 */
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public void moveForward() {
		System.out.println("Your character is move forward !");
	}
	public void moveBackward() {
		System.out.println("Your character is move backward !");
	}
	public void moveTurn(int x) {
		System.out.println("Your character is turning " + x + " degree !");
	}
	public void jump() {

		System.out.println("Your character is jumping !");
	}
}
