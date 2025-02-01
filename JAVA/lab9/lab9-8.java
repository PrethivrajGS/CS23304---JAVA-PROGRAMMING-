import java.util.HashSet;
class WeakPasswordException extends Exception {
    public WeakPasswordException(String message) {
        super(message);
    }
}

class AccountExistsException extends Exception {
    public AccountExistsException(String message) {
        super(message);
    }
}

class EmailAccount {
    private String userName;
    private String password;
    private int age;
    private String address;
    private String mobileNumber;
    private String inbox = "";
    
    private static HashSet<String> accountNames = new HashSet<>();

    public EmailAccount(String userName, String password, int age, String address, String mobileNumber) throws WeakPasswordException, AccountExistsException {
        if (accountNames.contains(userName)) {
            throw new AccountExistsException("Account name already exists!");
        }

        if (!isStrongPassword(password)) {
            throw new WeakPasswordException("Password is weak. It should be at least 8 characters long and contain an uppercase letter.");
        }

        this.userName = userName;
        this.password = password;
        this.age = age;
        this.address = address;
        this.mobileNumber = mobileNumber;
        accountNames.add(userName);
    }

    public boolean isStrongPassword(String password) {
        return password.length() >= 8 && password.chars().anyMatch(Character::isUpperCase);
    }

    public void compose(String message) {
        inbox += message + "\n";
    }

    public void displayInbox() {
        System.out.println("Inbox for " + userName + ":");
        System.out.println(inbox);
    }
    
    public static void main(String[] args) {
        try {
            EmailAccount account1 = new EmailAccount("user1", "StrongPass123", 25, "Chennai", "9876543210");
            account1.compose("Welcome to your inbox!");
            account1.displayInbox();
            
            // Trying to create an account with the same name
            EmailAccount account2 = new EmailAccount("user1", "Weakpass", 30, "Mumbai", "9876543211");
        } catch (WeakPasswordException | AccountExistsException e) {
            System.out.println(e.getMessage());
        }
    }
}