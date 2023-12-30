package com.example.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.model.ForumMesaj;
import com.example.model.Kisi;
import com.example.util.DatabaseUtil;

public class KisiService {
    
    // Diğer metotlar burada...

    public void addKisiWithImageUrl(Kisi kisi) {
        try (Connection connection = DatabaseUtil.getConnection()) {
            String query = "INSERT INTO kisi (ad, soyad, cinsiyet, hobiler, sehir, kullanici_adi, sifre, resim_url, yetki_seviyesi) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, kisi.getAd());
                preparedStatement.setString(2, kisi.getSoyad());
                preparedStatement.setString(3, kisi.getCinsiyet());
                preparedStatement.setString(4, kisi.getHobiler());
                preparedStatement.setString(5, kisi.getSehir());
                preparedStatement.setString(6, kisi.getKullaniciAdi());
                preparedStatement.setString(7, kisi.getSifre());
                preparedStatement.setString(8, kisi.getResimUrl());
                preparedStatement.setInt(9, kisi.getYetkiSeviyesi());

                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error adding kisi to database: " + e.getMessage(), e);
        }
    }

    // Diğer metotlar burada...

    public boolean kisiGiris(String kullaniciAdi, String sifre) {

    	 Kisi kisi = null;
        try (Connection connection = DatabaseUtil.getConnection()) {
            String query = "SELECT * FROM kisi where kullanici_adi = ? and sifre = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            	preparedStatement.setString(1, kullaniciAdi);
            	preparedStatement.setString(2, sifre);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                	 if (resultSet.next()) {
                		 kisi = new Kisi(
                		 resultSet.getString("ad"),
                         resultSet.getString("soyad"),
                         resultSet.getString("cinsiyet"),
                         resultSet.getString("hobiler"),
                         resultSet.getString("sehir"),
                         resultSet.getString("kullanici_adi"),
                         resultSet.getString("sifre"),
                         resultSet.getString("resim_url"),
                         resultSet.getInt("yetki_seviyesi"));
                		 return true;
                    }
                	 else {
                		 return false;
                	 }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error getting all forum mesajlar: " + e.getMessage(), e);
        }
    }
    
    public List<Kisi> getAllKisiler() {
        List<Kisi> kisiler = new ArrayList<>();
        try (Connection connection = DatabaseUtil.getConnection()) {
            String query = "SELECT * FROM kisi";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                    	Kisi kisi = new Kisi();
                    	kisi.setAd(resultSet.getString("ad")); 
                    	kisi.setSoyad(resultSet.getString("soyad")); 
                    	kisi.setCinsiyet(resultSet.getString("cinsiyet")); 
                    	kisi.setHobiler(resultSet.getString("hobiler")); 
                    	kisi.setSehir(resultSet.getString("sehir")); 
                    	kisi.setResimUrl(resultSet.getString("resim_url")); 
                        kisiler.add(kisi);
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error getting all forum mesajlar: " + e.getMessage(), e);
        }
        return kisiler;
    }
}
