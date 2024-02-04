package Gun38;

public class _01_StringBufferAndBuilder {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        String test1 = "";
        for (int i = 0; i < 30000; i++)
            test1 = test1 + "merhaba";

        System.out.println(" + için  Geçen süre" + (System.currentTimeMillis()-startTime)+" ms");

        System.out.println("***************************************************");


         startTime = System.currentTimeMillis();
        String test2 = "";
        for (int i = 0; i < 30000; i++)
            test2 = test2.concat("merhaba");

        System.out.println(" concat için  Geçen süre" + (System.currentTimeMillis()-startTime)+" ms");

        System.out.println("***************************************************");


        startTime = System.currentTimeMillis();
        StringBuilder test3=new StringBuilder();
        for (int i = 0; i < 30000; i++)
            test3.append("merhaba");

        System.out.println(" StringBuilder için  Geçen süre" + (System.currentTimeMillis()-startTime)+" ms");

        System.out.println("********************************\n\n");
        /********** StringBuilder i biraz yakından Tanıyalım **************************/

        StringBuilder sb=new StringBuilder();
        sb.append("Bugün");
        sb.append(" Hava");
        sb.append(" Soğuk");
        System.out.println("sb = " + sb);

        System.out.println("sb.length() = " + sb.length());
        sb.append(4);
        System.out.println("sb = " + sb);

        sb.reverse();
        System.out.println("sb = " + sb);
        sb.reverse();

        sb.delete(0, 5);
        System.out.println("sb = " + sb);

        sb.deleteCharAt(3);
        sb.insert(5, "kelime ");
        System.out.println("sb = " + sb);










    }
}
