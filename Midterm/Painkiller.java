import java.time.*;
import java.time.format.*;
// import java.text.*;

public class Painkiller extends Item {

	private LocalDate expiryDate;
	private int ageGroup;

	public Painkiller(String itemName, String companyName, LocalDate expiryDate, int ageGroup) {
		super(itemName, companyName);
		this.expiryDate = expiryDate;
		this.ageGroup = ageGroup;
	}

	public Painkiller(String itemName, String companyName, String expiryDate, int ageGroup) {
		super(itemName, companyName);
		try {
			DateTimeFormatter format = DateTimeFormatter.ofPattern("mm dd, yyyy");
			this.expiryDate = LocalDate.parse(expiryDate);
			this.ageGroup = ageGroup;
		} catch (DateTimeParseException e) {
		}
		// throw new DateTimeParseException ("Unable to parse date: "+expiryDate);
		System.out.println("Unable to parse date: " + expiryDate);
	}
	// throws DateTimeParseException

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public int getAgeGroup() {
		return ageGroup;
	}

	public void setExpiryDate(LocalDate newExpiryDate) {
		this.expiryDate = newExpiryDate;
	}

	public void setAgeGroup(int newAgeGroup) {
		this.ageGroup = newAgeGroup;
	}

	@Override
	public String printName() {
		return "PainKiller";
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("\tExpiration Date: " + expiryDate);
		System.out.println("\tAge Group: " + ageGroup);
	}
}