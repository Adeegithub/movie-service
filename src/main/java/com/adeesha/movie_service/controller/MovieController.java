package com.adeesha.movie_service.controller;

import com.adeesha.movie_service.dto.MovieDto;
import com.adeesha.movie_service.service.MovieService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/movies")

public class MovieController {

    //Dependency Injection
    private MovieService movieService;

    //Build Add Movie REST API
    @PostMapping
    public ResponseEntity<MovieDto> addMovie(@RequestBody MovieDto movieDto){
        MovieDto addedMovie = movieService.addMovie(movieDto);
        return new ResponseEntity<>(addedMovie, HttpStatus.CREATED);
    }
}
