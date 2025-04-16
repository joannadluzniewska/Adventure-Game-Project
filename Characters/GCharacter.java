package Project.Characters;
import Project.Player;

public abstract class GCharacter<T> {
    private String name;
    private T data;

    public GCharacter(String name, T data) {
        this.name = name;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public T getData() {
        return data;
    }

    public abstract void interact(Player player);
}
