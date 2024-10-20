package com.adeesha.movie_service.service.impl;

import com.adeesha.movie_service.dto.MovieDto;
import com.adeesha.movie_service.entity.Movie;
import com.adeesha.movie_service.exception.ResourceNotFoundException;
import com.adeesha.movie_service.mapper.MovieMapper;
import com.adeesha.movie_service.repository.MovieRepository;
import com.adeesha.movie_service.service.MovieService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MovieServiceImpl implements MovieService {

    //Dependency Injection
    private MovieRepository movieRepository;
    @Override
    public MovieDto addMovie(MovieDto movieDto) {

        //Convert Movie DTO to movie JPA entity and Assigning it a variable called movie of Movie type.
        Movie movie = MovieMapper.mapToMovie(movieDto);

        //Save the above created Movie JPA Entity to DB
        Movie addedMovie = movieRepository.save(movie);

        //Returning the added movie as a MovieDto.
        return MovieMapper.mapToMovieDto(addedMovie);
    }

    @Override
    public MovieDto getMovieById(int id) {
        Movie movie = movieRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Movie does not exist with the id: " + id));

        //Convert movie JPA entity to MovieDTO and return the DTO
        return MovieMapper.mapToMovieDto(movie);
    }
}
