public class Equipment extends Item {

	private String itemName;
	private String companyName;
	private double weight;

	public Equipment(String itemName, String companyName, double weight) {
		super(itemName, companyName);
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double newWeight) {
		this.weight = newWeight;
	}

	@Override
	public String printName() {
		return "Equipment";
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("\tWeight: " + weight);

	}

}