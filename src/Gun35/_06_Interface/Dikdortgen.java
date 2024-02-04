package Gun35._06_Interface;

public class Dikdortgen implements IGeometri{
    int uzunKenar;
    int kisaKenar;

    public Dikdortgen(int uzunKenar, int kisaKenar) {
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;
    }

    @Override
    public double alani() {
        return this.kisaKenar*this.kisaKenar;
    }

    @Override
    public double cevresi() {
        return (this.kisaKenar+this.uzunKenar)*2;
    }
}
