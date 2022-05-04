package emailApp;

import java.util.ArrayList;

public class EmailDatabase {
	
	private static ArrayList<EmailApplication> emailInfo = new ArrayList<>();

	public static ArrayList<EmailApplication> getEmailInfo(){
		return emailInfo;
	}

	public static void addToDatabase(EmailApplication e) {
		emailInfo.add(e);

	}

	public static void printAllInformation() {
		emailInfo.forEach(x -> {
			System.out.println("Name: " + x.getFName() + " " + x.getLName()
			+ ", email address: " + x.getEmailAddress());
		});


	}
}
