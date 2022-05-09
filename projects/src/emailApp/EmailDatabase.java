package emailApp;

import java.util.ArrayList;

public class EmailDatabase {
	
	private static ArrayList<EmailAddressApplication> emailInfo = new ArrayList<>();

	public static ArrayList<EmailAddressApplication> getEmailInfo(){
		return emailInfo;
	}

	public static void addToDatabase(EmailAddressApplication e) {
		emailInfo.add(e);

	}

	public static void printAllInformation() {
		emailInfo.forEach(x -> {
			System.out.println("Name: " + x.getFName() + " " + x.getLName()
			+ ", email address: " + x.getEmailAddress());
		});


	}
}
