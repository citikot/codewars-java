package hillel.socks;

public class SocksFactory {
    private SocksFactory(){

    }
    public static Socks createSocks(Location location, SocksType socksType){
        return switch (location) {
            case KYIV -> KyivSocksFactory.createSocks(socksType);
            case ZHITOMYR -> ZhitomyrSocksFactory.createSocks(socksType);
            default ->throw new IllegalArgumentException("Incorrect location " + location);
        };
    }
}
