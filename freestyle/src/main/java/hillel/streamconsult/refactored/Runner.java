package hillel.streamconsult.refactored;

import hillel.streamconsult.beforerefactor.ErrorLogging;
import hillel.streamconsult.beforerefactor.GeneralLogging;
import hillel.streamconsult.beforerefactor.SecurityLogging;
import org.w3c.dom.ls.LSOutput;

public class Runner {
    public static void main(String[] args) {
        Logging generalLogger = () -> System.out.println("General Logging started!");

        Logging errorLogger = () -> System.out.println("Error Logging started!");

        Logging securityLogger = () -> System.out.println("Security Logging started!");

        generalLogger.startLogging();
        errorLogger.startLogging();
        securityLogger.startLogging();

        generalLogger.endLogging();
        errorLogger.endLogging();
        securityLogger.endLogging();
    }
}
