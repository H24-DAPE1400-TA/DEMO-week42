import Models.Books;
import Models.Movies;
import Models.Music;
import logic.Operations;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Music aGoodSong, anotherGoodSong, theBestSong;
        //create a media search libary
        Operations operations = new Operations();
        //Load the different arrays
       // String [] platforms = {"Spotify", "Vinyl", "the ghost in the attic", "a dusty mp3 file"};
        System.out.println("We have theese generes:");
        String [] generes = {"punk","rap","Hip-pop","Bardcore", "Rock"};
        for (String platform : generes) {
            System.out.print(platform + " ");
        }
        List<Books> books = operations.loadBooks();
        for (Books book : books) {
            System.out.println(book.getBookName() + "| Author: " + book.getAuthor());
        }
        aGoodSong = new Music("We are the world", "usa for africa", "USA for Africa",generes[2]);
        anotherGoodSong = new Music("Redunant", "Green day","Nimrod", generes[0]);
        theBestSong = new Music("Rockin' chair", "Oasis", "Whats the story, morning glory", generes[3]);
        Music[] musicarray = {aGoodSong, anotherGoodSong, theBestSong};
        //check if they are empty
        List<Music>mySongs = operations.loadMusic(musicarray);
        for (Music song : mySongs) System.out.println(song.getArtist() + ", " + song.getMusic());
        boolean okMusic = operations.addToMusic(new Music("Babe i'm Gonna Leave You", "Led Zeppelin", "Led Zeppelin", generes[4] ), mySongs);
        if (okMusic) {
            System.out.println("OK WITH Music");
            for (Music m : mySongs) System.out.println(m.getMusic() + " " + m.getArtist());
        }
        //add a book
        //List <Books> booksList = operations.loadBooks();
        if (operations.addBook(new Books("Partiet - en innsideberetning om Arbeiderpartiets fall", "Steinar Suvatne", "9788205599222"), books)){ //returns true, then we can have prints based on that
            System.out.println("Book added!");
            for (Books b: books) System.out.println(b.getBookName() + " " + b.getAuthor() + " " + b.getIsbn());
        } else {
            System.out.println("NO THE BOOK was not added");
        }


        //add a movie
        List<Movies> moviesList = new ArrayList<>();

        System.out.println("Is the list empty? " + (moviesList.isEmpty() ? "yes" : "no")); //Etermary if for fancy printing here, dont worry about what it is

        operations.addMovie(new Movies("Godfather", "Francis Ford Corpola", "173", "Drama"), moviesList);
        operations.addMovie(new Movies("The shining", "Stanley Cubrick", "173", "Thriller"), moviesList);

        moviesList.forEach(m -> {
            System.out.print(m.getGeners() + ", " + m.getMovieName() + "\n");
        });
        //add a tune
    }
}
