package modul2;

import java.util.Scanner;

public class inputoutput {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Masukan Nama Anda : ");
        String nama = scanner.nextLine();

        System.out.println("Selamat pagi " + nama );
    }
}
