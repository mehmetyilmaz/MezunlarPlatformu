package com.example.dao;

import com.example.model.Video;
import com.example.util.DatabaseUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VideoDAO {

    public List<Video> getAllVideos() {
        List<Video> videos = new ArrayList<>();
        try (Connection connection = DatabaseUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM videos");
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                Video video = new Video();
                video.setId(resultSet.getInt("id"));
                video.setTitle(resultSet.getString("title"));
                video.setDescription(resultSet.getString("description"));
                video.setThumbnailUrl(resultSet.getString("thumbnail_url"));
                video.setVideoUrl(resultSet.getString("video_url"));
                videos.add(video);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return videos;
    }

    public Video getVideoById(int videoId) {
        Video video = null;
        try (Connection connection = DatabaseUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM videos WHERE id = ?");
        ) {
            preparedStatement.setInt(1, videoId);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    video = new Video();
                    video.setId(resultSet.getInt("id"));
                    video.setTitle(resultSet.getString("title"));
                    video.setDescription(resultSet.getString("description"));
                    video.setThumbnailUrl(resultSet.getString("thumbnail_url"));
                    video.setVideoUrl(resultSet.getString("video_url"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return video;
    }
}
