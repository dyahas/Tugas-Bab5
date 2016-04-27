package mainjaket;

public class Jaket {

    private final int jaketA = 100000;
    private final int jaketB = 125000;
    private final int jaketC = 175000;

    public void hitungDiskonA(int beliA) {
        if (beliA > 100) {
            int harga = beliA * 95000;
            System.out.println("Anda mendapatkan Diskon");
            System.out.println("Jaket A : Rp 95.000/pcs");
            System.out.println("Total Harga: " + harga);
        } else if (beliA <= 100) {
            int harga = beliA * jaketA;
            System.out.println("Total Harga : " + harga);
        }
    }

    public void hitungDiskonB(int beliB) {
        if (beliB > 100) {
            int harga = beliB * 120000;
            System.out.println("Anda mendapatkan Diskon");
            System.out.println("Jaket B : Rp 120.000/pcs");
            System.out.println("Total Harga: " + harga);
        } else if (beliB <= 100) {
            int harga = beliB * jaketB;
            System.out.println("Total Harga: " + harga);
        }
    }

    public void hitungDiskonC(int beliC) {
        if (beliC > 100) {
            int harga = beliC * 160000;
            System.out.println("Anda mendapatkan Diskon");
            System.out.println("Jaket C : Rp 160.000/pcs");
            System.out.println("Total Harga: " + harga);
        } else if (beliC <= 100) {
            int harga = beliC * jaketC;
            System.out.println("Total Harga: " + harga);
        }
    }
}
