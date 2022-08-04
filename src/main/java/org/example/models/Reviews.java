package org.example.models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Reviews {
    @Id
    @GeneratedValue
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public Games getGame() {
        return game;
    }

    public void setGame(Games game) {
        this.game = game;
    }

    private int score;
    private String comment;

    @Temporal(TemporalType.DATE)
    private  Date created_at = new Date();

    @Temporal(TemporalType.DATE)
    private  Date updated_at;

    @ManyToOne
    private Games game;
}
