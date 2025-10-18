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