package secondPracticeForExam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LootTable {
	
	private List<Integer> statRange = new ArrayList<Integer>(5);
	private int[] statNumbers = new int[] {1,2,3,4,5};
	private List<PlusModifier> plusModifiers = new ArrayList<PlusModifier>();
	private String[] attributes = new String[] {"Strength", "Finesse", "Intelligence",
			"Constitution", "Wits", "Memory", "Strength", "Finesse", "Intelligence",
			"Constitution", "Wits", "Memory", "Strength", "Finesse", "Intelligence",
			"Constitution", "Wits", "Memory", "Strength", "Finesse", "Intelligence",
			"Constitution", "Wits", "Memory", "Strength", "Finesse", "Intelligence",
			"Constitution", "Wits", "Memory", "Strength", "Finesse", "Intelligence",
			"Constitution", "Wits", "Memory", "Strength", "Finesse", "Intelligence",
			"Constitution", "Wits", "Memory", "Strength", "Finesse", "Intelligence",
			"Constitution", "Wits", "Memory", "Strength", "Finesse", "Intelligence",
			"Constitution", "Wits", "Memory",  "Cooking", "Cleaning", "Sitting", "Complaining",
			"Act 1 Lore", "Swuasse", "Javold", "Party Time", "Science", "Resident Evil Speed Runs",
			"Mr. President"};
	
	private List<Weapon> weapons = new ArrayList<Weapon>();
	private String[] lootTable = new String[] {"Great Axe", "Axe", "Great Sword",
			"Sword", "Great Hammer", "Mace", "Dagger", "Shiv", "Bow", "Staff", "Bo-Staff",
			"Crossbow", "Wand", "Spear"};
	private String[] qualities = new String[] {
			"Common", "Common", "Common", "Common", "Common",
			"Uncommon", "Uncommon", "Uncommon", "Uncommon",
			"Rare", "Rare", "Rare", "Epic", "Epic", "Legendary"};
	
	public String attributeRatio() {
		for (int i = 0; i <= 50; i++) {
			
		}
		return "Common";
	}
	
	public void PlusModifier() {
		for (String attribute : attributes) {
			plusModifiers.add(new PlusModifier(attribute));
		}	
	}
	
	public void describeAttributes() {
		int i = 0;
		for (PlusModifier plusModifier : plusModifiers) {
			System.out.println(plusModifier.getStat());
			i++;
			if (i == 5) {
				break;
			}
		}
	}
	
	public LootTable(){
		for (String loot : lootTable) {
			for (String quality :qualities) {
				for (String attribute : attributes) {
					for (int stat : statNumbers) {
						weapons.add(new Weapon(quality, loot, stat, attribute));
					}
	
				}
			}
		}
	}
	
	public void describeWeapons() {
		
		int i = 0;
		for (Weapon weapon : weapons){
			System.out.println(weapon.getRareness() + " " + weapon.getWeaponType() +
					"\n  [" + weapon.getStatAmount() + "] " + weapon.getPlusStat());
			i++;
			if (i == 3){
				break;
			}
		}
	}
	public void shuffleS() {
		Collections.shuffle(statRange);
	}
	
	public void shuffleW(){
		Collections.shuffle(weapons);
	}
	public void shuffleA() {
		Collections.shuffle(plusModifiers);
	}
	
	public Weapon select() {
		return weapons.remove(0);
	}
	
}
