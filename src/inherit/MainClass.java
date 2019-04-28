package inherit;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("Creating player character (class Archer)...");
		Archer player = new Archer("Falskim", new Bow("The Dawnfall" , 10, 100));
		System.out.println("Creating player character complete...");
		System.out.println();
		System.out.println("---Player Details---");
		System.out.println("Name\t\t: " + player.getName());
		System.out.println("Health\t\t: " + player.getHealth());
		System.out.println("Level\t\t: " + player.getLevel());
		System.out.println("Archery Skill\t: " + player.getArcherySkill());
		System.out.println();
		System.out.println("->Weapon Details<-");
		System.out.println("Weapon Name\t\t: " + player.getWeapon().getName());
		System.out.println("Weapon Damage\t\t: " + player.getWeapon().getDamage());
		System.out.println("Effective Range\t\t: " + player.getWeapon().getEffectiveRange());
		System.out.println("----------------------");
		System.out.println();
		System.out.println("---Log---");
		player.moveForward();
		player.moveBackward();
		player.moveTurn(10);
		player.jump();
		player.shootArrow();
		player.shootArrow();
		player.pickArrow(5);
		player.shootArrow();
	}

}
