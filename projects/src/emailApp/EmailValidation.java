package emailApp;

public class EmailValidation {
	
	private static boolean doesNotExist;

	public static boolean validate(EmailApplication e) {

		doesNotExist = EmailDatabase.getEmailInfo().stream()
				.noneMatch(x -> e.getEmailAddress().equals(x.getEmailAddress()));

		//System.out.println("doesNotExist = " + doesNotExist);
		return doesNotExist;

	}
}
