/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.movie;

public class Movie {
    private String title;
    private String genre;
    private String leadActor;
    private String director;
    private int releaseYear;
    private double rating;
    private String review;
    public Movie(String title, String genre, String lead_Actor, String director, int Release_Year, double rating) {
        this.title = title;
        this.genre = genre;
        this.leadActor = lead_Actor;
        this.director = director;
        this.releaseYear = Release_Year;
        this.rating = rating;
        if (rating < 5) {
            this.review = "Not Good";
        } else {
            this.review = "Good";
        }
    }
    public void Display_Details() {
        System.out.println("Title = " + title);
        System.out.println("Genre = " + genre);
        System.out.println("Lead Actor = " + leadActor);
        System.out.println("Director = " + director);
        System.out.println("Release Year = " + releaseYear);
        System.out.println("Rating = " + rating);
        System.out.println("Review = " + review);
    }
    public static void main(String[] args) {
        Movie m1 = new Movie(" 3 Idiots ", "Comedy Drama", "Amir Khan", "Rajkumar Hirani", 2009, 8.4);
        Movie m2 = new Movie("Din the day", "Action", "Anonto Jalil", "Morteza Atashzamzam", 2022, 3);
        System.out.println("1st Movie :- ");
        m1.Display_Details();
        System.out.println("\n2nd Movie :- ");
        m2.Display_Details();
    }
}
