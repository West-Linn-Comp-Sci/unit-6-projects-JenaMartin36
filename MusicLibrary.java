
/**
 * Write a description of class MusicLibrary here.
 *
 * @Jena Martin
 * 5/7/2021
 */
public class MusicLibrary
{
     private Album[] library;
     private double totalTime;
     private int totalTracks;
     private int openIndex;
     
     public MusicLibrary() {
        library = new Album[10];
        totalTime = 0;
        totalTracks = 0;
        openIndex = 0;
     }
     
     public void doubleSize() {
         Album[] newLibrary = new Album[library.length * 2];
         for (int i = 0; i < library.length; i++) {
             newLibrary[i] = library[i];
         }
         
         library = newLibrary;
     }
     
     public void add(Album album) {
         if (openIndex == -1) {
             System.out.println("Your music library is full");
         }
         else {
             library[openIndex] = album;
             totalTracks += album.getNumTracks();
             totalTime += album.getPlayTime();
             int n;
             for (n = 0; n < library.length; n++) {
                 if (library[n] == null) {
                     openIndex = n;
                     break;
                 }
             }
             
             if (n == library.length) {
                 openIndex = -1;
             }
         }
     }
        
     public void remove (int index) {
         totalTracks -= library[index].getNumTracks();
         totalTime -= library[index].getPlayTime();
         library[index] = null;
     }
     
     public String toString() {
         String result = "Number of tracks: " + totalTracks + "\n"
                        + "Total play time: " + totalTime + "\n"
                        + "Size of Library: " + library.length + "\n" + "\n"
                        + "Albums " + "\n\n";
         for (int i = 0; i < library.length; i++) {
             if (library[i] != null) {
                 result += library[i] + "\n\n";
             }
         }
         return result;
     }
     
     public String searchTitle (String title) {
         for (int i = 0; i < library.length; i++) {
             if (library[i].getTitle().equals(title)) {
                 return "The album is Album number " + i;
             }
         }
         return "no Album found";
     }
     
     public String searchArtist (String artist) {
         for (int i = 0; i < library.length; i++) {
             if (library[i].getArtist().equals(artist)) {
                 return "the album is Album number " + i;
             }
         }
         return "no album found";
     }
     
     public String selectionSort(){
         for(int i = 0; i < library.length; i++){
             int spot = i;
             Album low = library[i];
             
             for(int j = i + 1; j < library.length; j++){
                 if(library[j].getTitle().compareTo(low.getTitle()) < 0) {
                     spot = j;
                     low = library[j];
                }
             }

             library[spot] = library[i];
             library[i] = low;
             
         }
         return "done";
     }
      
     public String insertionSort(){
          for(int i = 1; i < library.length; i++){
              Album key = library[i];
              int position = i;

              while (position >= 0 && library[position - 1].getArtist().compareTo(key.getArtist()) < 0){
                  library[position] = library[position - 1];
                  position--;
              }
              
              library[position] = key;
              
          }
          return "did it!";
     }
     
     public int binarySearchTitle(String title){
         int left = 0; 
         int right = library.length - 1;
         while (left <= right) {
             int middle = left + (right - left) / 2;
  
             int res = title.compareTo(library[middle].getTitle());
  
             if (res == 0){
                return middle;
             }
  
             if (res > 0) {
                left = middle + 1;
             }
             else{
                right = middle - 1;
             }
         }
  
         return -1;
     }
    
     public int binarySearchArtist(String artist){
         int left = 0; 
         int right = library.length - 1;
         while (left <= right) {
             int middle = left + (right - left) / 2;
  
             int res = artist.compareTo(library[middle].getArtist());
  
             if (res == 0){
                return middle;
             }
  
             if (res > 0) {
                left = middle + 1;
             }
             else{
                right = middle - 1;
             }
         }
  
         return -1;
     }

}
