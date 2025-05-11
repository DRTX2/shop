package com.drtx.demo.core.ports.in.rating;

import com.drtx.demo.core.model.rating.Rating;

import java.util.List;

public interface RatingServicePort {
    Rating createRating(Rating rating);
    List<Rating> findRatingsByUser(Long userId);
    List<Rating> findRatingsByPublication(Long publicationId);
    double calculateAverageRatingForUser(Long userId);// ¿Qué tan bien calificado es el usuario?
    double calculateAverageRatingForPublication(Long publicationId);// ¿Qué tan bien calificada fue una publicación específica?
}
