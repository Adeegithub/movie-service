package com.adeesha.movie_service.service;

import com.adeesha.movie_service.dto.MovieDto;
import java.util.List;

public interface MovieService {
    MovieDto addMovie(MovieDto movieDto);

    MovieDto getMovieById(int id);

    List<MovieDto> getAllMovies();
}
