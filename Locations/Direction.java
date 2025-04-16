/*
package Project.Locations;

public enum Direction {
    NORTH(0, -1), SOUTH(0, 1), EAST(1, 0), WEST(-1, 0);

    final Position delta;

    Direction(Position delta){
        this.delta = delta;
    }

    Direction(int x, int y){
        this(new Position(x, y));
        */
/*Position position = new Position(x, y);
        delta = position;*//*

    }

    public Position getDelta() {
        return delta;
    }
}
*/

// --- Direction.java ---
package Project.Locations;

import Project.Items.Item;

import java.util.ArrayList;
import java.util.List;

public enum Direction {
    NORTH(new Position(0, -1)),
    SOUTH(new Position(0, 1)),
    EAST(new Position(1, 0)),
    WEST(new Position(-1, 0));

    private final Position delta;

    Direction(Position delta) {
        this.delta = delta;
    }

    public Position getDelta() {
        return delta;
    }
}
