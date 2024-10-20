package com.adeesha.movie_service.controller;

import com.adeesha.movie_service.dto.MovieDto;
import com.adeesha.movie_service.service.MovieService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    //Build getMovieById Rest API
    @GetMapping("{id}")
    public ResponseEntity<MovieDto> getMovieById(@PathVariable("id") int movieId) {
        MovieDto searchedMovie = movieService.getMovieById(movieId);
        return ResponseEntity.ok(searchedMovie);
    }

    //Build getAllMovies Rest API
    @GetMapping
    public ResponseEntity<List<MovieDto>> getAllMovies(){
        List<MovieDto> allMovies = movieService.getAllMovies();
        return ResponseEntity.ok(allMovies);
    }

    //Build updateMovie Rest API.
    @PutMapping("{id}")
    public ResponseEntity<MovieDto> updateMovie(@PathVariable("id") int movieId,
                                                @RequestBody MovieDto updatedMovie){
        MovieDto movieDto = movieService.updateMovie(movieId,updatedMovie);
        return ResponseEntity.ok(movieDto);
    }

    //Build the Delete Movie Rest API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteMovie(@PathVariable("id") int movieId){
        movieService.deleteMovie(movieId);
        return ResponseEntity.ok("Movie Deleted with the Id: " + movieId);
    }

    @GetMapping("/romance")
    public ResponseEntity<List<MovieDto>> getRomanceMovies(){
        List<MovieDto> romanceMovies = movieService.getRomanceMovies();
        return ResponseEntity.ok(romanceMovies);
    }

}
