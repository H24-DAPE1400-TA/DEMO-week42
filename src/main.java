import Models.Books;
import Models.Music;
import logic.Operations;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Music aGoodSong, anotherGoodSong, theBestSong;
        //create a media search libary
        Operations operations = new Operations();
        //Load the different arrays
        String [] platforms = {"Spotify", "Vinyl", "the ghost in the attic", "a dusty mp3 file"};
        System.out.println("We have theese platforms:");
        for (String platform : platforms) {
            System.out.print(platform + " ");
        }
        List<Books> songs = operations.loadBooks();
        for (Books book : songs) {
            System.out.println(book.getBookName() + "| Author: " + book.getAuthor());
        }
        //aGoodSong = new Music("We are the world", "usa for africa", platforms);
        //anotherGoodSong = new Music("Redunant", "Green day","Nimrod", platforms);
        //theBestSong = new Music("Rockin' chair", "Oasis", "Whats the story, morning glory", platforms);
        Music[] musicarray = {};
        //check if they are empty
        //add a book
        //add a movie
        //add a tune
    }
}
