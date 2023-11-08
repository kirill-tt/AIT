package practice.homework.dao;

import practice.homework.model.Documents;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;


public class ArchiveImpl implements Archive {
    static Comparator<Documents> comparator = (p1,p2) -> {
        int res = p1.getDocDate().compareTo( p2.getDocDate());
        return res != 0 ? res : Integer.compare( p1.getDocumentId(), p2.getDocumentId());// folderId fields
    };
    private Documents[] doc;
    private int size;
     public ArchiveImpl(int capacity) {doc = new Documents[capacity];}
    @Override
    public boolean addDocument(Documents documents) {


        if(documents == null || size == doc.length || getDocumentFromArchive( documents.getDocFolderId(), documents.getDocumentId())!= null){
            return false;
        }
        // ищем индекс, куда вставить
        int index = Arrays.binarySearch(doc, 0, size, documents,comparator);
        // обработка индекса
        index = index >= 0 ? index : -index - 1;
        // раздвигаем массив с индекса на 1 место вправо
        System.arraycopy(doc, index, doc, index + 1, size - index);
        doc[index] = documents;
        size++;
        return true;
    }

    @Override
    public boolean removeDocument(int docFolderId, int documentId) {

        for (int i = 0; i < size; i++) {
            if(doc[i].getDocFolderId() == docFolderId && doc[i].getDocumentId() == documentId){

                // надвигаем массив на найденную позицию i
                System.arraycopy( doc, i +1, doc, i, size -1 -i );

                doc[--size] = null;
                // После удаления, сортируем документы по docFolderId
                Arrays.sort(doc, 0, size, comparator);

                return true;

            }

        }
        return false;
    }

    @Override
    public boolean updateDocument(int docFolderId, int documentId, String url) {
       Documents   documents = getDocumentFromArchive( docFolderId, documentId );
        if(documents == null){
            return false;
        }
       documents.setUrl( url);
        return true;
    }

    @Override
    public Documents getDocumentFromArchive(int docFolderId, int documentId) {
       Documents pattern = new Documents( docFolderId, documentId, null, null ,null);
        for (int i = 0; i < size; i++) {
            if(pattern.equals( doc[i] )){
                return doc[i];
            }

        }
        return null;
     
    }

    @Override
    public Documents[] getAllDocumentFromArchive() {
        Documents[] allDocuments = new Documents[size];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (doc[i] != null) {
                allDocuments[j] = doc[i];
                j++;
            }
        }
        return Arrays.copyOf(allDocuments, j);
    }

   @Override
   public Documents[] getAllDocumentFromArchiveFolders(int docFolderId) {
        return findByPredicate(p-> docFolderId == p.getDocFolderId());// передаем предикат (условия для поиска)
    }
    private Documents[]  findByPredicate(Predicate<Documents> predicate){// возвращает массив найденных объектов
         Documents[] res = new Documents[size];// объявили массив избыточной длины
        int j = 0; // счетчик найденных document
        for (int i = 0; i < size; i++) {
            if (predicate.test( doc[i] )){
                res[j] = doc [i];
                j++;

            }

        }
        // заполнили массив, но в нем после j идут null
        return Arrays.copyOf( res, j );// вернули обрезанный массив, без элементов null
    }






    @Override
    public Documents[] getDocumentBetweenDate(LocalDate dateFrom, LocalDate dateTo) {
        Documents pattern = new Documents(0,Integer.MIN_VALUE, null,null, dateFrom.atStartOfDay()); // вводим объектную переменную
        int from = -Arrays.binarySearch(doc, 0, size, pattern, comparator) -1; // находим индекс начального document (левый край)
        //  from = from >= 0 ? from : -from - 1;
        pattern = new Documents(0, Integer.MAX_VALUE, null, null,  LocalDateTime.of( dateTo, LocalTime.MAX ) ); // находим правый край
        int to = -Arrays.binarySearch(doc, 0, size, pattern, comparator) - 1;
        // to = to >= 0 ? to : -to - 1;
        return Arrays.copyOfRange(doc, from, to); // Range - диапазон, создаем новый массив
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int quantity() {
        return size;
    }
}
