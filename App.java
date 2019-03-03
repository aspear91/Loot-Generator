package secondPracticeForExam;

public class App {

	public static void main(String[] args) {
		
		LootTable lootTable = new LootTable();
		lootTable.shuffleW();
		lootTable.shuffleA();
		
		lootTable.describeWeapons();
		lootTable.describeAttributes();
	//	lootTable.describe();
		
		/*Weapon weapon = new Weapon("Rareness", "Weapon");

		weapon.describe();
		System.out.println(weapon);*/
	}

}
