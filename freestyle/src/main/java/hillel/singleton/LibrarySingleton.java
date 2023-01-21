package hillel.singleton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LibrarySingleton {
    private static LibrarySingleton instance;

    private List<String> directories = new ArrayList<>();

    private LibrarySingleton() {
    }

    public static LibrarySingleton getInstance() {
        if (instance == null) {
            synchronized (LibrarySingleton.class) {
                if (instance == null) {
                    instance = new LibrarySingleton();
                }
            }
        }
        return instance;
    }

    public void addDirectory(String... directory) {
        directories.addAll(Arrays.stream(directory).toList());
        System.out.println("Directories Added: " + directories);
    }

    public boolean removeDirectory(String directory) {
        boolean result = directories.remove(directory);
        System.out.println("Directories Removed: " + directories);
        return result;
    }


}
