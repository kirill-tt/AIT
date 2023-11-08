package practice.homework.model;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.Objects;

public class Documents  implements Comparable<Documents> {
    //fields
    private int docFolderId;
    private int documentId;
    private String titles;
    private String url;
    private LocalDateTime docDate;

    public Documents(int docFolderId, int documentId, String titles, String url, LocalDateTime docDate) {
        this.docFolderId = docFolderId;
        this.documentId = documentId;
        this.titles = titles;
        this.url = url;
        this.docDate = docDate;
    }

    public int getDocFolderId() {
        return docFolderId;
    }

    public void setDocFolderId(int docFolderId) {
        this.docFolderId = docFolderId;
    }

    public int getDocumentId() {
        return documentId;
    }

    public void setDocumentId(int documentId) {
        this.documentId = documentId;
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

    public LocalDateTime getDocDate() {
        return docDate;
    }

    public void setDocDate(LocalDateTime docDate) {
        this.docDate = docDate;
    }

    @Override
    public String toString() {
        return "Documents : " +
                "docFolderId /" + docFolderId +
                "|| documentId /" + documentId +
                " || titles / " + titles +
                " || url / " + url +
                " || docDate : " + docDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Documents documents)) return false;
        return docFolderId == documents.docFolderId && documentId == documents.documentId;
    }

    @Override
    public int hashCode() {
        int result = docFolderId;
        result = 31 * result + documentId;
        return result;
    }

    @Override
    public int compareTo(Documents o) {
        int res = Integer.compare( docFolderId, o.docFolderId );
        return res!=0 ? res : Integer.compare( documentId, o.documentId );// тернарный оператор
        //if(res!=0){return res} else {return Integer.compare( documentId,o.documentId
    }


}
