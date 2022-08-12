package day36_custom_classes.song;

public class Song {

    /*
        create a class called Song

        - data:

            name, length, artist, genre

        - constructor

            - create a constructor that creates an Song object with the name, length, artist, and genre

        - method:

            toString()
                print all the Song information

    Create a separate class to create and test the Song objects
     */

    String name;
    double length;
    String artist;
    String genre;

    public Song(String name, double length){
        this.name = name;
        this.length = length;
    }

    public Song(String name, double length, String artist, String genre){
        this.name = name;
        this.length = length;
        this.artist = artist;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
