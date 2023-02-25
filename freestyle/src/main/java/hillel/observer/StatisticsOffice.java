package hillel.observer;

import java.util.Objects;

public class StatisticsOffice implements Observer {

    @Override
    public void update(FopData fopData) {
        System.out.println("Statistics Office has got data: " + fopData);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        return o instanceof StatisticsOffice that;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
