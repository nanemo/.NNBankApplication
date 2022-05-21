package menulist;

import entity.UserBankAccount;

public class Menu {

    private Menu() {
    }

    private static String menuList = "1. Add customer" +
            "\n2. Create bank account for customer" +
            "\n3. Deposit into account" +
            "\n4. Withdraw from account" +
            "\n5. Account history" +
            "\n6. Exit";

    public static String getMenuList() {
        return menuList;
    }
}
