import java.util.Scanner;

import net.mercadona.menu.Menu;

public class App {
    public static void main(String[] args) throws Exception {
        final Scanner SC = new Scanner(System.in);
        Menu.setKeepAsking(true);
        while (Menu.getKeepAsking()) {
            Menu.showMainMenu();
            Menu.optionMenu(SC.nextLine());
        }
        SC.close();
    }
}
