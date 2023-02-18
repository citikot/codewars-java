package hillel.socks;

public class Main {
    public static void main(String[] args) {
        SocksFactory.createSocks(Location.KYIV, SocksType.SMALL);
        SocksFactory.createSocks(Location.KYIV, SocksType.MEDIUM);
        SocksFactory.createSocks(Location.KYIV, SocksType.BIG);

        SocksFactory.createSocks(Location.ZHITOMYR, SocksType.SMALL);
        SocksFactory.createSocks(Location.ZHITOMYR, SocksType.MEDIUM);
        Socks socks = SocksFactory.createSocks(Location.ZHITOMYR, SocksType.BIG);
        System.out.println("Put socks: " + socks);
    }
}
