package password;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordChecker {
	
	private static boolean lengthChecker(String password) {
		
		int length = password.length();
		if (password.length() < 12) {
			System.out.println("**Password is too short. Password must be 12-30 characters.**");
		} else if ((password.length() > 30)) {
			System.out.println("**Password is too long. Password must be 12-30 characters.**");
		} else {
			System.out.println("Length requirements met");
		}
		return length > 12 && length < 30;

	}

	private static boolean numberChecker(String password) {

		Pattern numberPattern = Pattern.compile("[0-9]");
		Matcher numberMatcher = numberPattern.matcher(password);
		boolean containsANumber = numberMatcher.find();
		System.out.println((containsANumber) ? "Contains a number" : "**Does not contain a number. Password invalid**");

		return containsANumber;
	}

	private static boolean capsChecker(String password) {

		Pattern capsPattern = Pattern.compile("[A-Z]");
		Matcher capsMatcher = capsPattern.matcher(password);
		boolean containsCapitalLetter = capsMatcher.find();
		System.out.println((containsCapitalLetter) ? "Contains a capital letter" : "**Does not contain a capital letter. Password invalid**");

		return containsCapitalLetter;
	}

	private static boolean specialCharacterChecker(String password) {
	
		Pattern specialCharPattern = Pattern.compile("\\W");
		Matcher specialCharMatcher = specialCharPattern.matcher(password);
		boolean containsSpecialChar = specialCharMatcher.find();
		System.out.println((containsSpecialChar) ? "Contains a special character" : "**Does not contain a special character. Password invalid**");

		return containsSpecialChar;
	}
	
	public static boolean passwordValidityChecker(String password) {
		return lengthChecker(password) &&
				numberChecker(password) &&
				capsChecker(password) &&
				specialCharacterChecker(password);
				
	}
}
