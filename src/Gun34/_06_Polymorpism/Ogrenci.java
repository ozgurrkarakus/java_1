package Gun34._06_Polymorpism;

public class Ogrenci extends Kisi{
    private String subesi;


    public Ogrenci(String ad, String soyaAd, String gorev, String subesi) {
        super(ad, soyaAd, gorev);
    setSubesi(subesi);

    }

    public String getSubesi() {
        return subesi;
    }

    public void setSubesi(String subesi) {
        this.subesi = subesi;
    }
}
