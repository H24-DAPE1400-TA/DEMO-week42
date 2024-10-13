package logic;

import Models.Books;
import Models.Movies;
import Models.Music;

import java.util.List;

public interface IOperations {
     boolean addToMusic(Music goodSong);
     boolean deleteMusic(Music badSong);
     boolean addBook(Books goodBook);
     boolean deleteBook(Books badBook);
     boolean addMovie(Movies goodMovie);
     boolean deleteMovie(Movies badMovie);

}
