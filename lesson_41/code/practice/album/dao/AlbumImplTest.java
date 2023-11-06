package practice.album.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.album.model.Photo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AlbumImplTest {
    Album album;
    LocalDateTime now = LocalDateTime.now();
    Photo[] ph;

    @BeforeEach
    void setUp() {
        album = new AlbumImpl( 7 );
        ph = new Photo[6];
        ph[0] = new Photo( 1, 1, "t1", "url1", now.minusDays( 2 ) );
        ph[1] = new Photo( 1, 2, "t2", "url2", now.minusDays( 3 ) );
        ph[2] = new Photo( 1, 3, "t3", "url3", now.minusDays( 2 ) );
        ph[3] = new Photo( 2, 1, "t1", "url4", now.minusDays( 7 ) );
        ph[4] = new Photo( 2, 2, "t2", "url5", now.minusDays( 7 ) );
        ph[5] = new Photo( 2, 3, "t3", "url6", now.minusDays( 7 ) );
        // не забыть положить в алибом методом addPhoto
        for (int i = 0; i < ph.length; i++) {
            album.addPhoto( ph[i] );

        }


    }


    @Test
    void addPhoto() {
        // Нельзя добавить null
        assertFalse( album.addPhoto( null ) );
        // нельзя добавить уже имеющиеся
        assertFalse( album.addPhoto( ph[1] ) );
        // проверить возможность добавления
        Photo photo = new Photo( 3, 1, "t", "url", now );
        assertTrue( album.addPhoto( photo ) );
        // проверить ожидаемое количество после добавления
        assertEquals( 7, album.size() );
        // Нельзя предвидение capacity
        photo = new Photo( 3, 2, "t", "url", now );
        assertFalse( album.addPhoto( photo ) );

    }

    @Test
    void removePhoto() {
        // удаление
        assertTrue( album.removePhoto( 3, 1 ) );// удалить фото ph2
        // удаление фото которого нет
        assertFalse( album.removePhoto( 5, 1 ) );// такого фото нет
        // проверка количества
        assertEquals( 5, album.size() );
        // Мы не смогли найти фотографию
        assertNull( album.getPhotoFromAlbum( 3, 1 ) );


    }

    @Test
    void updatePhoto() {
        assertTrue( album.updatePhoto( 1, 1, "newUrl" ) );
        assertEquals( "newUrl", album.getPhotoFromAlbum( 1, 1 ).getUrl() );

    }

    @Test
    void getPhotoFromAlbum() {
        assertEquals( ph[0], album.getPhotoFromAlbum( 1, 1 ) );// проверяем нахождение фото
        assertNull( album.getPhotoFromAlbum(4,2) );// ищем фото которого нет

    }

    @Test
    void getAllPhotoFromAlbum() {
        // этот метод возвращает массив фото
        Photo[] expected = {ph[3], ph[4], ph[5]};
        Photo[] actual = album.getAllPhotoFromAlbum( 2 ); // выбрали альбом album = 2
        Arrays.sort( actual );// сортируем массив
        assertArrayEquals( expected, actual );
    }

    @Test
    void getPhotoBetweenDate() {
        LocalDate ld = now.toLocalDate();// оставляем только дату
        Photo[] actual = album.getPhotoBetweenDate( ld.minusDays( 6), ld.minusDays( 1) );
        Arrays.sort( actual );// сортируем массив
        Photo[] expected = {ph[0],ph[1],ph[2]};
        assertArrayEquals( expected,actual );
    }

    @Test
    void size() {
        assertEquals( 6, album.size() );
    }
}