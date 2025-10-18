public class Item {

	private String itemName;
	private String companyName;

	public Item(String itemName, String companyName) {
		this.itemName = itemName;
		this.companyName = companyName;
	}

	public String getItem() {
		return itemName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setItem(String newItemName) {
		this.itemName = newItemName;
	}

	public void setCompanyName(String newCompanyName) {
		this.companyName = newCompanyName;
	}

	public String printName() {
		return "Item";
	}
	
	public void printInfo() {
		System.out.println(printName() + ":");
		System.out.println("\tName: " + itemName);
		System.out.println("\tDrug Company: " + companyName);
	}

}