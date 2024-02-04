package Gun35._07_Interface;

public class ToyotaPirius extends Vehicle implements IElectric,IGas{
    public ToyotaPirius(double engine, String model) {
        super(engine, model);
    }

    @Override
    public String changeBattery() {
        return "10 bin de bir batarya bakımı";
    }

    @Override
    public String drive() {
        return "İstediğin gibi kullan";
    }

    @Override
    public String changeOil() {
        return "Her 500 km de benzin al";
    }
}
