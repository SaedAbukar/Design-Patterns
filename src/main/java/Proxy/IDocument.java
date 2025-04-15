package Proxy;
import java.time.LocalDateTime;

public interface IDocument {
    int getId();
    LocalDateTime getCreated();
    String getContent(String username);
    Boolean isProtected();
    String getCreator();
    void setProtected(Boolean isProtected, String creator);
}
