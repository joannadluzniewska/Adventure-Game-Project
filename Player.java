package Project;

import Project.Items.Item;
import Project.Locations.Direction;
import Project.Locations.GameMap;
import Project.Locations.Location;
import Project.Locations.Position;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int health;
    private List<Item<?>> inventory;
    private GameMap gameMap;

    public Player(String name, GameMap gameMap) {
        this.name = name;
        this.health = 100;
        this.inventory = new ArrayList<>();
        this.gameMap = gameMap;
    }

    public void look() {
        Location<?> loc = gameMap.getCurrentLocation();
        loc.describe();
    }

    public void move(Direction direction) {
        gameMap.movePlayer(direction);
        look();
    }

    public void pickup(String itemName) {
        Location<?> loc = gameMap.getCurrentLocation();
        if (loc != null) {
            Item<?> item = loc.removeItem(itemName);
            if (item != null) {
                inventory.add(item);
                System.out.println("You picked up: " + item.getName());
            } else {
                System.out.println("There's no item named '" + itemName + "' here.");
            }
        }
    }
    public void useItem(String itemName) {
        for (Item<?> item : inventory) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                item.use(this);
                return;
            }
        }
        System.out.println("You don't have an item named '" + itemName + "'.");
    }

    public void describeInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Your inventory is empty.");
        } else {
            System.out.print("Your inventory: ");
            for (Item<?> item : inventory) {
                System.out.print(item.getName() + " ");
            }
            System.out.println();
        }
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int value) {
        this.health = Math.max(0, value);
    }

    public Position getPosition() {
        return gameMap.getPlayerPosition();
    }
}
