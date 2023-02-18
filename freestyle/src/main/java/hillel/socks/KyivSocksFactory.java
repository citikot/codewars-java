package hillel.socks;

public class KyivSocksFactory {
    private  KyivSocksFactory () {

    }

    public static Socks createSocks(SocksType socksType) {
        return switch (socksType) {
            case BIG -> new ArmySocks(SocksType.BIG);
            case SMALL -> new UltraChildrenSocks(SocksType.SMALL);
            case MEDIUM -> new ManSocks(SocksType.MEDIUM);
            default -> throw new IllegalArgumentException("Incorrect Socks Type " + socksType);
        };
    }
}
