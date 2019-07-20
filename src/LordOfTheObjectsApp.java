import java.util.Scanner;

public class LordOfTheObjectsApp {
	Player player = new Player(5, 50);
	Goblin goblin = new Goblin(3, 15);
	Orc orc = new Orc (7, 35);
	Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		String playerName = "";


		LordOfTheObjectsApp app = new LordOfTheObjectsApp();
		app.welcomePlayer(playerName);
		app.goblinFight(playerName);
//		app.orcFight(playerName);
//		add.dragonFight(playerName);
//		app.theMacGuffin(playerName);
//		System.out.println(callStat);

	} // main

	public String welcomePlayer(String playerName) {

		System.out.println("Welcome player what is your name?");
		playerName = kb.nextLine();
		player.setPlayerName(playerName);
		String callStat = player.getInfo();
		System.out.println(playerName + " you are on a quest to retrieve the MacGuffin treasure."
				+ " \"Attack\" to vanquish your foes, \"move\" to move over the corpse.");
		System.out.println(callStat);
		return playerName;
	}

	public void goblinFight(String playerName) {
		String gobStats = goblin.gobStats();
		System.out.println(gobStats);
		System.out.println(player.playerName + " has encountered a goblin");
		int playerHP = player.maxHP;
		int goblinHP = goblin.maxHP;
		while (playerHP > 0 && goblinHP > 0) {
			System.out.println("Enter \"A\" to attack");
			String A = kb.next();
			int playerDamage = player.dealDamage();
			goblinHP = goblinHP - playerDamage;
			System.out.println(player.playerName + " attacks for " + playerDamage + " damage. " + "Goblin has "
					+ goblinHP + "/" + goblin.maxHP);
			int goblinDamage = goblin.dealDamage();
			playerHP = playerHP - goblinDamage;
			System.out.println("Goblin attacks for " + goblinDamage + "damage. " + player.playerName + " has " + playerHP + "/"
					+ player.maxHP);
		}
		if (playerHP <= 0) {
			System.out.println("You're dead " + player.playerName);
		} else {
			System.out.println("Goblin is dead. \"Next\" to continue the journey. Or \"Q\" to quit.");
			String next = kb.next();
			if (next.equalsIgnoreCase("next")) {
				orcFight();
			} else if (next.equalsIgnoreCase("q")) {
				
			System.out.print("Goodbye..... coward");
			}
		}
	}
	
	private void orcFight() {
		System.out.println("ORC LOOKS AT PRIVATES");
		
	}

//	public void orcFight(String playerName) {
//		System.out.println("ORC FIGHT!");
//	}

//	
//	public void playerAttack() {
//		attack = goblin.currentHP - attack;
//	}
//	
//	public void 
//	

} // public class
