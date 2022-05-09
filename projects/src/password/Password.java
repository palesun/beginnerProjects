package password;

import java.util.Scanner;

public class Password {
	private String pw; 
	private Validity validity = Validity.INVALID;
	private static Scanner scan = new Scanner(System.in);
	
	public Password() {
		
	}

	private String getPw() {
		return pw;
	}

	private void setPw(String pw) {
		this.pw = pw;
	}

	private Validity getValidity() {
		return validity;
	}

	private void setValidity(Validity validity) {
		this.validity = validity;
	}
	
	
	public void passwordCreator() {
		
		System.out.println("Please enter a new password: ");
		String password = scan.nextLine();
		boolean isValid = PasswordChecker.passwordValidityChecker(password);
		while(!isValid) {
			System.out.println("Password is invalid.");
			System.out.println("Please enter a new password: ");
			password = scan.nextLine();
			isValid = PasswordChecker.passwordValidityChecker(password);
		}	
		
		System.out.println();
		System.out.println("Password created");
		this.setValidity(Validity.VALID);
		this.setPw(password);		
		
	}
}
