package _NOTLAR.opp;

import java.util.Scanner;

public class opp {
    public static void main(String[] args) {
        Scanner okuStr=new Scanner(System.in);
        Scanner okuInt=new Scanner(System.in);

        Ogrenci ogr1=new Ogrenci();

        System.out.print("Ögrenci Adi Girin: ");
        ogr1.adi=okuStr.nextLine();
        System.out.print("SoyAdi Giriniz: ");
        ogr1.soyAdi= okuStr.nextLine();
        System.out.print("Adresi Giriniz: ");
        ogr1.adresi=okuStr.nextLine();
        System.out.print("Sinif Giriniz: ");
        ogr1.sinif=okuInt.nextInt();
        System.out.print("OkulNo Giriniz: ");
        ogr1.sinif=okuInt.nextInt();

        System.out.print("ogr1 = " + ogr1);






    }
}
