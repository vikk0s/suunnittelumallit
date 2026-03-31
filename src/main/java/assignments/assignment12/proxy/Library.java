package assignments.assignment12.proxy;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, Document> documents;

    public Library() {
        documents = new HashMap<>();
    }

    public void addDocument(RealDocument document) {
        if (document.isProtected()) {
            documents.put(document.getDocumentId(), new DocumentProxy(document));
        } else {
            documents.put(document.getDocumentId(), document);
        }
    }

    public Document getDocument(String id) {
        return documents.get(id);
    }
}
