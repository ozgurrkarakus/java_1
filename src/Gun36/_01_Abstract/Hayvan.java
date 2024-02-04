package Gun36._01_Abstract;

//Abstract class
//abstract o zaman superclass ve superinterface ayni classda olmasi
public abstract class Hayvan {
    private String cinsi; //Encapsulation
    private int yas;


    abstract void ses();

    public void yemek(){
        System.out.println("yemek yedi");
    }

    public String getCinsi() {
        return cinsi;
    }

    public void setCinsi(String cinsi) {
        this.cinsi = cinsi;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}
