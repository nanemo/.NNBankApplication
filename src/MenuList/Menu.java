package MenuList;

public class Menu {
    private static String menu = "1. Add customer" +
            "\n2. Create bank account for customer" +
            "\n3. Deposit into account" +
            "\n4. Withdraw from account" +
            "\n5. Account history" +
            "\n6. Exit";

    public static String getMenu() {
        return menu;
    }
}
