package assignments.assignment12.proxy;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        AccessControlService accessControlService = AccessControlService.getInstance();

        User user1 = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");

        RealDocument doc1 = new RealDocument("doc1", "12.12.2012", "content1", true);
        RealDocument doc2 = new RealDocument("doc2", "13.12.2012", "content2", false);
        RealDocument doc3 = new RealDocument("doc3", "14.12.2012", "content3", true);

        library.addDocument(doc1);
        library.addDocument(doc2);
        library.addDocument(doc3);

        accessControlService.grantAccess("doc1", "user1");
        accessControlService.grantAccess("doc2", "user2");

        try {
            System.out.println("User1 tries to access doc1 " + library.getDocument("doc1").getContent(user1));
        } catch (AccessDeniedException e) {
            System.out.println("User1 denied access to doc1");
        }
        try {
            System.out.println("User2 tries to access doc2 " + library.getDocument("doc2").getContent(user2));
        } catch (AccessDeniedException e) {
            System.out.println("User2 denied access to doc2");
        }
        try {
            System.out.println("User3 tries to access doc3 " + library.getDocument("doc3").getContent(user3));
        } catch (AccessDeniedException e) {
            System.out.println("User3 denied access to doc3");
        }
    }
}
