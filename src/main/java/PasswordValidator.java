public class PasswordValidator {
    public static String validatePassword(String password) {
        boolean hasMinLength = password.length() >= 8;
        boolean hasUpper = password.matches(".*[A-Z].*");
        boolean hasLower = password.matches(".*[a-z].*");
        boolean hasNumber = password.matches(".*\\d.*");
        boolean hasSpecialCharacter = password.matches(".*\\W.*");

        if (hasMinLength && hasUpper && hasLower && hasNumber && hasSpecialCharacter) {
            return "Valid password";
        } else {
            String result = "Invalid password\n";
            if (!hasMinLength) result += "- Must be at least 8 characters long.\n";
            if (!hasUpper) result += "- Must contain capital letters.\n";
            if (!hasLower) result += "- Must contain lowercase letters.\n";
            if (!hasNumber) result += "- Must contain a number.\n";
            if (!hasSpecialCharacter) result += "- Must contain special character.\n";

            return result;
        }
    }
}
