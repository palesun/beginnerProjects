package emailApp;

public class EmailValidation {
	
	private static boolean doesNotExist;

	public static boolean validate(EmailAddressApplication e) {

		doesNotExist = EmailDatabase.getEmailInfo().stream()
				.noneMatch(x -> e.getEmailAddress().equals(x.getEmailAddress()));

		
		return doesNotExist;

	}
}
