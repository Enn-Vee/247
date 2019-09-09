
public class King extends Character {
	public King(String name) {
		super(name);
		this.weaponBehavior = (new WeaponSword());
	}
	
	public void display() {
		System.out.println(this.name+" is a Noble King");
	}
}
