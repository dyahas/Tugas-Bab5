package mainarith;

import java.util.Scanner;

public class MainArith {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai-1    : ");
        int nil1 = in.nextInt();
        System.out.print("Masukkan nilai-2    : ");
        int nil2 = in.nextInt();
        System.out.println("========================");
        Aritmatika.penjumlahan(nil1, nil2);
        Aritmatika.pengurangan(nil1, nil2);
        Aritmatika kali = new Aritmatika();
        kali.perkalian(nil1, nil2);
        Aritmatika bagi = new Aritmatika();
        bagi.pembagian(nil1, nil2);
        Aritmatika s = new Aritmatika();
        s.Sederhana(nil1, nil2);
    }
    
}
