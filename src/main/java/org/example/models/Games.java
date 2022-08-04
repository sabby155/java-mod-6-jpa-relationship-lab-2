package org.example.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Games {
    @Id
    @GeneratedValue
    private int id;

    private String title;
    private String genre;
    private String platform;
    private int price;

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @Temporal(TemporalType.DATE)
    private  Date created_at = new Date();

    @Temporal(TemporalType.DATE)
    private  Date updated_at;

    @OneToMany(mappedBy = "game")
    private List<Reviews> reviews = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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


    public List<Reviews> getReviews() {
        return reviews;
    }

    public void setReviews(Reviews review) {
        this.reviews.add(review);
    }
}
