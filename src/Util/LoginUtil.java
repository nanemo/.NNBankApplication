package Util;

import java.util.Scanner;

public class LoginUtil {
    private static final String login = "admin";
    private static final transient String password = "admin";
    private static int i = 0;
    private static LoginUtil loginUtil = null;

    private LoginUtil(){
    }

    public void signIn() {
        System.out.println("Welcome to NNBank application");
        Scanner scanner = new Scanner(System.in);
        String login;
        String password;

        while (true) {
            System.out.println("Please write login");
            login = scanner.nextLine();
            System.out.println("Please write password");
            password = scanner.nextLine();

            if (this.login.equalsIgnoreCase(login) && this.password.equals(password)) {
                System.out.println("Password is correct! \n");
                break;
            } else {
                System.out.println("Login or password is not correct! ");
                i++;
                if (i == 3) {
                    System.exit(0);
                }
            }
        }
    }

    public static LoginUtil getLoginObject(){
        if (loginUtil == null){
            loginUtil = new LoginUtil();
        }
            return loginUtil;
    }
}
