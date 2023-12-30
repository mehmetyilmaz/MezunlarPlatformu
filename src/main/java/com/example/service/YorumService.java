package com.example.service;
import com.example.dao.YorumDAO;
import com.example.model.Yorum;
import java.util.List;
public class YorumService {

    private YorumDAO yorumDAO;

    public YorumService() {
        this.yorumDAO = new YorumDAO();
    }

    public List<Yorum> getYorumlarByVideoId(int videoId) {
        return yorumDAO.getYorumlarByVideoId(videoId);
    }

    public void addYorum(Yorum yorum) {
        yorumDAO.addYorum(yorum);
    }
}
