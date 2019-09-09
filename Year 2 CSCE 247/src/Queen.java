
public class Queen extends Character {
	public Queen(String name) {
		super(name);
		this.weaponBehavior = (new WeaponKnife());
	}
	
	public void display() {
		System.out.println(this.name+" is a beautiful queen");
	}
}
