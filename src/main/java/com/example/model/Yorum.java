package com.example.model;

import java.util.Date;

public class Yorum {
    private int id;
    private int videoId;
    private String yorumcuIsmi;
    private String yorum;
    private Date date;
    private Date time;

    // Parametresiz constructor
    public Yorum() {
    }

    // Parametreli constructor
    public Yorum(int id, int videoId, String yorumcuIsmi, String yorum, Date date, Date time) {
        this.id = id;
        this.videoId = videoId;
        this.yorumcuIsmi = yorumcuIsmi;
        this.yorum = yorum;
        this.date = date;
        this.time = time;
    }

    // Getter ve Setter metotları
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }

    public String getYorumcuIsmi() {
        return yorumcuIsmi;
    }

    public void setYorumcuIsmi(String yorumcuIsmi) {
        this.yorumcuIsmi = yorumcuIsmi;
    }

    public String getYorum() {
        return yorum;
    }

    public void setYorum(String yorum) {
        this.yorum = yorum;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
