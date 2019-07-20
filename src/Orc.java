
public class Orc extends Creature {		
	
	public Orc(int strength, int maxHP) {
		this.setStrength(7);
		this.setMaxHP(35);
	
	}
	
	public String getOrc() {
		System.out.println(maxHP);
		return super.getInfo() + maxHP + "";
	}
	
	public String orcStats() {
		return "Orc has "+maxHP+"/"+maxHP;
	}
}
