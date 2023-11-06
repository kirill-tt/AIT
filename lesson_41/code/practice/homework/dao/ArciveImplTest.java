package practice.homework.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.homework.model.Documents;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
class ArchiveImplTest {
Archive archive;
    LocalDateTime now = LocalDateTime.now();
    Documents[] doc;

    @BeforeEach
    void setUp() {
        archive = new ArchiveImpl( 7 );
        doc = new Documents[6];
        doc[0] = new Documents(1,1,"a","url1", now.minusDays( 2 )  );
        doc[1] = new Documents(1,2,"b","url2", now.minusDays( 3 )  );
        doc[2] = new Documents(1,3,"c","url3", now.minusDays( 5 )  );
        doc[3] = new Documents(2,1,"d","url4", now.minusDays( 7 )  );
        doc[4] = new Documents(2,2,"e","url5", now.minusDays( 7 )  );
        doc[5] = new Documents(2,3,"f","url6", now.minusDays( 7 )  );

        for (int i = 0; i < doc.length; i++) {
            archive.addDocument( doc[i] );

        }

    }

    @Test
    void addDocumentTest() {
        // Нельзя добавить null
        assertFalse( archive.addDocument( null ) );
        // нельзя добавить уже имеющиеся
        assertFalse(archive.addDocument( doc[1] ) );
        // проверить возможность добавления
        Documents documents = new Documents( 3, 1, "t", "g",now );
        assertTrue( archive.addDocument( documents ) );
        // проверить ожидаемое количество после добавления
        assertEquals( 7, archive.size());
        // Нельзя превысить capacity
        documents= new Documents( 3, 2, "t","g", now );
        assertFalse( archive.addDocument( documents ) );

    }

    @Test
    void removeDocumentTest() {
        // удаление
        assertTrue( archive.removeDocument( 1, 3 ) );// удалить document doc[2]
        // удаление document которого нет
        assertFalse( archive.removeDocument( 5, 1 ) );// такого doc нет
        // проверка количества
        assertEquals( 5, archive.size() );
        // Мы не смогли найти document
        assertNull( archive.getDocumentFromArchive( 1, 3 ) );


    }

    @Test
    void updateDocumentTest() {
assertTrue( archive.updateDocument( 1,2,"newUrl" ) );
assertEquals("newUrl", archive.getDocumentFromArchive( 1,2 ).getUrl() );
    }

    @Test
    void getDocumentFromArchiveTest() {
        assertEquals( doc[0],archive.getDocumentFromArchive( 1,1 ));// проверяем нахождение
    assertNull( archive.getDocumentFromArchive( 1,4 ) );// ищем несуществующее
    }

    @Test
    void getAllDocumentFromArchiveTest() {
        Documents[] expected = {doc[3], doc[4], doc[5] };// это documents из docFoldersId = 2
    Documents[] actual = archive.getAllDocumentFromArchive( 2 );// выбрали document  из docFoldersId = 2
        Arrays.sort( actual ); // сортируем массив
        assertArrayEquals( expected, actual);



    }

    @Test
    void getDocumentBetweenDateTest() {
        LocalDate ld = now.toLocalDate(); // оставляем только дату, убираем время
        Documents[] actual = archive.getDocumentBetweenDate( ld.minusDays( 6), ld.minusDays( 1 ) );
        Arrays.sort(actual); // сортируем массив
        Documents[] expected ={doc[0], doc[1], doc[2]};
        assertArrayEquals(  expected, actual );
    }

    @Test
    void sizeTest() {
    }
}