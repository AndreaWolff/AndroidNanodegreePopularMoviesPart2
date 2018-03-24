package com.andrea.popularmoviespart2.features.common.repository;


import com.andrea.popularmoviespart2.features.common.domain.Movie;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

class MoviesDto {

    @SerializedName("results") private List<MovieDto> movies;

    List<Movie> toMovies() {
        List<Movie>  result = new ArrayList<>();

        for (MovieDto movieDto : movies) {
            result.add(movieDto.toMovie());
        }

        return result;
    }
}
