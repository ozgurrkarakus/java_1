package Gun39;

public class _07_JavaCheckedveUncheckedException {
    public static void main(String[] args) {
        String kelime="";
        try {
            char ilkHarf=kelime.charAt(0);
        }
        catch (Exception ex){

            System.out.println("Hata Oluştu");
        }


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Hata Oluştu");
            }




    }
}
