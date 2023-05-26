package fr.lernejo.navy_battle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class LauncherTest {
    @Test
    public void mainTest() {
        assertDoesNotThrow(() -> Launcher.main(new String[]{"3000"}));
    }
}
