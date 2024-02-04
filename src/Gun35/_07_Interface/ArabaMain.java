package Gun35._07_Interface;

public class ArabaMain {
    public static void main(String[] args) {
        TeslaCar teslaCar=new TeslaCar(3200,"Model S");
        System.out.println("Tesla =>  "+teslaCar.drive());
        System.out.println(teslaCar.changeBattery());

        System.out.println("**********************\n");

        Bus bus=new Bus(550,"Mercedes");
        System.out.println("Bus => "+bus.drive());
        System.out.println(bus.changeDiesel());

        System.out.println("*********************\n");

        ToyotaPirius toyotaPirius=new ToyotaPirius(1200,"Sedan");
        System.out.println("Toyota => " +toyotaPirius.drive());
        System.out.println(toyotaPirius.changeBattery());
        System.out.println(toyotaPirius.changeOil());
    }
}
