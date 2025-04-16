package Project.Items;
import Project.Player;
import Project.Items.Item;

import java.util.Objects;

public class Consumable extends Item<Integer> {
    public Consumable(String name, Integer healingPower) {
        super(name, healingPower);
    }

    @Override
    public void use(Player player) {
        player.setHealth(player.getHealth() + getValue());
        System.out.println("You used " + getName() + ", and restored " + getValue() + ". Your current HP: " +
                player.getHealth());
    }

    private static String[] names = new String[100];

    public static Consumable getRandomCons() {
        String[] names = {"Magic Apple", "Potion", "Protein shake"};
        String name = names[(int)(Math.random() * names.length)];
        int heal = 5 + (int)(Math.random() * 10);
        return new Consumable(name, heal);
    }


}