import java.util.Objects;

/**
 * @author Andrej Reutow
 * created on 13.11.2023
 */
public class Song {
    private final int id;
    private final String author;
    private final String name;
    private final String album;
    private final String text;
    private final double duration;

    public Song(int id, String author, String name, String album, String text, double duration) {
        this.id = id;
        this.author = author;
        this.name = name;
        this.album = album;
        this.text = text;
        this.duration = duration;
    }

    public void playSong() {
        System.out.println(this.text);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Song song = (Song) object;

        if (id != song.id) return false;
        if (Double.compare(duration, song.duration) != 0) return false;
        if (!Objects.equals(author, song.author)) return false;
        if (!Objects.equals(name, song.name)) return false;
        if (!Objects.equals(album, song.album)) return false;
        return Objects.equals(text, song.text);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (album != null ? album.hashCode() : 0);
        result = 31 * result + (text != null ? text.hashCode() : 0);
        temp = Double.doubleToLongBits(duration);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", album='" + album + '\'' +
                ", text='" + text + '\'' +
                ", duration=" + duration +
                '}';
    }
}
