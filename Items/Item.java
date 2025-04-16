package Project.Items;
import Project.Player;

import java.util.Objects;

public abstract class Item<T> {
    private String name;
    private T value;

    public Item(String name, T value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public T getValue() {
        return value;
    }

    public abstract void use(Player player);

    //zeby contains dzialalo
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Item<?> item = (Item<?>) obj;
        return name.equals(item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}