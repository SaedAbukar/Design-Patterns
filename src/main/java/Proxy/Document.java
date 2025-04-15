package Proxy;

import java.time.LocalDateTime;

public class Document implements IDocument{

    public static int counter = 0;
    private int id;
    public LocalDateTime created;
    private String content;
    private Boolean isProtected;
    private String creator;

    public Document(String creator, String content) {
        id = counter++ ;
        created = LocalDateTime.now();
        this.content = content;
        isProtected = false;
        this.creator = creator;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public LocalDateTime getCreated() {
        return created;
    }

    @Override
    public String getContent(String username) {
        return content;
    }

    @Override
    public Boolean isProtected() {
        return isProtected;
    }

    @Override
    public String getCreator() {
        return creator;
    }

    @Override
    public void setProtected(Boolean isProtected, String creator) {
        this.isProtected = isProtected;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
