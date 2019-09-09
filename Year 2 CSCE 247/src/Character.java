
public class Character implements WeaponBehavior {
	protected String name;
	protected WeaponBehavior weaponBehavior;
		
	public Character(String name) {
		this.name = name;
	}
	
	public void attack() {
		weaponBehavior.attack();
	}
	
	public void setWeaponBehavior(WeaponBehavior wb) {
		this.weaponBehavior = wb; 
	}
	
	public void display() {
		System.out.println(this.name+" is a generic character.");
	}
}
