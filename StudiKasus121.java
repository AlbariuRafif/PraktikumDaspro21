import java.util.Scanner;

public class StudiKasus121 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hargaPerCup = 18000;
        int minimalDiskon = 100000;
        int jumlahCup, totalHarga, totalBayar, uangBayar, kembalian, diskon = 0;

        // Input jumlah cup dan uang bayar
        System.out.print("Masukkan jumlah cup: ");
        jumlahCup = input.nextInt();

        System.out.print("Masukkan uang bayar: Rp ");
        uangBayar = input.nextInt();

        // Menghitung total harga
        totalHarga = jumlahCup * hargaPerCup;

        if (totalHarga >= minimalDiskon) {
            diskon = totalHarga * 10 / 100;
        }

        // Menghitung total bayar
        totalBayar = totalHarga - diskon;

        System.out.println("Total Harga    : Rp " + totalHarga);
        System.out.println("Diskon         : Rp " + diskon);
        System.out.println("Total Bayar    : Rp " + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian      : Rp " + kembalian);
        } else {
            int kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp " + kurang);
        }

    }
}