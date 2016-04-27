package mainarith;

public class Aritmatika {

    private int pembilang, penyebut;

    public static void penjumlahan(int nil1, int nil2) {
        int tambah = nil1 + nil2;
        System.out.println("Hasil Penjumlahan   : " + tambah);
    }

    public static void pengurangan(int nil1, int nil2) {
        int kurang = nil1 - nil2;
        System.out.println("Hasil Pengurangan   : " + kurang);
    }

    public void perkalian(int nil1, int nil2) {
        int kali = nil1 * nil2;
        System.out.println("Hasil Perkalian     : " + kali);
    }

    public void pembagian(double nil1, double nil2) {
        double bagi = nil1 / nil2;
        System.out.println("Hasil Pembagian     : " + bagi);
    }

    public void Sederhana(int nil1, int nil2) {
        pembilang = nil1;
        penyebut = nil2;
        int temp, a, b;
        if (penyebut == 0) {
            return;
        }
        a = (pembilang < penyebut) ? penyebut : pembilang;
        b = (pembilang < penyebut) ? pembilang : penyebut;
        while (b != 0) {
            temp = a % b;
            a = b;
            b = temp;
        }
        int hasil = pembilang /= a;
        int hsl = penyebut /= a;
        System.out.print("Hasil Penyederhanaan: " + (hasil));
        System.out.print("/");
        System.out.println(hsl);

    }
}