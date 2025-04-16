package Project.Characters;

import Project.Items.Consumable;
import Project.Items.Item;
import Project.Player;

import java.util.List;

public class Merchant extends GCharacter<List<Item<?>>> {

    public Merchant(String name, List<Item<?>> items) {
        super(name, items);
        Consumable.getRandomCons();
    }



    @Override
    public void interact(Player player) {
        for (Item<?> item : getData()) {
            System.out.println(item.getName());
        }
    }
}
