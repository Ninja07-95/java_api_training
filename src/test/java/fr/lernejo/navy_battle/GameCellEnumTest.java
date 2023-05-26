package fr.lernejo.navy_battle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameCellEnumTest {
    @Test
    public void testGameCellEnumValues() {
        assertEquals("SHIP", GameCellEnum.SHIP.name());
        assertEquals("WATER", GameCellEnum.WATER.name());
        assertEquals("HIT", GameCellEnum.HIT.name());
        assertEquals("MISS", GameCellEnum.MISS.name());
    }
}

