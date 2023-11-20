package exercise1;

public class BasicUserAccount implements UserAccount{
    @Override
    public void createAccount() {
        System.out.println("Creating a new user account: ");
    }

    @Override
    public void updateAccount() {
        System.out.println("Updating your account: ");

    }

    @Override
    public void deleteAccount() {
        System.out.println("Deleting your account: ");
    }
}
