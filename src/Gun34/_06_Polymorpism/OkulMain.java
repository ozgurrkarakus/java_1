package Gun34._06_Polymorpism;

public class OkulMain {
    public static void main(String[] args) {
        Kisi cal = new Calisan("Ayşe", "Yilmaz", "Yazılım", "BIM");

        Kisi ogr = new Ogrenci("Mehmet", "Kamil", "Ogrenci", "5A");

        cal.kimlikYaz(cal);
        ogr.kimlikYaz(ogr);


    }
}
