package hillel.streamconsult.refactored;

@FunctionalInterface
public interface Logging {
    void startLogging();

    default void endLogging(){
        System.out.println("End Logging");
    }
}
