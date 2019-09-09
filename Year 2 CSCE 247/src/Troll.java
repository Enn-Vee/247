
public class Troll extends Character{
	public Troll(String name) {
		super(name);
		this.weaponBehavior = (new WeaponAxe());
	}
	
	public void display() {
		System.out.println(this.name+" is a funny troll");
	}
}
