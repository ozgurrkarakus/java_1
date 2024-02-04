package Gun39;

import java.util.Scanner;

public class _02_JavaRuntimeException {
    public static void main(String[] args) {
        System.out.println("Program Calıişmaya Başladı");

        try {
            Scanner oku = new Scanner(System.in);

            System.out.print("sayi1 Gir ");
            int sayi1 = oku.nextInt();
            System.out.print("sayi1 Gir ");
            int sayi2 = oku.nextInt();

            int bolum = sayi1 / sayi2;
            System.out.println("bolum = " + bolum);


        } catch (Exception hata){
            System.out.println("Hata oluştu");
            System.out.println(hata);
    }

 System.out.println("Program Bitti");

}
}
