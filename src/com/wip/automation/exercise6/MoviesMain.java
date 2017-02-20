package com.wip.automation.exercise6;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class MoviesMain {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    // Movie obj = new Movie(title, genre, movieLength, releaseDate)

    Movie[] movies = new Movie[5];
    movies[0] = new Movie("Movie1", "Action", 15, LocalDate.of(2010, 01, 14));
    movies[1] = new Movie("Movie2", "Drama", 100, LocalDate.of(2011, 02, 16));
    movies[2] = new Movie("Movie3", "Action", 10, LocalDate.of(2009, 03, 22));
    movies[3] = new Movie("Movie4", "Action", 100, LocalDate.of(2010, 02, 12));
    movies[4] = new Movie("Movie5", "Comedy", 2, LocalDate.of(2008, 02, 02));

    int moviesCount = movies.length;
    for (int i = 0; i < moviesCount; i++) {
      movies[i].printDetail();
    }

    int totaltime = totaltime(movies);
    System.out.println("how long it takes to watch all movies: " + totaltime);


    String latestMovie = latest(movies);
    System.out.println("latest movie (using release date): " + latestMovie);

    String oldMoview = oldest(movies);
    System.out.println("oldest movie (using release date): " + oldMoview);

    int count = totalgenre(movies, "Action");
    System.out.println("count movies which are given genre: " + count);

  }

  private static String oldest(Movie[] movies) {
    // TODO Auto-generated method stub

    LocalDate[] arrayOfDates = new LocalDate[movies.length];
    for (int i = 0; i < movies.length; i++) {
      arrayOfDates[i] = movies[i].getReleaseDate();
    }

    Arrays.sort(arrayOfDates);
    for (int i = 0; i < movies.length; i++)
      if (movies[i].getReleaseDate().equals(arrayOfDates[0]))
        return movies[i].getTitle();

    return null;

  }

  private static String latest(Movie[] movies) {
    // TODO Auto-generated method stub
    LocalDate[] arrayOfDates = new LocalDate[movies.length];
    for (int i = 0; i < movies.length; i++) {
      arrayOfDates[i] = movies[i].getReleaseDate();
    }

    Arrays.sort(arrayOfDates);
    for (int i = 0; i < movies.length; i++)
      if (movies[i].getReleaseDate().equals(arrayOfDates[movies.length - 1]))
        return movies[i].getTitle();

    return null;
  }

  private static int totalgenre(Movie[] movies, String genre) {
    // TODO Auto-generated method stub
    int count = 0;
    int moviesCount = movies.length;
    for (int i = 0; i < moviesCount; i++)
      if (movies[i].getGenre().equals(genre))
        count++;

    return count;
  }

  private static int totaltime(Movie[] movies) {
    // TODO Auto-generated method stub
    int sum = 0;
    int moviesCount = movies.length;
    for (int i = 0; i < moviesCount; i++)
      sum += movies[i].movieLength;

    return sum;
  }


}
