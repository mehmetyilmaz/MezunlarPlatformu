
package com.example.service;

import com.example.dao.KullaniciDAO;
import com.example.model.Kullanici;

import java.util.List;

public class KullaniciService {

    private KullaniciDAO kullaniciDAO;

    public KullaniciService() {
        this.kullaniciDAO = new KullaniciDAO();
    }

    public List<Kullanici> getAllKullanicilar() {
        return kullaniciDAO.getAllKullanicilar();
    }
}
