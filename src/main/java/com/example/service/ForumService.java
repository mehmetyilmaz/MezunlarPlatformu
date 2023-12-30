package com.example.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.model.ForumMesaj;
import com.example.util.DatabaseUtil;

public class ForumService {

    public void addForumMesaj(ForumMesaj forumMesaj) {
        try (Connection connection = DatabaseUtil.getConnection()) {
            String query = "INSERT INTO forummesaj (kullaniciAdi, icerik) VALUES (?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, forumMesaj.getKullaniciAdi());
                preparedStatement.setString(2, forumMesaj.getIcerik());

                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error adding forum mesaj to database: " + e.getMessage(), e);
        }
    }

    public List<ForumMesaj> getAllForumMesajlar() {
        List<ForumMesaj> forumMesajlar = new ArrayList<>();
        try (Connection connection = DatabaseUtil.getConnection()) {
            String query = "SELECT * FROM forummesaj";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        ForumMesaj forumMesaj = new ForumMesaj();
                        forumMesaj.setId(resultSet.getInt("id"));
                        forumMesaj.setKullaniciAdi(resultSet.getString("kullaniciAdi"));
                        forumMesaj.setIcerik(resultSet.getString("icerik"));
                        forumMesaj.setTarih(resultSet.getTimestamp("tarih"));
                        forumMesajlar.add(forumMesaj);
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error getting all forum mesajlar: " + e.getMessage(), e);
        }
        return forumMesajlar;
    }
}
