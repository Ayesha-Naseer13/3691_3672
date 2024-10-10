package git_lab08;

public class UserRegistration {

	public boolean validateUser(String username, String password, String email) {
        // Check username length
        if (username == null || username.length() < 6) {
            System.out.println("Username must be at least 6 characters long.");
            return false;
        }

        // Check if the password contains special characters
        if (!password.matches(".*[!@#$%^&*].*")) {
            System.out.println("Password must contain at least one special character.");
            return false;
        }

        // Return true if both conditions are met
        return true;
    }
	
}
