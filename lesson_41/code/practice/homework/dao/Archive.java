package practice.homework.dao;

import practice.homework.model.Documents;

import java.time.LocalDate;

public interface Archive {
    boolean addDocument(Documents documents);

    boolean removeDocument(int docFolderId, int documentId);

    boolean updateDocument(int docFolderId, int documentId, String url);

    Documents getDocumentFromArchive(int docFolderId, int documentId);

    Documents[] getAllDocumentFromArchive();

    Documents[] getAllDocumentFromArchiveFolders(int docFolderId);

    Documents[] getDocumentBetweenDate(LocalDate dateFrom, LocalDate dateTo);

    int size();// quantity of photos in all albums

    int quantity();


}
