import core.Core;
import java.util.Scanner;

public class Main extends Core {
    public Main() {
        super(new Scanner(System.in));
    }

    public static void main(String[] args) {
        Core core = new Core(new Scanner(System.in));
        core.menu();
        core.submenu();
        core.transaksi();


        core.input.close();
    }
}