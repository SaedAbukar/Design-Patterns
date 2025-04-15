package Proxy;

import java.util.HashMap;

public class Library {
    HashMap<Integer, IDocument> documents;
    AccessControlService accessControlService;
    public Library() {
        documents = new HashMap<>();
        accessControlService = AccessControlService.getInstance();
    }
    public void addDocument(IDocument document, String username) {
        if (!documents.containsKey(document.getId())) {
            documents.put(document.getId(), document);
            if (!accessControlService.getDocuments().containsKey(document.getId())) {
                accessControlService.addDocument(document.getId(), username);
            }
        } else {
            System.out.println("Document already exists!");
        }
    }

    public IDocument getDocument(int id) {
        return documents.get(id);
    }

    public IDocument createDocument(String username, String content) {
        return new Document(username, content);
    }

    public IDocument createDocumentProxy(IDocument document) {
        return new DocumentProxy(document);
    }

    public HashMap<Integer, IDocument> getDocuments() {
        return documents;
    }
}
