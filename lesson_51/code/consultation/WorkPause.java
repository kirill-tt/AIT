package consultation;


import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.time.LocalTime;

public class WorkPause {
    private static final int INITIAL_WORK_LENGTH = 5 * 1_000;   // 5sec
    private static final int SHORT_BREAK = 1 * 1_000;   // 1 sec
    private static final int LONG_BREAK = 3 * 1_000;   // 3 sec

    public static void main(String[] args) {
        int workCounter = 0;
        LocalTime localTime = LocalTime.now().plusMinutes(1);

        startWork(workCounter, localTime);
    }

    private static void startWork(int workCounter, LocalTime localTime) {
        LocalTime timeNow = LocalTime.now();

        while (timeNow.isBefore(localTime)) {

            System.out.println("Start work!");
            sleep(INITIAL_WORK_LENGTH);

            if (++workCounter % 4 != 0) {
                System.out.println("Make a short break-" + workCounter + ", please!");
                sleep(SHORT_BREAK);
            } else {
                System.out.println("Make a long break, please!");
                sleep(LONG_BREAK);
            }

            timeNow = LocalTime.now();
        }
    }

    private static void sleep(int timeToSleep) {
        try {
            Thread.sleep(timeToSleep);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void alert(String fileName) {
        try (AudioInputStream player = AudioSystem.getAudioInputStream( WorkPause.class.getResource("/sound/" + fileName))) {
            Clip clip = AudioSystem.getClip();
            clip.open(player);
            clip.start();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}