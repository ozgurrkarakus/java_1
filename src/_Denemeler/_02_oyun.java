package _Denemeler;

import java.util.Random;
import java.util.Scanner;

public class _02_oyun {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int min = 10;
        int max = 99;
        int rastgeleSayi = random.nextInt(max - min + 1) + min;

        System.out.println("Zorluk seviyesini seçin:");

        System.out.println("Kolay için 1'i, Orta için 2'yi, Zor için 3'ü girin:");
        int zorlukSeviyesi = scanner.nextInt();

        int tahminHakki = 0;
        switch (zorlukSeviyesi) {
            case 1:
                tahminHakki = 10;
                break;
            case 2:
                tahminHakki = 7;
                break;
            case 3:
                tahminHakki = 5;
                break;
            default:
                System.out.println("Geçersiz seçim. Varsayılan olarak Kolay seviyesi seçildi.");
                tahminHakki = 10;
                break;
        }

        boolean dogruTahmin = false;
        while (tahminHakki > 0 && !dogruTahmin) {
            System.out.println("Lütfen tahmininizi girin (" + tahminHakki + " hakkınız kaldı):");
            int kullaniciTahmini = scanner.nextInt();

            if (kullaniciTahmini == rastgeleSayi) {
                dogruTahmin = true;
            } else if (kullaniciTahmini < rastgeleSayi) {
                System.out.println("Lütfen daha büyük bir sayı giriniz.");
            } else {
                System.out.println("Lütfen daha küçük bir sayı giriniz.");
            }

            tahminHakki--;
        }

        if (dogruTahmin) {
            System.out.println("Tebrikler, " + rastgeleSayi + " sayısını " + (10 - tahminHakki) + ". seferde doğru tahmin ettiniz.");
        } else {
            System.out.println("Üzgünüm, doğru sayıyı tahmin edemediniz. Bilgisayarın tuttuğu sayı: " + rastgeleSayi);
        }


    }
}


