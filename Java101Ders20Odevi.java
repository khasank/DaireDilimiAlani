package Giris;

import java.util.Scanner;

public class Java101Ders20Odevi {
    public static void main(String[] args) {
    // Değişkenlerimizi tanımlıyoruz.
    double yaricap , pi = 3.14 , merkezAciOlcusu , alan ;

    // Scanner tipi değişlenimizi tanımlıyoruz.
        Scanner giris = new Scanner(System.in) ;

        // Kullanıcıdan giriş verilerini alıyoruz.
        System.out.print("Daire diliminin yarıçapını giriniz : ");
        yaricap = giris.nextDouble();
        System.out.print("Daire diliminin merkez açısının ölçüsünü giriniz : ");
        merkezAciOlcusu = giris.nextDouble();

        // Hesaplamaları yapıyoruz.
        alan = ( pi * (yaricap*yaricap) * merkezAciOlcusu) / 360 ;

        // Ekrana yazdırma işlemlerini yapıyoruz .
        System.out.println("Daire diliminin alanı : " + alan );

    }

}
