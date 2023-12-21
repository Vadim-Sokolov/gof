package gof.structural.flyweight.model.sharedinfo;

public class TankSharedInfo {
    private static final String TANK_HEAVY_TEXTURE_FILE = "Very heavy texture file for tank";
    private static final String TANK_HEAVY_SOUND_FILE = "Very heavy sound file for tank";

    private static TankSharedInfo instance;

    public static TankSharedInfo getInstance() {
        if (instance == null) {
            instance = new TankSharedInfo();
        }
        return instance;
    }

    public static String getTextures() {
        return TANK_HEAVY_TEXTURE_FILE;
    }

    public static String getSounds() {
        return TANK_HEAVY_SOUND_FILE;
    }
}
