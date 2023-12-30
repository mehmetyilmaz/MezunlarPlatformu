package com.example.model;

import java.util.Date;

public class ForumMesaj {
    private int id;
    private String kullaniciAdi;
    private String icerik;
    private Date tarih;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getIcerik() {
        return icerik;
    }

    public void setIcerik(String icerik) {
        this.icerik = icerik;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    public ForumMesaj() {
        
    }

    public ForumMesaj(int id, String kullaniciAdi, String icerik, Date tarih) {
        this.id = id;
        this.kullaniciAdi = kullaniciAdi;
        this.icerik = icerik;
        this.tarih = tarih;
    }
}
