## Basic Info
- Author: Aadarsh Devi
- Submission Date: Dec 7, 2025
- Assignment: Week 13/14

## Code
#### DataBaseMain.java
```java
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

public class DataBaseMain {
	public static Scanner scanner;

	public static String[] studentFields = {
			"ssn",
			"firstName",
			"mi",
			"lastName",
			"phone",
			"zipCode",
			"deptId",
			"street",
			"dob"
	};

	public static String[] studentIDFieldNames = {
			"SSN",
			"First Name",
			"Middle Name",
			"Last Name",
			"Phone",
			"Zip Code",
			"Department ID",
			"Street",
			"Date Of Birth"
	};


	public static void main(String[] args) throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/miramar", "aadarshdevi", "Pa$$word");
		if (connection == null){
			System.out.println("Connection Failed! Check output console");
			System.exit(1);
		} else if (connection.isClosed()){
			System.out.println("Connection Closed!");
			System.exit(1);
		}
		System.out.println("Database Connected!");

		Statement statement = connection.createStatement();

		scanner = new Scanner(System.in);
		boolean running = true;

		while(running) {
			cli("");
			String command = scanner.nextLine();
			String[] commands = command.split(" ");
			switch (commands[0]) {
				case "create": {
					String ssn = Integer.toString(getInteger("SSN"));
					String firstName = getString("First Name");
					String mi = getString("Middle Name");
					String lastName = getString("Last Name");
					String dob = getDate("Date of Birth").toString();
					String street = getString("Street");
					String phone = getString("Phone Number");
					String zipCode = getString("Zip Code");
					int deptId = getInteger("Department ID");

					PreparedStatement pstmt = connection.prepareStatement("""
								INSERT INTO Student (ssn, firstname, mi, lastname, birthDate, street, phone, zipCode, deptId)
								VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)
							""");

					pstmt.setString(1, ssn);
					pstmt.setString(2, firstName);
					pstmt.setString(3, mi);
					pstmt.setString(4, lastName);
					pstmt.setString(5, dob);
					pstmt.setString(6, street);
					pstmt.setString(7, phone);
					pstmt.setString(8, zipCode);
					pstmt.setInt(9, deptId);
					int rowsAffected = pstmt.executeUpdate();
					System.out.println("JDBC > Rows affected: " + rowsAffected);

					break;
				}
				case "update": {
					if (commands.length != 4) {
						exceptionln("Extra/Missing an argument");
						break;
					}
					if (!(validInput(commands[1]) || validInput(commands[3]))) {
						exceptionln("Argument 2/4 not valid");
						break;
					}

					String sql = "update Student set " + commands[3] + " = ? where " + commands[1] + " = " + commands[2] + ";";
					PreparedStatement preparedStatement = connection.prepareStatement(sql);
					preparedStatement.setString(1, getString(getFieldName(commands[3])));

					int rows = preparedStatement.executeUpdate();
					System.out.println("JDBC > Rows affected: " + rows);

					break;
				}
				case "get": {
					if (commands.length != 3) {
						exceptionln("Extra/Missing an argument");
						break;
					}
					try {
						String inputType = commands[1];
						String sqlInputType = "ssn";
						String sqlInputValue = "123456";
						switch (inputType) {
							case "ssn":
								sqlInputValue = commands[2];
								break;
							case "firstName":
							case "mi":
							case "lastName":
							case "phone":
							case "zipCode":
							case "deptId":
							case "street":
							case "dob":
								sqlInputType = commands[1];
								sqlInputValue = "'" + commands[2] + "'";
								break;
							default:
								exceptionln(commands[0]);

						}

						ResultSet resultSet = statement.executeQuery(String.format("select * from Student where ssn = %s;", sqlInputValue));
						if (resultSet.next()) {
							System.out.println(
								"\n\tSSN: " + resultSet.getString("ssn")
								+ "\n\tFirst Name: " + resultSet.getString("firstName")
								+ "\n\tMiddle Name: " + resultSet.getString("mi")
								+ "\n\tLast Name: " + resultSet.getString("lastName")
								+ "\n\tBirth Date: " + resultSet.getString("birthDate")
								+ "\n\tStreet: " + resultSet.getString("street")
								+ "\n\tPhone: " + resultSet.getString("phone")
								+ "\n\tZip Code: " + resultSet.getString("zipCode")
								+ "\n\tDepartment ID: " + resultSet.getString("deptId")
								+ "\n"
							);
						}
					} catch (IndexOutOfBoundsException e) {
						exceptionln("Value(s) Not Entered");
					}
					break;
				}
				case "exit": {
					running = false;
					break;
				}
				default: {
					exception("Invalid Command > " + command);
					break;
				}
			}
		}

		connection.close();
		System.out.println("Database Disconnected!");
		System.out.println("Exiting Application...");
	}

	private static String getFieldName(String command) {
		return switch (command) {
			case "ssn" -> "SSN";
			case "firstName" -> "First Name";
			case "mi" -> "Middle Name";
			case "lastName" -> "Last Name";
			case "phone" -> "Phone";
			case "zipCode" -> "Zip Code";
			case "deptId" -> "Department ID";
			case "street" -> "Street";
			case "dob" -> "Date Of Birth";
			default -> throw new IllegalStateException("Unexpected value: " + command);
		};
	}

	public static void cli(String message) {
		System.out.print("JDBC > " + message);
	}


	private static void exception(String errorMessage) {
		System.err.println("JDBC > EXCEPTION > " + errorMessage);
	}

	private static void exceptionln(String errorMessage) {
		System.out.println();
		exception(errorMessage);
	}

	public static String getString(String inputName) {
		String value = null;
		do {
			System.out.print("Enter " + inputName + ": ");
			value = scanner.nextLine();
		} while (value == null);
		return value;
	}

	public static int getInteger(String inputName) {
		int value = -1;
		do {
			try{
				System.out.print("Enter " + inputName + ": ");
				value = Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {
				System.err.println("Please enter a valid number");
			}
		} while (value < 0);
		return value;
	}

	public static LocalDate getDate(String inputName) {
		LocalDate value = null;
		do {
			try {
				System.out.print("Enter " + inputName + ": ");
				value = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("MMM dd, yyyy"));
			} catch (DateTimeParseException e) { // YYYY-MM-DD
				System.err.println("Please enter a valid date in format MMM dd, yyyy");
			}
		} while (value == null);
		return value;
	}

	public static boolean validInput(String inputType) {
		return List.of(studentFields).contains(inputType);
	}

	public static String toString (String value) {
		return "'" + value + "'";
	}
}
```

## What to Submit
1. The flowchart of my thought process: [Draw.io file](database_flowchart.drawio)
2. Flowchart as an image: [Draw.io Image](database_flowchart_image.png)
3. What were your challenges in performing the lab:
    - Trying to figure out how to use write SQL statements in Strings without making a mess. ANS: PreparedStatements.
    - Previous personla project used JDBC.
    - Used AI to remember classes and sql statements.
    - Writing better code.
5. Code for the assignment: [DataBaseMain.java](PalindromeChecker.java)
7. Video explaining code: TODO: [Video Explanation](https://youtu.be/k9r6yqKk80k)
