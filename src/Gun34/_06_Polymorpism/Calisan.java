package Gun34._06_Polymorpism;

public class Calisan extends Kisi{
    private String departman;


    public Calisan(String ad, String soyaAd, String gorev,String departman) {
        super(ad, soyaAd, gorev);
        setDepartman(departman);

    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }
}
