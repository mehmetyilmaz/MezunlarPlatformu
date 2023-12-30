package com.example.dao;

import com.example.model.Comment;
import com.example.util.DatabaseUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CommentDAO {

    public List<Comment> getCommentsByPhotoId(int photoId) {
        List<Comment> comments = new ArrayList<>();
        try (Connection connection = DatabaseUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM comments WHERE photo_id = ?");
        ) {
            preparedStatement.setInt(1, photoId);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    Comment comment = new Comment();
                    comment.setId(resultSet.getInt("id"));
                    comment.setPhotoId(resultSet.getInt("photo_id"));
                    comment.setCommenterName(resultSet.getString("commenter_name"));
                    comment.setCommentText(resultSet.getString("comment_text"));
                    comment.setDate(resultSet.getDate("date"));
                    comment.setTime(resultSet.getTime("time"));
                    comments.add(comment);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return comments;
    }
}
