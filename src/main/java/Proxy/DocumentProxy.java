package Proxy;

import java.time.LocalDateTime;

public class DocumentProxy implements IDocument{

    IDocument document;
    AccessControlService accessControlService;
    public DocumentProxy(IDocument document) {
        this.document = document;
        accessControlService = AccessControlService.getInstance();
    }

    @Override
    public int getId() {
        return document.getId();
    }

    @Override
    public LocalDateTime getCreated() {
        return document.getCreated();
    }

    @Override
    public String getContent(String username) {
        if (document.isProtected()){
            if (accessControlService.isAllowed(document.getId(), username)) {
                return document.getContent(username);
            }
            throw new AccessDeniedException("Access not allowed!");
        }
        return document.getContent(username);
    }

    @Override
    public Boolean isProtected() {
        return document.isProtected();
    }

    @Override
    public String getCreator(){
        return document.getCreator();
    }

    @Override
    public void setProtected(Boolean isProtected, String username) {
        if (accessControlService.isAllowed(document.getId(), username)) {
            document.setProtected(isProtected, username);
        } else {
            throw new AccessDeniedException("Change of protection not allowed!");
        }
    }
}
