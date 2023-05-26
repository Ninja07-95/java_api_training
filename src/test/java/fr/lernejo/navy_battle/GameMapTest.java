package fr.lernejo.navy_battle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameMapTest {
    @Test
    public void testMapInitialization() {
        GameMap gameMap = new GameMap();
        assertEquals(10, gameMap.getSea().length);
        assertEquals(10, gameMap.getSea()[0].length);
    }
}
