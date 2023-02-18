package hillel.socks;

public class ZhitomyrSocksFactory {
    private  ZhitomyrSocksFactory() {

    }

    public static Socks createSocks(SocksType socksType) {
        return switch (socksType) {
            case BIG:
                yield new GirlSocks(SocksType.BIG);
            case SMALL:
                yield new UltraChildrenSocks(SocksType.SMALL);
            case MEDIUM:
                yield new UltraChildrenSocks(SocksType.MEDIUM);
            default:
                throw new IllegalArgumentException("Incorrect Socks Type " + socksType);
        };
    }
}
