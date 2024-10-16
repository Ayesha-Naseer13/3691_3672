package git_lab08;

public class UserRegistration {

    public boolean validateUser(String username, String password, String email) {
        // Check username length (Member 1's addition)
        if (username == null || username.length() < 6) {
            System.out.println("Username must be at least 6 characters long.");
            return false;
        }

        // Check if the password contains special characters (Member 1's addition)
        if (!password.matches(".[!@#$%^&].*")) {
            System.out.println("Password must contain at least one special character.");
            return false;
        }

        // Check if username already exists (Member 2's addition)
        if (isDuplicateUsername(username)) {
            System.out.println("Username already exists.");
            return false;
        }

        // Validate email format (Member 2's addition)
        if (!email.contains("@")) {
            System.out.println("Invalid email format.");
            return false;
        }
        // Log the registration attempt (Member 2's addition)
        logUserRegistration(username, email);

        // Return true if all conditions are met
        System.out.println("User registration successful.");
        return true;
    }

    // Method to check for duplicate usernames (Member 2's addition)
    private boolean isDuplicateUsername(String username) {
        // Simulate a check for an existing username. Assume "existingUser" is already in use.
        return "existingUser".equals(username);
    }

    // Method to log the registration attempt (Member 2's addition)
    private void logUserRegistration(String username, String email) {
        System.out.println("Logging registration: Username = " + username + ", Email = " + email);
    }
}