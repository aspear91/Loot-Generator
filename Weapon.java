package secondPracticeForExam;

public class Weapon {
	
	private String weaponType;
	private String rareness;
	private String plusStat;
	private int statAmount;
	
	public Weapon(String rareness, String weaponType, int statAmount, String plusStat) {
		this.setWeaponType(weaponType);
		this.setRareness(rareness);
		this.setPlusStat(plusStat);
		this.setStatAmount(statAmount);
	}

	public void describe() {
		System.out.println(rareness + " " + weaponType + plusStat);
	}
	
	public String getWeaponType() {
		return weaponType;
	}
	public void setWeaponType(String weaponType) {
		this.weaponType = weaponType;
	}
	public String getRareness() {
		return rareness;
	}
	public void setRareness(String rareness) {
		this.rareness = rareness;
	}

	public String getPlusStat() {
		return plusStat;
	}

	public void setPlusStat(String plusStat) {
		this.plusStat = plusStat;
	}

	public int getStatAmount() {
		return statAmount;
	}

	public void setStatAmount(int statAmount) {
		this.statAmount = statAmount;
	}
	
}
