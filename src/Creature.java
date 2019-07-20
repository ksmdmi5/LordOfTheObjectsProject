
public class Creature {
	protected String creature= "";
	protected int strength;
	protected int currentHP;
	protected int maxHP;
	protected boolean isAlive;
	String stats = "";

	public boolean isAlive() {
		if (currentHP > 0);
		return isAlive;
	}

	public Creature() {
	}

	

	public Creature(int strength, int currentHP, int maxHP) {
		this.strength = strength;
		this.currentHP = currentHP;
		this.maxHP = maxHP;
		
	}
	
	public String getInfo() {
		return creature+" has "+currentHP+"/"+maxHP;
	}

//	public Creature() {
//	}

	public String getCreature() {
		return creature;
	}

	public void setCreature(String creature) {
		this.creature = creature;
	}

	public String getStats() {
		return stats;
	}

	public void setStats(String stats) {
		this.stats = stats;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getCurrentHP() {
		return currentHP;
	}

	public void setCurrentHP(int currentHP) {
		this.currentHP = currentHP;
	}

	public int getMaxHP() {
		return maxHP;
	}

	public void setMaxHP(int maxHP) {
		this.maxHP = maxHP;
	}
	
	public int dealDamage () {
		return ((int)(Math.random()*strength)+1);
	}

}
