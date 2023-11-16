import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author Andrej Reutow
 * created on 13.11.2023
 */
public class Player implements Iterable<Song> {

    private Song[] playList;
    private Iterator<Song> iterator;

    public Player() {
        playList = new Song[0];
        iterator = new Iterator<>() {

            private int currentSong;

            @Override
            public boolean hasNext() {
                return currentSong < playList.length;
            }

            @Override
            public Song next() {
                if (!hasNext()) {
                    throw new NoSuchElementException("No more songs");
                }
                return playList[currentSong++];
            }

        };
    }

    public void addSong(Song songToAdd) {
        playList = Arrays.copyOf(playList, playList.length + 1);
        playList[playList.length - 1] = songToAdd;
    }

    public void setIterator(PlayList iterator) {
        iterator.setPlayList(this.playList);
        if (iterator instanceof Iterator) {
            this.iterator = (Iterator<Song>) iterator;
        }
    }


    //    public void play() {
//        for (int i = 0; i < playList.length; i++) {
//            playList[i].playSong();
//        }
//    }

    @Override
    public Iterator<Song> iterator() {
        return this.iterator;
    }
}
