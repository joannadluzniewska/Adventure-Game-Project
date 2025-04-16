package Project.Items;

import java.util.Random;

public enum WeaponType {
    SWORD(1),
    BOW(2),
    SPEAR(3),
    WAND(4);

    private final int mult;

    WeaponType(int mult) {
        this.mult = mult;
    }

    public int getMult() {
        return mult;
    }

    public String getDisplayName() {
        return this.name();
    }

    public static WeaponType getRandomType() {
        WeaponType[] types = values();
        return types[new Random().nextInt(types.length)];
    }
}