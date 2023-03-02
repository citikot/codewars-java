package hillel.streamconsult.beforerefactor;


public interface Logging {
    void startLogging();


    default void endLogging(){
        System.out.println("End Logging");
    }
}
