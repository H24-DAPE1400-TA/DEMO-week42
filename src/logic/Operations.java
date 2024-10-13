package logic;

import Models.Books;
import Models.Movies;
import Models.Music;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//interface is mainly for me so i remember what i want to add to the demo, you can ignore the file or just ask!
public class Operations implements IOperations  {
//Note: this will only load in memory
    public List<Movies> loadMovies(){
        throw new UnsupportedOperationException("Not implemented yet");
    }
    public List<Books> loadBooks(){
        List<Books>aBunchOfBooks = new ArrayList<Books>();
        aBunchOfBooks.add(new Books("Norse Mythology", "Neil Geilman", "97911585510688"));
        aBunchOfBooks.add(new Books("Java: How to programm early objects", "Deitel Paul", " 9781292223858"));
        aBunchOfBooks.add(new Books("Moderne applikasjonsutvikling med Java for web: tynne klienter og fete tjenere ", "Frode Eika Sandnes","825159177355"));
        return aBunchOfBooks;
    }
    public List<Music> loadMusic(Music[]array){
        //here we can demonstrate how we can use array to fill up lists
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public boolean addToMusic(Music goodSong) {
        return false;
    }

    @Override
    public boolean deleteMusic(Music badSong) {
        return false;
    }

    @Override
    public boolean addBook(Books goodBook) {
        return false;
    }

    @Override
    public boolean deleteBook(Books badBook) {
        return false;
    }

    @Override
    public boolean addMovie(Movies goodMovie) {
        return false;
    }

    @Override
    public boolean deleteMovie(Movies badMovie) {
        return false;
    }

    public static boolean emptyBookList(List<Book> list) {
        return list.isEmpty();
    }

    public static boolean emptyMovieList(List<Movies> list) {
        return list.isEmpty();
    }

    public static boolean emptyMusicList(List<Music> list) {
        return list.isEmpty();
    }
}
