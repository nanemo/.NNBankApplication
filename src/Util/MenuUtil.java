package Util;

import MenuList.Menu;

import java.awt.*;
import java.util.Scanner;

public class MenuUtil {

    public static void showMenu(){
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Choose the operation \n");
            System.out.println(Menu.getMenu());
            int chooseFunction = scanner.nextInt();
            switch (chooseFunction){
                case 1:
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    break;
                case 5:
                    System.out.println();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Choose correct variant");
            }
        }
    }


}
