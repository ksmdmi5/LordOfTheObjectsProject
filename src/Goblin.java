
public class Goblin {
	
	public Goblin() {
		
	}
	
	public Goblin(int strength, int maxHP) {
		this.setStrength(3);
		this.setMaxHP(15);
	
	}
	
	public String getGoblin() {
		System.out.println(maxHP);
		return super.getInfo() + maxHP + "";
	}
	
	public String gobStats() {
		return "Goblin has "+maxHP+"/"+maxHP;
	}


	
//	if (hitPoints = 0) {
//		drop sword || armor;
//	}
}
