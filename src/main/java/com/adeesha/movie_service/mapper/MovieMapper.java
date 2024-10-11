package com.adeesha.movie_service.mapper;

import com.adeesha.movie_service.dto.MovieDto;
import com.adeesha.movie_service.entity.Movie;

public class MovieMapper {
    public static MovieDto mapToMovieDto(Movie movie){
        return new MovieDto(
                movie.getId(),
                movie.getName(),
                movie.getGenre(),
                movie.getYear()
        );
    }

    public static Movie mapToMovie(MovieDto movieDto){
        return new Movie(
                movieDto.getId(),
                movieDto.getName(),
                movieDto.getGenre(),
                movieDto.getYear()
        );
    }
}
