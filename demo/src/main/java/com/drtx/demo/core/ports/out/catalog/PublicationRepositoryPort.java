package com.drtx.demo.core.ports.out.catalog;

import com.drtx.demo.core.model.catalog.Publication;

import java.util.List;
import java.util.Optional;

public interface PublicationRepositoryPort {
    Publication save(Publication publication);
    Publication update(Publication publication);
    void deleteById(Long id);
    Optional<Publication> findById(Long id);
    List<Publication> findAll();
    List<Publication> findByCategoryId(Long categoryId);
    List<Publication> findByUserId(Long userId);
    List<Publication> searchByKeyword(String keyword);
}
