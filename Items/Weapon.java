package Project.Items;
import Project.Items.Item;
import Project.Player;

import java.util.Objects;

public class Weapon extends Item<Integer> {

    private WeaponType type;

    public Weapon(String name, int baseDamage, WeaponType type) {
        super(name, baseDamage); // baseDamage is the raw value
        this.type = type;
    }

    private static String[] names = new String[100];

    public static Weapon getRandomWeapon() {
        WeaponType randomType = WeaponType.getRandomType();
        String randomName = randomType.getDisplayName();
        int baseDamage = 5 + (int)(Math.random() * 10); // Random base damage between 5 and 15
        return new Weapon(randomName, baseDamage, randomType);
    }

    @Override
    public void use(Player player) {
        int totalDamage = getValue() * type.getMult();
        System.out.println("You attack with " + getName() + " (" + type + "). Result: " + totalDamage + " damage.");
    }

    public WeaponType getType() {
        return type;
    }

    public int getTotalDamage() {
        return getValue() * type.getMult();
    }

}

