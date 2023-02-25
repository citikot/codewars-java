package hillel.observer;

public class Runner {
    public static void main(String[] args) {

        Administration administration = new Administration();
        administration.registerObserver(new StatisticsOffice());
        administration.registerObserver(new Police());
        administration.registerObserver(new TaxOffice());

        administration.registerFop("Alex", 12345);
        administration.registerFop("Nik", 12346);
        administration.registerFop("Irina", 12347);

        administration.unregisterObserver(new StatisticsOffice());

        administration.registerFop("Sveta", 123458);



    }
}
