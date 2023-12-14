package gof.structural.flyweight.model.sharedinfo;

public class SoldierSharedInfo {
    private static final String SOLDIER_HEAVY_TEXTURE_FILE = "Very heavy texture file for soldier";
    private static final String SOLDIER_HEAVY_SOUND_FILE = "Very heavy sound file for soldier";

    private static SoldierSharedInfo instance;

    public static SoldierSharedInfo getInstance() {
        if (instance == null) {
            instance = new SoldierSharedInfo();
        }
        return instance;
    }

    public static String getTextures() {
        return SOLDIER_HEAVY_TEXTURE_FILE;
    }

    public static String getSounds() {
        return SOLDIER_HEAVY_SOUND_FILE;
    }
}
