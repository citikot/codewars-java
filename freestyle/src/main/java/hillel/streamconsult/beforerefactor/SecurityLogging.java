package hillel.streamconsult.beforerefactor;

public class SecurityLogging implements Logging {
        @Override
        public void startLogging(){
            System.out.println("Security Logging started!");
        }
}
