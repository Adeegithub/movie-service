package com.adeesha.movie_service.service;

import com.adeesha.movie_service.dto.MovieDto;

public interface MovieService {
    MovieDto addMovie(MovieDto movieDto);

    MovieDto getMovieById(int id);
}
