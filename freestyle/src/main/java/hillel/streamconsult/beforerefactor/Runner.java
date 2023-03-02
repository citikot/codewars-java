package hillel.streamconsult.beforerefactor;

import java.util.function.Predicate;

public class Runner {
    public static void main(String[] args) {
        Logging generalLogger = new GeneralLogging();
        Logging errorLogger = new ErrorLogging();
        Logging securityLogger = new SecurityLogging();

        generalLogger.startLogging();
        errorLogger.startLogging();
        securityLogger.startLogging();

        generalLogger.endLogging();
        errorLogger.endLogging();
        securityLogger.endLogging();

    }
}
