package Gun39;

public class _05_TryCatchFinally {
    public static void main(String[] args) {

        System.out.println("Program Başladı");

        String str="";
        long startTime=0;

        try {
            startTime=System.currentTimeMillis();
            System.out.println("Hatadan Önceki Kısım");
        char ilkHarf=str.charAt(3);
            System.out.println("Hatadan Sonraki Kısım");

        }
        catch (Exception ex){
            System.out.println("Hata  Olduğunda Çalışan Kısım");
        }
        finally {
            long gecenSure=System.currentTimeMillis()-startTime;
            System.out.println("gecenSure = " + gecenSure);
            System.out.println("try-catch bloğuyla ilgili son kısım");
        }
        System.out.println("Diğer kodlar");

        System.out.println("Program Bitti");


    }
}
