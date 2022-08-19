package practice.Learning.Day35.HomeWork;

public class Song {
    //create a class called Song
    //
    //        - data:
    //
    //            name, length, artist, genre
    //
    //        - constructor
    //
    //            - create a constructor that creates an Song object with the name, length, artist, and genre
    //
    //        - method:
    //
    //            toString()
    //                print all the Song information
    //
    //    Create a separate class to create and test the Song objects

    String name,artist,genre;
    double length;

    public Song(String name, String artist, String genre, double length) {
        this.name = name;
        this.artist = artist;
        this.genre = genre;
        this.length = length;
    }

    public String toString() {
        return "Song        :" +
                "\nName='" + name + '\'' +
                "\nArtist='" + artist + '\'' +
                "\nGenre='" + genre + '\'' +
                "\nLength=" + length
                ;
    }
}


