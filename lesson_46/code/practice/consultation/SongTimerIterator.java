package practice.consultation;

import java.time.LocalTime;
import java.util.Random;

/**
 * @author Andrej Reutow
 * created on 13.11.2023
 */
public class SongTimerIterator implements PlayList {

    private Song[] playList;

    private final LocalTime END_TIME;

    public SongTimerIterator(LocalTime endTime) {
        END_TIME = endTime;
    }

    @Override
    public void setPlayList(Song[] playList) {
        this.playList = playList;
    }

    @Override
    public boolean hasNext() {
        return LocalTime.now().isBefore(END_TIME);
    }

    @Override
    public Song next() {
        Random random = new Random();
        int songIndex = random.nextInt(playList.length);
        return playList[songIndex];
    }
}
