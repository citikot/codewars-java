package hillel.singleton;

public class MainSingleton {
    public static void main(String[] args) {


        addCatalogToLibrary("AAAA1");
        addCatalogToLibrary("AAAA2", "AAAA3", "AAAA4");
        removeCatalogFromLibrary("AAAA3");

    }

    private static void addCatalogToLibrary(String... directories) {
        LibrarySingleton.getInstance().addDirectory(directories);
    }

    private static boolean removeCatalogFromLibrary(String directories){
        return LibrarySingleton.getInstance().removeDirectory(directories);
    }
}
