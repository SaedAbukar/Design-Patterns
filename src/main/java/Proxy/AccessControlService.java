package Proxy;

import java.util.HashMap;

public class AccessControlService {
    private static AccessControlService instance;
    private HashMap<Integer, String> documents;
    private AccessControlService() {
        documents = new HashMap<>();
    }

    public static AccessControlService getInstance() {
        if (instance == null) {
            instance = new AccessControlService();
        }
        return instance;
    }

    public boolean isAllowed(int bookId, String username) {
        return documents.get(bookId).equals(username);
    }

    public void addDocument(int bookId, String username) {
        documents.put(bookId, username);
    }

    public HashMap<Integer, String> getDocuments() {
        return documents;
    }
}
