package org.example;

import org.example.models.Games;
import org.example.models.Reviews;

import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Games game = new Games();
        Reviews review = new Reviews();
        Reviews anotherReview = new Reviews();

        game.setReviews(review);
        game.setReviews(anotherReview);

        game.setTitle("Stray");
        game.setGenre("Explore");
        game.setPlatform("PC");
        game.setUpdated_at(new Date());
        game.setPrice(30);

        review.setGame(game);
        review.setScore(10);
        review.setComment("GG");
        review.setUpdated_at(new Date());

        anotherReview.setGame(game);
        anotherReview.setScore(2);
        anotherReview.setComment("Bad Game!");
        anotherReview.setUpdated_at(new Date());


        // create EntityManager
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("example");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // access transaction object
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        entityManager.persist(game);
        entityManager.persist(review);
        entityManager.persist(anotherReview);

        transaction.commit();

        // close entity manager
        entityManager.close();
        entityManagerFactory.close();
    }
}