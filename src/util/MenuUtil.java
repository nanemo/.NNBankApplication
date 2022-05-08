package util;

import menulist.Menu;
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
                    out.println();
                    break;
                case 2:
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
