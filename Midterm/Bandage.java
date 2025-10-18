import java.time.*;

public class Bandage extends Item {

	private LocalDate expiryDate;
	private int ageGroup;
	private Boolean isWaterProof;

	public Bandage(String itemName, String companyName, LocalDate expiryDate, int ageGroup, Boolean isWaterProof) {
		super(itemName, companyName);
		this.expiryDate = expiryDate;
		this.ageGroup = ageGroup;
		this.isWaterProof = isWaterProof;
	}

	// Getters
	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public int getAgeGroup() {
		return ageGroup;
	}

	public boolean isWaterProof() {
		return isWaterProof;
	}

	// Setters
	public void setExpiryDate(LocalDate newExpiryDate) {
		this.expiryDate = newExpiryDate;
	}

	public void setAgeGroup(int newAgeGroup) {
		this.ageGroup = newAgeGroup;
	}

	public void setWaterProof(boolean isWaterProof) {
		this.isWaterProof = isWaterProof;
	}

	@Override
	public String printName() {
		return "Bandage";
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("\tExpiration Date: " + expiryDate);
		System.out.println("\tAge Group: " + ageGroup);
		System.out.println("\tWater Proof: " + isWaterProof);
	}

}