package _Denemeler;

import java.util.Random;
import java.util.Scanner;

public class _04_oyun2 {
    public static void main(String[] args) {
       Scanner oku=new Scanner(System.in);

        int tahmin;
        Random i= new Random();


        int bilgisayarSayisi=(int) (Math.random()*(90)+10);


        System.out.print("Zorluk Seviyesini Giriniz ( 1=:10/2= Orta:7 /3=Zor:5)= ");
        int zorlukSeviyesi = oku.nextInt();
        int tahminHakki=0;

        switch (zorlukSeviyesi) {
            case 1: tahminHakki = 10;break;
            case 2 : tahminHakki = 7; break;
            case 3  : tahminHakki = 5; break;

            default :
                System.out.println("Yanlış Tercih default olarak ayarlandı");
                tahminHakki=10;
                break;
        }

        while (tahminHakki>10){
            System.out.print("Sayi Giriniz (10 ile 90 arası) =");
            int tahmin2= oku.nextInt();

            if (tahmin2==bilgisayarSayisi){
                System.out.println("Tebrikler");


            }



        }

    }
}
