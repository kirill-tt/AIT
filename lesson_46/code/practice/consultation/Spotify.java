import java.time.LocalTime;

/**
 * @author Andrej Reutow
 * created on 13.11.2023
 */
public class Spotify {

    public static void main(String[] args) {
        Player player = new Player();
        player.addSong(new Song(1,
                "Ария",
                "Я свободен",
                "Какой то альбом 1",
                "я свобоооден",
                7.54)
        );
        player.addSong(new Song(2,
                "КиШ",
                "Леший",
                "Какой то альбом Киша",
                "текст этой самой песни",
                2.51)
        );
        player.addSong(new Song(3,
                "Eminem",
                "Lose Yourself",
                "8 Mile",
                "You only get one shot, do not miss your chance to blow",
                5.29)
        );

//        Iterator<Song> songIterator = player.iterator();
//        while (songIterator.hasNext()) {
//            songIterator.next().playSong();
////            Song currentSong = songIterator.next();
////            currentSong.playSong();
//        }
//        System.out.println();
//
//        for (Song currentSong : player) {
//            currentSong.playSong();
//        }
//
//        System.out.println();

//        songIterator = player.iterator();
//        while (true) {
//            songIterator.next().playSong();
//        }

        player.setIterator(new SongTimerIterator(LocalTime.now().plusSeconds(5)));
        long startTime = System.currentTimeMillis();
        for (Song currentSong : player) {
            currentSong.playSong();
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
