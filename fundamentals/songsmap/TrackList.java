import java.util.HashMap;
import java.util.Set;
public class TrackList {

  public static void main(String[] args) {
    HashMap<String, String> playList = new HashMap <String, String>();
    playList.put("Adele", "Hello");
    playList.put("Eminem", "rapgod");
    playList.put("50Cent", "in da club");
    playList.put("Hello", "hi kefak");
    Set<String> artists = playList.keySet();
      for (String artist: artists) {
        System.out.println(artist + " " + playList.get(artist));
    }
}
}
