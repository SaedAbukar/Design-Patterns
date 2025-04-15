package Proxy;

public class Main {
    public static void main(String[] args) {
        AccessControlService accessControlService = AccessControlService.getInstance();
        User user1 = new User("Lebron");
        User user2 = new User("Steph");
        User user3 = new User("Messi");
        User user4 = new User("Ronaldo");
        Library library = new Library();
        IDocument document1 = library.createDocument(user1.getName(), "File 1");
        IDocument document2 = library.createDocument(user1.getName(), "File 2");
        IDocument document3 = library.createDocument(user2.getName(), "File 3");
        IDocument document4 = library.createDocument(user2.getName(), "File 4");
        document1.setProtected(true, user1.getName());
        IDocument document5 = library.createDocumentProxy(document1);
        document3.setProtected(true, user2.getName());
        IDocument document6 = library.createDocumentProxy(document3);
        library.addDocument(document5, document1.getCreator());
        library.addDocument(document6, document2.getCreator());
        library.addDocument(document3, document3.getCreator());
        library.addDocument(document4, document4.getCreator());

        System.out.printf("%s gets his protected document%n", user1.getName());
        System.out.println(document5.getContent(user1.getName()));
        System.out.printf("%s gets his unprotected document%n", user1.getName());
        System.out.println(document2.getContent(user1.getName()));
        System.out.printf("%s gets his protected document%n", user2.getName());
        System.out.println(document6.getCreator());
        System.out.println(document6.getContent(user1.getName()));
        System.out.printf("%s gets his unprotected document%n", user2.getName());
        System.out.println(document4.getContent(user2.getName()));
        System.out.printf("%s gets others uprotected document%n", user3.getName());
        System.out.println(document2.getContent(user3.getName()));
        System.out.printf("%s gets others protected document%n", user4.getName());
        try {
            System.out.println(document5.getContent(user4.getName()));
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
        }

    }
}
