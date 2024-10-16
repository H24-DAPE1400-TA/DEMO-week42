package Models;

public class Music {
    /**
    @Param String music
    @Param String artist
    @Param String album
    @Param String[] genere
 **/
//getters and setters, constructur and tostring
    private String music;
    private String artist;
    private String album;
    private String genere;

    public Music(String music, String artist, String album, String genere) {
        this.music = music;
        this.artist = artist;
        this.album = album;
        this.genere = genere;
    }

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }
}
