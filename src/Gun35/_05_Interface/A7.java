package Gun35._05_Interface;

public class A7 implements IYazdirir,IGosterir{
    @Override
    public void Goster() {
        System.out.println("Gösterildi");
    }

    @Override
    public void Yaz(String msg) {
        System.out.println("msg = " + msg);
    }

    @Override
    public void Yaz() {
        System.out.println("Yazdirildi");
    }
}
