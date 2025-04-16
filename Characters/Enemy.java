package Project.Characters;

import Project.Player;

public class Enemy extends GCharacter<Integer> {

    public Enemy(String name, Integer strength) {
        super(name, strength);
    }

    @Override
    public void interact(Player player) {
        player.setHealth(player.getHealth() - getData());
    }
}
