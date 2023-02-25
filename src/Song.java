
import java.util.ArrayList;
public class Song {

    private String title;
    private String artist;

    private ArrayList<String>Listener = new ArrayList();

    public Song(String title, String artist){
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int howMany(ArrayList<String>Name){
        int newListener = 0;
        for(String i: Name){
            if (Listener.contains(i.toLowerCase())){
                continue;
            }
            else{
                Listener.add(i.toLowerCase());
                newListener += 1;
            }
        }
        return newListener;
    }





}
