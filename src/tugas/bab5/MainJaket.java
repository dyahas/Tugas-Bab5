package mainjaket;

import java.util.Scanner;

public class MainJaket {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilih = 0;
        System.out.println("         Selamat Datang di CV. Labkomdas");
        System.out.println("===================================================");
        do {
            System.out.println("Jenis Jaket :");
            System.out.println("1. Jaket A      Rp 100.000/pcs");
            System.out.println("   Pembelian > 100 pcs harga jadi Rp 95.000/pcs");
            System.out.println("2. Jaket B      Rp 125.000/pcs");
            System.out.println("   Pembelian > 100 pcs harga jadi Rp 120.000/pcs");
            System.out.println("3. Jaket B      Rp 175.000/pcs");
            System.out.println("   Pembelian > 100 pcs harga jadi Rp 160.000/pcs");
            System.out.println("4. Keluar");
            System.out.print("Pilih   : ");
            pilih = in.nextInt();
            System.out.println("===================================================");
            switch (pilih) {
                case 1:
                    System.out.println("                     JAKET A");
                    System.out.println("===================================================");
                    Jaket A = new Jaket();
                    System.out.print("Masukkan jumlah jaket A   : ");
                    int jA = in.nextInt();
                    A.diskonJaketA(jA);
                    System.out.println("===================================================");
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("                     JAKET B");
                    System.out.println("===================================================");
                    Jaket B = new Jaket();
                    System.out.print("Masukkan jumlah jaket B   : ");
                    int jB = in.nextInt();
                    B.diskonJaketB(jB);
                    System.out.println("===================================================");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("                     JAKET C");
                    System.out.println("===================================================");
                    Jaket C = new Jaket();
                    System.out.print("Masukkan jumlah jaket C   :");
                    int jC = in.nextInt();
                    C.diskonJaketC(jC);
                    System.out.println("===================================================");
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("========= TERIMA KASIH ATAS KUNJUNGAN ANDA =========");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia!");

            }
        } while (pilih != 4);
    }

}
