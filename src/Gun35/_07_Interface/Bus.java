package Gun35._07_Interface;

public class Bus extends Vehicle implements IDiesel{
    public Bus(double engine, String model) {
        super(engine, model);
    }

    @Override
    public String changeDiesel() {
        return "700 km de Diesel al";
    }

    @Override
    public String drive() {
        return "Yavaş Sürünüz";
    }
}
