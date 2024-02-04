package Gun34._06_Polymorpism;

public class Kisi {
    private String ad;
    private String soyaAd;
    private String gorev;

    public Kisi(String ad, String soyaAd, String gorev) {
        setAd(ad);
        setSoyaAd(soyaAd);
        setGorev(gorev);
    }

    public void kimlikYaz(Kisi gelenKisi) {
        System.out.println("\n***** Kimlik Belgesi *****");
        System.out.println("Ad = " + gelenKisi.getAd());
        System.out.println("SoyaAd = " + gelenKisi.getSoyaAd());
        System.out.println("Gorev = " + gelenKisi.getGorev());

        if (gelenKisi instanceof Calisan)
            System.out.println("Deparmanı = " + ((Calisan) gelenKisi).getDepartman());

        if (gelenKisi instanceof Ogrenci)
            System.out.println("Subesi" + ((Ogrenci) gelenKisi).getSubesi());
    }


    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyaAd() {
        return soyaAd;
    }

    public void setSoyaAd(String soyaAd) {
        this.soyaAd = soyaAd;
    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }
}
