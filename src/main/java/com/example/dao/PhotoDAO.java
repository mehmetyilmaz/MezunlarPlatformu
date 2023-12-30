package com.example.dao;

import com.example.model.Photo;
import com.example.util.DatabaseUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PhotoDAO {

    public List<Photo> getAllPhotos() {
        List<Photo> photos = new ArrayList<>();
        try (Connection connection = DatabaseUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM photos");
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                Photo photo = new Photo();
                photo.setId(resultSet.getInt("id"));
                photo.setThumbnailUrl(resultSet.getString("thumbnail_url"));
                photo.setLargeUrl(resultSet.getString("large_url"));
                photo.setDescription(resultSet.getString("description"));
                photos.add(photo);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return photos;
    }
}
