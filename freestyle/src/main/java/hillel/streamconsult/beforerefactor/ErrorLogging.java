package hillel.streamconsult.beforerefactor;

public class ErrorLogging implements Logging {
        @Override
        public void startLogging(){
            System.out.println("Error Logging started!");
        }
}
