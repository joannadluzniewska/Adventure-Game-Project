package Project.Locations;

import Project.Characters.GCharacter;
import Project.Items.Item;

import java.util.ArrayList;
import java.util.List;

public abstract class Location<T> {
    private String name;
    private List<Item<?>> items = new ArrayList<>();
    private List<GCharacter<?>> characters = new ArrayList<>();

    public Location(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Item<?>> getItems() {
        return items;
    }

    public void addItem(Item<?> item) {
        items.add(item);
    }

    public Item<?> removeItem(String itemName) {
        for (Item<?> item : items) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                items.remove(item);
                return item;
            }
        }
        return null;
    }

    public void addCharacter(GCharacter<?> character) {
        characters.add(character);
    }

    public List<GCharacter<?>> getCharacters() {
        return characters;
    }

    public void describe() {
        System.out.println("You are in: " + name);

        if (items.isEmpty()) {
            System.out.println("No items here.");
        } else {
            System.out.print("Items here: ");
            for (Item<?> item : items) {
                System.out.print(item.getName() + " ");
            }
            System.out.println();
        }

        if (characters.isEmpty()) {
            System.out.println("No characters here.");
        } else {
            System.out.print("Characters here: ");
            for (GCharacter<?> character : characters) {
                System.out.print(character.getName() + " ");
            }
            System.out.println();
        }
    }
}
