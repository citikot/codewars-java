package hillel.streamconsult.beforerefactor;

public class GeneralLogging implements Logging{

    @Override
    public void startLogging(){
        System.out.println("General Logging started!");
    }

    @Override
    public void endLogging() {
        System.out.println("Overrided End Logging");
    }

}
