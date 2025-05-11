package com.drtx.demo.core.ports.in.catalog;

import com.drtx.demo.core.model.catalog.Publication;

import java.util.List;

public interface PublicationServicePort {
    Publication createPublication(Publication publication);
    void editPublication(Publication publication);
    void deletePublication(Long id);
    Publication findPublicationById(Long id);
    List<Publication> findAllPublications(); // listado general
    List<Publication> findPublicationsByCategory(Long categoryId);
    List<Publication> findPublicationsByUser(Long userId);
    List<Publication> searchPublications(String keyword);
}
