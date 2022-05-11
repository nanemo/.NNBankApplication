package util;

import entity.User;
import menulist.Menu;
import services.UserService;
import services.impl.UserServiceImpl;

import java.time.LocalDate;
import java.util.Scanner;
import static java.lang.System.*;

public class MenuUtil {

    private MenuUtil(){}

    public static void showMenu() {
        Scanner scanner = new Scanner(in);
        while (true) {
            out.println("Choose the operation \n");
            out.println(Menu.getMenuList());
            int chooseFunction = scanner.nextInt();
            switch (chooseFunction) {
                case 1:
                    UserService userService = new UserServiceImpl();

                    User user = new User("Laçın", "Hüseynov", "İlqar", LocalDate.of(1991,12,23),
                            "Biləsuvar", "Şəhər Mərkəzi", "AA", 5511664, "50ZUKUT",
                            "+994709948586", "lachin.huseynov@gmail.com");
                    userService.addUser(user);
                    break;
                case 2:
                    UserService userService2 = new UserServiceImpl();
                    userService2.getByIdIdentification("50ZUKUT");
                    out.println();
                    break;
                case 3:
                    out.println();
                    break;
                case 4:
                    out.println();
                    break;
                case 5:
                    out.println();
                    break;
                case 6:
                    exit(0);
                    break;
                default:
                    out.println("Choose correct variant");
                    break;
            }
        }
    }


}
