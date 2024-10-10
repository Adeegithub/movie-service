package com.adeesha.movie_service.repository;

import com.adeesha.movie_service.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
    //This is where it enables the CRUD Operations
}