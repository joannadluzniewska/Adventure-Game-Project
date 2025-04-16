package Project.Locations;

import java.util.HashMap;
import java.util.Map;

public class GameMap {
    private Map<Position, Location<?>> locationMap = new HashMap<>();
    private Position playerPosition = new Position(0, 0);

    public GameMap() {
        locationMap.put(playerPosition, new Forest<>());
    }

    public Position getPlayerPosition() {
        return playerPosition;
    }

    public Location<?> getCurrentLocation() {
        return locationMap.get(playerPosition); //  location of the players current position
    }

    public void movePlayer(Direction direction) {
        int newX = playerPosition.getX() + direction.getDelta().getX();
        int newY = playerPosition.getY() + direction.getDelta().getY();
        Position newPosition = new Position(newX, newY);

        if (!locationMap.containsKey(newPosition)) {
            locationMap.put(newPosition, generateRandomLocation());
        }

        playerPosition = newPosition;
        System.out.println("You moved " + direction.name().toLowerCase() + ".");
    }

    private Location<?> generateRandomLocation() {
        int randomInt = (int) (Math.random() * 3);

        return switch (randomInt){
            case 1 -> new City();
            case 2 -> new Cave();
            default -> new Forest<>();
        };
    }
}



