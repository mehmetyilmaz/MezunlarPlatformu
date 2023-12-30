package com.example.dao;

import com.example.model.Yorum;
import com.example.util.DatabaseUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class YorumDAO {

    public List<Yorum> getYorumlarByVideoId(int videoId) {
        List<Yorum> yorumlar = new ArrayList<>();
        try (Connection connection = DatabaseUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM yorumlar WHERE video_id = ?")) {
            
            preparedStatement.setInt(1, videoId);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    Yorum yorum = new Yorum();
                    yorum.setId(resultSet.getInt("id"));
                    yorum.setVideoId(resultSet.getInt("video_id"));
                    yorum.setYorumcuIsmi(resultSet.getString("yorumcu_ismi"));
                    yorum.setYorum(resultSet.getString("yorum"));
                    yorum.setDate(resultSet.getDate("date"));
                    yorum.setTime(resultSet.getTime("time"));
                    yorumlar.add(yorum);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return yorumlar;
    }

    public void addYorum(Yorum yorum) {
        try (Connection connection = DatabaseUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO yorumlar (video_id, yorumcu_ismi, yorum, date, time) VALUES (?, ?, ?, ?, ?)")) {
            
            preparedStatement.setInt(1, yorum.getVideoId());
            preparedStatement.setString(2, yorum.getYorumcuIsmi());
            preparedStatement.setString(3, yorum.getYorum());
            preparedStatement.setDate(4, new java.sql.Date(yorum.getDate().getTime()));
            preparedStatement.setTime(5, new java.sql.Time(yorum.getTime().getTime()));

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
