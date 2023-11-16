import java.util.Iterator;

/**
 * @author Andrej Reutow
 * created on 13.11.2023
 */
public interface PlayList extends Iterator<Song> {

    void setPlayList(Song[] playlist);
}
