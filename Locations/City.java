/*
package Project.Locations;

public class City extends Location{
    @Override
    public String getName() {
        return "City";
    }
}

*/

/*
package Project.Locations;

import Project.Items.Consumable;

public class City<T> extends Location<T> {
    public City() {
        super("City");

        int numConsumables = 2 + (int)(Math.random() * 3); // 2–4 consumables
        for (int i = 0; i < numConsumables; i++) {
            this.addItem(Consumable.getRandomCons());
        }


    }
}*/package Project.Locations;

import Project.Characters.Merchant;
import Project.Items.Consumable;
import Project.Items.Item;
import Project.Items.Weapon;
import Project.Items.WeaponType;

import java.util.Arrays;
import java.util.List;

public class City<T> extends Location<T> {
    public City() {
        super("City");

        List<Item<?>> merchantInventory = Arrays.asList(
                new Weapon("Magic Sword", 25, WeaponType.SWORD),
                new Consumable("Healing Potion", 40)
        );

        this.addCharacter(new Merchant("Merchant", merchantInventory));

        this.addItem(new Weapon("Dagger", 10, WeaponType.SWORD));
        this.addItem(new Consumable("Protein shake", 10));
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("A Merchant is here, ready to sell you items!"); //miasto merchant
    }
}
