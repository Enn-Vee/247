
public class Knight extends Character{
	public Knight(String name) {
		super(name);
		this.weaponBehavior = (new WeaponBow());
	}
	
	public void display() {
		System.out.println(this.name+" is a valiant knight");
	}
}
