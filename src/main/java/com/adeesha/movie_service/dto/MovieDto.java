package com.adeesha.movie_service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class MovieDto {
    int id;
    String name;
    String genre;
    int year;
}
