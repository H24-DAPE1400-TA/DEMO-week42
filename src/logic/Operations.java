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
        List<Music> theBestMusic = new ArrayList<>();
        for (Music music : array){
            theBestMusic.add(music);
        }
        return theBestMusic;
    }

    @Override
    public boolean addToMusic(Music goodSong, List<Music>musicList) {
        if (goodSong.getArtist().isEmpty()) {
            System.out.println("Artist list is empty");
            return false;
        }
        return musicList.add(goodSong);
    }

    @Override
    public boolean deleteMusic(Music badSong,List<Music>musicList) {
        if (!musicList.contains(badSong)) {
            System.out.println("Song not found, can not be deleted");
            return false;
        };
        return musicList.remove(badSong);
    }

    @Override
    public boolean addBook(Books goodBook, List<Books>booksList) {
//we could add a bunch of logic here...
        if (goodBook.getIsbn().isEmpty()){
            System.out.println("Empty ISBN number");
            return false;
        }
        //checks if there are short
        return booksList.add(goodBook);
    }

    @Override
    public boolean deleteBook(Books badBook, List<Books>booksList) {
        if (!booksList.contains(badBook)){
            System.out.println("does not exists, can't be deleted");
            return false;
        }
        return booksList.remove(badBook);
    }

    @Override
    public boolean addMovie(Movies goodMovie,List<Movies>moviesList) {
        if (goodMovie.getDirector().isEmpty()){
            System.out.println("Not found director");
            return false;
        }
        return moviesList.add(goodMovie);
    }

    @Override
    public boolean deleteMovie(Movies badMovie, List<Movies>moviesList) {
        if (!moviesList.contains(badMovie)){
            System.out.println("This movie is not in the list");
            return false;
        }
        return moviesList.remove(badMovie);
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
