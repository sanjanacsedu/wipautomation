package com.wip.automation.exercise6;

import java.time.LocalDate;

public class MoviesMain {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    // Movie obj = new Movie(title, genre, movieLength, releaseDate)

    Movie[] movies = new Movie[2];
    movies[0] = new Movie("The Matrix", "Action", 10, LocalDate.of(2010, 01, 14));
    movies[1] = new Movie("Titanic", "Drama", 100, LocalDate.of(2010, 01, 14));

    int moviesCount = movies.length;
    for (int i = 0; i < moviesCount; i++)
      movies[i].printDetail();


  }


}
