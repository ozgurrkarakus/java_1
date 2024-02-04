package Gun38;

import java.util.Arrays;

public class _02_JavaVeriTipleri {
    public static void main(String[] args) {

        int sayi1 = 5;
        int sayi2 = 10;

        sayi1 = sayi2;
        sayi1 = 45;
        sayi2 = 60;
        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);

        int []dizi1={1,2,3,4};
        int []dizi2={5,6};

        System.out.println("Arrays.toString(dizi1) = " + Arrays.toString(dizi1));
        System.out.println("Arrays.toString(dizi2)"+Arrays.toString(dizi2));

        dizi1=dizi2;

        System.out.println("Arrays.toString(dizi1) = " + Arrays.toString(dizi1));
        System.out.println("Arrays.toString(dizi2)"+Arrays.toString(dizi2));

        dizi1[0]=67;

        System.out.println("Arrays.toString(dizi1) = " + Arrays.toString(dizi1));
        System.out.println("Arrays.toString(dizi2)"+Arrays.toString(dizi2));

        dizi2[0]=80;

        System.out.println("Arrays.toString(dizi1) = " + Arrays.toString(dizi1));
        System.out.println("Arrays.toString(dizi2)"+Arrays.toString(dizi2));


        String ad="Özgür";
        String soyad="Karakuş";
        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);

        ad=soyad;
        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
        ad="Kaya";
        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);


        String s1;
        String s2=null;
        String s3="";
        String s4="Özgür";
        String s5=new String("Ahmet");

        s2.concat("Merhaba");









    }
}
