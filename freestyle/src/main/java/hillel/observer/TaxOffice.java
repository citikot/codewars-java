package hillel.observer;

public class TaxOffice implements Observer {
    @Override
    public void update(FopData fopData) {
        System.out.println("Tax Office has got data: " + fopData);
    }
}
