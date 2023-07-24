package core;

import java.util.Scanner;

public class Core {
    public int tunaiAtauKredit = 0;
    public int jenisMotor = 0;
    public int jenisCicilan = 0;
    public Scanner input;
    int uang = 0;

    public Core(Scanner input) {
        this.input = input;
    }

    public void menu() {
        System.out.println("BELI MOTOR");

        do {
            System.out.println("");
            System.out.println("1. Tunai");
            System.out.println("2. Kredit");
            System.out.print(">>> ");
            tunaiAtauKredit = input.nextInt();
        } while (!(tunaiAtauKredit > 0 && tunaiAtauKredit < 3));

    }

    public void submenu() {
        System.out.println("PILIH MOTOR");

        do {
            System.out.println("");
            System.out.println("1. Motor Keren : Rp. 10.000.000");
            System.out.println("2. Motor Super Keren : Rp. 15.000.000");
            System.out.println("3. Motor Keren Jasa : Rp. 20.000.000");
            System.out.print(">>> ");
            jenisMotor = input.nextInt();

        } while (!(jenisMotor > 0 && jenisMotor < 4));
    }

    public void cicilan() {
        System.out.println("PILIH CICILAN");

        do {
            System.out.println("");
            System.out.println("1. 6 Bulan");
            System.out.println("2. 12 Bulan");
            System.out.print(">>> ");
            jenisCicilan = input.nextInt();

        } while (!(jenisCicilan > 0 && jenisCicilan < 3));
    }

    public int getPrice() {
        if (jenisMotor == 1) {
            return 10000000;
        } else if (jenisMotor == 2) {
            return 15000000;
        } else if (jenisMotor == 3) {
            return 20000000;
        } else {
            return 0;
        }
    }

    public int getCicilanDiv() {
        if (jenisCicilan == 1) {
            return 6;
        } else if (jenisCicilan == 2) {
            return 12;
        } else {
            return 0;
        }
    }

    public void transaksi() {
        if (tunaiAtauKredit == 2) {
            cicilan();
            System.out.println("Harus membayar Rp." + (int)(getPrice() / getCicilanDiv()) + " setiap bulan");
        } else {
            do {
                System.out.print("Masukan jumlah pembayaran: Rp. ");
                uang = input.nextInt();
            } while (uang < getPrice());

            System.out.println("LUNASSS");
        }
    }
}
