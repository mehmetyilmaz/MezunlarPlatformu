package com.example.model;

public class Kisi {
    private String ad;
    private String soyad;
    private String cinsiyet;
    private String hobiler;
    private String sehir;
    private String kullanici_adi;
    private String sifre;
    private String resim_url;
    private Integer yetki_seviyesi;

    public Kisi(){
    }
    // Constructor
    public Kisi(String ad, String soyad, String cinsiyet, String hobiler, String sehir, String kullanici_adi, String sifre, String resim_url, Integer yetki_seviyesi) {
        this.ad = ad;
        this.soyad = soyad;
        this.cinsiyet = cinsiyet;
        this.hobiler = hobiler;
        this.sehir = sehir;
        this.kullanici_adi = kullanici_adi;
        this.sifre = sifre;
        this.resim_url = resim_url;
        this.yetki_seviyesi = yetki_seviyesi;
    }

    // Getters and Setters
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

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getHobiler() {
        return hobiler;
    }

    public void setHobiler(String hobiler) {
        this.hobiler = hobiler;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    public String getKullaniciAdi() {
        return kullanici_adi;
    }

    public void setKullaniciAdi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getResimUrl() {
        return resim_url;
    }

    public void setResimUrl(String resim_url) {
        this.resim_url = resim_url;
    }
    
    public Integer getYetkiSeviyesi() {
        return yetki_seviyesi;
    }

    public void setYetkiSeviyesi(Integer yetki_seviyesi) {
        this.yetki_seviyesi = yetki_seviyesi;
    }
}
