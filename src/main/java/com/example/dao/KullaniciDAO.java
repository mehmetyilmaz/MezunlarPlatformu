
package com.example.dao;

import com.example.model.Kullanici;
import com.example.util.DatabaseUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class KullaniciDAO {

    public List<Kullanici> getAllKullanicilar() {
        List<Kullanici> kullanicilar = new ArrayList<>();
        try (Connection connection = DatabaseUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM kullanicilar");
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                Kullanici kullanici = new Kullanici();
                kullanici.setId(resultSet.getInt("id"));
                kullanici.setAd(resultSet.getString("ad"));
                kullanici.setSoyad(resultSet.getString("soyad"));
                kullanici.setAdres(resultSet.getString("adres"));
                kullanici.setTelefon(resultSet.getString("telefon"));
                kullanici.setSimdikiOkul(resultSet.getString("simdiki_okul"));
                kullanici.setIs(resultSet.getString("is"));
                kullanici.setePosta(resultSet.getString("e_posta"));
                kullanici.setWebAdresi(resultSet.getString("web_adresi"));
                kullanici.setFacebookId(resultSet.getString("facebook_id"));
                kullanici.setTwitter(resultSet.getString("twitter"));
                kullanicilar.add(kullanici);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return kullanicilar;
    }
}
