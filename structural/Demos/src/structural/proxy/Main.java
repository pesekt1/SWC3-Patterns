package structural.proxy;

public class Main {
    public static void main(String[] args) {
        loadingWithoutProxy();
        loadingWithProxy();
        usingAnotherProxyAgent();
    }

    public static void loadingWithoutProxy() {
        System.out.println("\n"+"Loading without proxy pattern - costly:");
        var library = new Library();
        //simulating that a user has purchased these books so their names should be visible in the library.
        String[] fileNames = {"book1", "book2", "book3"};
        for (var name: fileNames) {
            library.add(new RealEbook(name)); // instantiating real ebook
        }
        library.openEbook("book1");
    }

    public static void loadingWithProxy() {
        System.out.println("\n"+"Loading with proxy pattern - Lazy loading / Loading on-demand:");
        var library = new Library();
        String[] fileNames = {"book1", "book2", "book3"};
        for (var name: fileNames) {
            library.add(new EbookProxy(name)); //instantiating proxy ebook
        }
        library.openEbook("book1");
    }

    public static void usingAnotherProxyAgent() {
        System.out.println("\n"+"Using another proxy agent:");
        var library = new Library();
        String[] fileNames = {"book1", "book2", "book3"};
        for (var name: fileNames) {
            library.add(new LoggingEbookProxy(name)); //proxy agent
        }
        library.openEbook("book1");
    }

}