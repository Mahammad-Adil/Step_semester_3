class PasswordChecker {

    private final String password;

    // Constructor
    public PasswordChecker(String password) {
        this.password = password;
    }

    // Check password strength
    public String getStrength() {

        int length = password.length();

        if (length < 6) {
            return "Weak";
        } else if (length <= 9) {
            return "Medium";
        } else {
            return "Strong";
        }
    }
}

public class MainPasswordChecker {
    public static void main(String[] args) {

        PasswordChecker pc = new PasswordChecker("abcd");
        System.out.println(pc.getStrength());

        PasswordChecker pc2 = new PasswordChecker("abcdefghij");
        System.out.println(pc2.getStrength());

        PasswordChecker pc3 = new PasswordChecker("abcdefgh1234");
        System.out.println(pc3.getStrength());
    }
}