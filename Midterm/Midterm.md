# Midterm Java Files

## Notes:
1. Since during the test, InventoryManagementSystem.java contains all 3 versions in the actual .java.

## Contents:

#### Version 1:
1. [InventoryManagementSystem.java](#inventorymanagementsystemjava) (Main)
2. [Item](#itemjava)
3. [Painkiller](#painkillerjava)
3. [Bandage](#bandagejava)
3. [Equipment](#equipmentjava)

#### Version 2:
1. [InventoryManagementSystem.java](#inventorymanagementsystemjava-1) (Main)

#### Version 3:
1. [InvalidAnswerException](#invalidanswerexceptionjava)
2. [InventoryManagementSystem.java](#inventorymanagementsystemjava-2) (Main)

## Version 1

#### [InventoryManagementSystem.java](InventoryManagementSystem.java)
```java
import java.util.*;
import java.lang.*;
import java.text.*;

public class InventoryManagementSystem {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

    String itemName = null;
		do {
			System.out.print("Enter Item Name: ");
			itemName = scanner.nextLine();
			if (itemName.isBlank())
				System.err.println("Item name cannot be empty.");
		} while ((itemName == null) || itemName.isBlank());

		String companyName = null;
		do {
			System.out.print("Enter Company Name: ");
			companyName = scanner.nextLine();
			if (companyName.isBlank())
				System.err.println("Company name cannot be empty.");
		} while ((companyName == null) || companyName.isBlank());

		String answer = null;
		do {
			try {

				System.out.print("Do you want to create Item, Painkiller, Bandage or Equipment: ");
				answer = scanner.nextLine();
				if (answer.isBlank())
					throw new InvalidAnswerException();
			} catch (InvalidAnswerException e) {

				System.err.println(
						"Item name cannot be empty. It must be either \"Item\", \"Painkiller\", \"Bandage\" or \"Equipment\"");
			}
		} while ((answer == null) || answer.isBlank() || !(answer.equalsIgnoreCase("Painkiller")
				|| answer.equalsIgnoreCase("Bandage") || answer.equalsIgnoreCase("Equipment")));

		if (answer.equalsIgnoreCase("Item")) {

			Item item = new Item(itemName, companyName);
			item.printInfo();
		}

		else if (answer.equalsIgnoreCase("PainKiller")) {

			String expiryDate = null;
			do {
				  System.out.print("Enter Expiration Date: ");
				  expiryDate = scanner.nextLine();
			} while ((expiryDate == null) || expiryDate.isBlank());

			int ageGroup = -1;
			do {
					System.out.print("Enter Age Group: ");
					ageGroup = Integer.parseInt(scanner.nextLine());
			} while (ageGroup < 0);

			Painkiller painkiller = new Painkiller(itemName, companyName, expiryDate, ageGroup);
			painkiller.printInfo();
		}
	}
}
```

#### [Item.java](Item.java)
```java
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
```

#### [Painkiller.java](Painkiller.java)
```java
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
```

#### [Bandage.java](Bandage.java)
```java
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
```

#### [Equipment.java](Equipment.java)
```java
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
```

## Version 2

#### [InventoryManagementSystem.java]()
```java
import java.util.*;
import java.lang.*;
import java.text.*;

public class InventoryManagementSystem {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String itemName = null;
		do {
			System.out.print("Enter Item Name: ");
			itemName = scanner.nextLine();
			if (itemName.isBlank())
				System.err.println("Item name cannot be empty.");
		} while ((itemName == null) || itemName.isBlank());

		String companyName = null;
		do {
			System.out.print("Enter Company Name: ");
			companyName = scanner.nextLine();
			if (companyName.isBlank())
				System.err.println("Company name cannot be empty.");
		} while ((companyName == null) || companyName.isBlank());

		String answer = null;

		do {
				System.out.print("Do you want to create Item, Painkiller, Bandage or Equipment: ");
				answer = scanner.nextLine();
		} while ((answer == null) || answer.isBlank() || !(answer.equalsIgnoreCase("Painkiller")
				|| answer.equalsIgnoreCase("Bandage") || answer.equalsIgnoreCase("Equipment")));

		if (answer.equalsIgnoreCase("Item")) {
			Item item = new Item(itemName, companyName);
			item.printInfo();
		}

		else if (answer.equalsIgnoreCase("PainKiller")) {

			String expiryDate = null;
			do {
				  System.out.print("Enter Expiration Date: ");
			  	expiryDate = scanner.nextLine();
			} while ((expiryDate == null) || expiryDate.isBlank());

			int ageGroup = -1;
			do {

				try {
					System.out.print("Enter Age Group: ");
					ageGroup = Integer.parseInt(scanner.nextLine());

				} catch (NumberFormatException e) {
					System.err.println("Age group must be a number.");
				}
			} while (ageGroup < 0);

			Painkiller painkiller = new Painkiller(itemName, companyName, expiryDate, ageGroup);
			painkiller.printInfo();
		}
	}
}
```

## Version 3

#### [InvalidAnswerException.java](InvalidAnswerException.java)
```java
public class InvalidAnswerException extends Exception {

    public InvalidAnswerException() {
        super("The value entered is invalid");
    }

    public InvalidAnswerException(String message) {
        super(message);
    }
}
```

#### [InventoryManagementSystem.java](InventoryManagementSystem.java)
```java
import java.util.*;
import java.lang.*;
import java.text.*;

public class InventoryManagementSystem {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String itemName = null;
		do {
			System.out.print("Enter Item Name: ");
			itemName = scanner.nextLine();
			if (itemName.isBlank())
				System.err.println("Item name cannot be empty.");
		} while ((itemName == null) || itemName.isBlank());

		String companyName = null;
		do {
			System.out.print("Enter Company Name: ");
			companyName = scanner.nextLine();
			if (companyName.isBlank())
				System.err.println("Company name cannot be empty.");
		} while ((companyName == null) || companyName.isBlank());

		String answer = null;

		do {
			try {

				System.out.print("Do you want to create Item, Painkiller, Bandage or Equipment: ");
				answer = scanner.nextLine();
				if (answer.isBlank())
					throw new InvalidAnswerException();
			} catch (InvalidAnswerException e) {

				System.err.println(
						"Item name cannot be empty. It must be either \"Item\", \"Painkiller\", \"Bandage\" or \"Equipment\"");

			}
		} while ((answer == null) || answer.isBlank() || !(answer.equalsIgnoreCase("Painkiller")
				|| answer.equalsIgnoreCase("Bandage") || answer.equalsIgnoreCase("Equipment")));

		if (answer.equalsIgnoreCase("Item")) {

			Item item = new Item(itemName, companyName);
			item.printInfo();

		}

		else if (answer.equalsIgnoreCase("PainKiller")) {

			String expiryDate = null;
			do {

				// try {
				System.out.print("Enter Expiration Date: ");
				expiryDate = scanner.nextLine();

				// }
				// catch(ParseException e) {
				// System.err.println("Date must be in \"MM dd, yyyy\" format.");
				// }
			} while ((expiryDate == null) || expiryDate.isBlank());

			int ageGroup = -1;
			do {

				try {
					System.out.print("Enter Age Group: ");
					ageGroup = Integer.parseInt(scanner.nextLine());

				} catch (NumberFormatException e) {
					System.err.println("Age group must be a number.");
				}
			} while (ageGroup < 0);

			Painkiller painkiller = new Painkiller(itemName, companyName, expiryDate, ageGroup);
			painkiller.printInfo();

		}

	}

}
```
