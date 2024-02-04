package _Denemeler;

import java.util.Scanner;

public class _01 {
    public static void main(String[] args) {
        //Soru:
        //Kullanıcıdan bir kelime girmesini isteyen bir Java programı yazın.Program, girilen kelimenin uzunluğunu, ilk
        //harfini büyük harfe çevrilmiş olarak kelimenin son halini ekrana yazdıran  ve ikinci harfini ekrana yazdıran
        //programı kodlayınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Kelime Gir: ");
        String kelime = oku.nextLine();

        System.out.println("kelime.length() = " + kelime.length());

        String ilkHarfBuyuk=kelime.substring(0,1).toUpperCase()+kelime.substring(1);
        System.out.println("ilkHarfBuyuk = " + ilkHarfBuyuk);

        char ikinciHarf=kelime.charAt(1);
        System.out.println("ikinciHarf = " + ikinciHarf);


        //Soru:
        //Kullanıcıdan ayrı ayrı iki kelime girmesini isteyen bir Java programı yazın.
        //Program, girilen kelimelerin uzunluklarını ve birleştirilmiş halini değişkenlere atadıktan sonra
        //ekrana yazdıran programı kodlayınız




















    }
}
