    package com.example.model;  
    public class Kullanici {
    private int id;
    private String ad;
    private String soyad;
    private String adres;
    private String telefon;
    private String simdikiOkul;
    private String is;
    private String ePosta;
    private String webAdresi;
    private String facebookId;
    private String twitter;

    // Parametresiz constructor
    public Kullanici() {
    }

    // Parametreli constructor
    public Kullanici(int id, String ad, String soyad, String adres, String telefon, String simdikiOkul, String is, String ePosta, String webAdresi, String facebookId, String twitter) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.adres = adres;
        this.telefon = telefon;
        this.simdikiOkul = simdikiOkul;
        this.is = is;
        this.ePosta = ePosta;
        this.webAdresi = webAdresi;
        this.facebookId = facebookId;
        this.twitter = twitter;
    }

    // Getter ve Setter metotları
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getSimdikiOkul() {
        return simdikiOkul;
    }

    public void setSimdikiOkul(String simdikiOkul) {
        this.simdikiOkul = simdikiOkul;
    }

    public String getIs() {
        return is;
    }

    public void setIs(String is) {
        this.is = is;
    }

    public String getePosta() {
        return ePosta;
    }

    public void setePosta(String ePosta) {
        this.ePosta = ePosta;
    }

    public String getWebAdresi() {
        return webAdresi;
    }

    public void setWebAdresi(String webAdresi) {
        this.webAdresi = webAdresi;
    }

    public String getFacebookId() {
        return facebookId;
    }

    public void setFacebookId(String facebookId) {
        this.facebookId = facebookId;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }
}
