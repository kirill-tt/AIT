package practice.album.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Photo implements Comparable<Photo> {
    //fields
    private int albumId;
    private int photoId;
    private String titles;
    private String url;
    private LocalDateTime date;
    // конструктор

    public Photo(int albumId, int photoId, String titles, String url, LocalDateTime date) {
        this.albumId = albumId;
        this.photoId = photoId;
        this.titles = titles;
        this.url = url;
        this.date = date;
    }

    public int getAlbumId() {
        return albumId;
    }



    public int getPhotoId() {
        return photoId;
    }



    public String getTitles() {
        return titles;
    }

    public void setTitles(String titles) {
        this.titles = titles;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LocalDateTime getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "albumId=" + albumId +
                ", photoId=" + photoId +
                ", titles='" + titles + '\'' +
                ", url='" + url + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Photo photo)) return false;
        return albumId == photo.albumId && photoId == photo.photoId;
    }

    @Override
    public int hashCode() {
        return Objects.hash( albumId, photoId );
    }

    @Override
    public int compareTo(Photo o) {
        // надо определить как сортировать объекты в массиве Photo по двум полям albumId i photoId
       int res = Integer.compare( albumId,o.albumId );



        return res!=0 ? res : Integer.compare( photoId,o.photoId );// тернарный оператор
        //if(res!=0){return res} else {return Integer.compare( photoId,o.photoId ) } // можно и так через if else
    }
}
