package emailApp;

import java.util.Scanner;

public class EmailAddressApplication {
	private String fName;
	private String lName;
	private String emailAddress;
	private static Scanner scan = new Scanner(System.in);
	
	public EmailAddressApplication() {
		
	}
	
	public String getFName() {
		return fName;
	}
	
	private void setFName(String fName) {
		this.fName = fName;
	}

	public String getLName() {
		return lName;
	}

	private void setLName(String lName) {
		this.lName = lName;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	private void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	
	public String toString() {
		return "EmailAddressApplication [fName=" + fName + ", lName=" + lName
				+ ", emailAddress=" + emailAddress + "]";
	}

	public void createAnEmailAddress() {
		
		System.out.println("Enter your first name");
		String firstName = scan.nextLine();
		this.setFName(firstName);
		
		System.out.println("Enter your last name");
		String lastName = scan.nextLine();
		this.setLName(lastName);
		
		System.out.println("Create a new email: ");
		String email = scan.nextLine();
		String site = "@fsc.com";
		this.setEmailAddress(email + site);
		
		boolean valid = EmailValidation.validate(this);
		while (!valid) {
			System.out.println("This email address already exists.");
			System.out.println("Create a new email address.");
			email = scan.nextLine();
			this.setEmailAddress(email + site);
			valid = EmailValidation.validate(this);
		}
		
		System.out.println("Email created.");
		EmailDatabase.addToDatabase(this);
		
	}
}
