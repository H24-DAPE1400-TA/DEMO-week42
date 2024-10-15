package logic;

import Models.Books;
import Models.Movies;
import Models.Music;

import java.util.List;

public interface IOperations {
     boolean addToMusic(Music goodSong, List<Music> musicList);
     boolean deleteMusic(Music badSong, List<Music>musicList);
     boolean addBook(Books goodBook, List<Books>booksList);
     boolean deleteBook(Books badBook, List<Books>booksList);
     boolean addMovie(Movies goodMovie, List<Movies>moviesList);
     boolean deleteMovie(Movies badMovie, List<Movies>moviesList);
}
