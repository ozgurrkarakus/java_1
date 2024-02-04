package Gun38;

public class _04_StringKarsilastirma {
    public static void main(String[] args) {
        String kelime1 = "merhaba";
        String kelime2 = "merhaba";

        if (kelime1 == kelime2)
            System.out.println("Eşit 1");
        if (kelime1.equals(kelime2))
            System.out.println("Eşit 2");


        String kelime3=new String( "merhaba");
        String kelime4=new String( "merhaba");

        if (kelime3==kelime4)
            System.out.println("Eşit 3");
            if (kelime3.equals(kelime4))
                System.out.println("Eşit 4");




    }
}
