package com.drtx.demo.core.ports.out.rating;

import com.drtx.demo.core.model.rating.Rating;

import java.util.List;
import java.util.Optional;

public interface RatingRepositoryPort {
    Rating save(Rating rating);
    Optional<Rating> findById(Long id);
    List<Rating> findByUserId(Long userId);
    List<Rating> findByPublicationId(Long publicationId);
    double calculateAverageRatingForUser(Long userId);
    double calculateAverageRatingForPublication(Long publicationId);
}
