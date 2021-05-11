
/**
 * Write a description of class Album here.
 *
 * Jena Martin
 * 5/7/2021
 */
public class Album
{
    private String title;
    private String artist;
    private int numTracks;
    private double playTime;
    
    public Album(String title, String artist, int numTracks, double playTime) {
        this.title = title;
        this.artist = artist;
        this.numTracks = numTracks;
        this.playTime = playTime;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getArtist() {
        return artist;
    }
   
    public int getNumTracks() {
        return numTracks;
    }
    
    public double getPlayTime() {
        return playTime;
    }
    
    public String toString() {
        String result = "Title: " + title + "\n" + "Artist: " + artist + "\n" 
                        + "Number of tracks: " + numTracks + "\n" 
                        + "Album's total play time: " + playTime + " minutes";
        return result;
    }
}