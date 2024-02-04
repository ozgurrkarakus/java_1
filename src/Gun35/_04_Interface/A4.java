package Gun35._04_Interface;

public class A4 implements IGoster,IYazdirir{
    @Override
    public void Goster() {
        System.out.println("Gösterildi");
    }

    @Override
    public void Yazdir() {
        System.out.println("Yazdirildi");

    }
}
