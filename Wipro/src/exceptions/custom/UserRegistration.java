package exceptions.custom;

public class UserRegistration {
    void registerUser(String username, String userCountry) throws InvalidCountryException {
        if(!userCountry.equals("India"))
            throw new InvalidCountryException("User Outside India cannot be registered");
        else
            System.out.println("User registration done successfully");
    }

    public static void main(String[] args) {
        UserRegistration u = new UserRegistration();
        try {
            u.registerUser("Mickey", "US");  // change to "India" to test success
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}