package util;

import java.io.Serializable;
import java.util.Scanner;
import static java.lang.System.*;

public class LoginUtil implements Serializable {
    private static final String LOGIN = "admin";
    private static final transient String PASSWORD = "admin";
    private int i = 0;
    private static LoginUtil loginUtil = null;

    private LoginUtil(){
    }

    public void signIn() {
        out.println("Welcome to NNBank application");
        Scanner scanner = new Scanner(in);
        String login;
        String password;

        while (true) {
            out.println("Please write login");
            login = scanner.nextLine();
            out.println("Please write password");
            password = scanner.nextLine();

            if (LoginUtil.LOGIN.equalsIgnoreCase(login) && LoginUtil.PASSWORD.equals(password)) {
                out.println("Password is correct! \n");
                break;
            } else {
                out.println("Login or password is not correct! ");
                i++;
                if (i == 3) {
                    exit(0);
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
