package Project.Locations;

import Project.Items.Weapon;
import Project.Characters.Enemy;

public class Cave<T> extends Location<T> {
    public Cave() {
        super("Cave");

        // itemki
        this.addItem(Weapon.getRandomWeapon());

        // dragon w jaskini
        this.addCharacter(new Enemy("Dragon", 50));

    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("A Dragon blocks your path!");
    }
}
