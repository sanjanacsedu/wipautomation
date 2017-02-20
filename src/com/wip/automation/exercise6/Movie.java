package com.wip.automation.exercise6;

import java.time.LocalDate;

public class Movie {
  // title, genre, release date & length of the movie

  String title;
  String genre;
  int movieLength;
  LocalDate releaseDate;

  public String getTitle() {
    return title;
  }

  public String getGenre() {
    return genre;
  }

  public int getMovieLength() {
    return movieLength;
  }

  public LocalDate getReleaseDate() {
    return releaseDate;
  }


  /**
   * @param title
   * @param genre
   * @param movieLength
   * @param releaseDate
   */
  public Movie(String title, String genre, int movieLength, LocalDate releaseDate) {
    super();
    this.title = title;
    this.genre = genre;
    this.movieLength = movieLength;
    this.releaseDate = releaseDate;
  }

  public void printDetail() {
    System.out.println("Title of the movie is: " + getTitle());
    System.out.println("Genre of the movie is: " + getGenre());
    System.out.println("Length of the movie is: " + getMovieLength()+"  minutes");
    System.out.println("Releasedate of the movie is: " + getReleaseDate());

  }

}
