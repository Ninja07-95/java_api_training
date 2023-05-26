package fr.lernejo.navy_battle;

public class GameMap {
    private final GameCellEnum[][] sea;

    public GameMap() {
        this.sea = new GameCellEnum[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                sea[i][j] = GameCellEnum.WATER;
            }
        }
    }

    public GameCellEnum[][] getSea() {
        return sea;
    }
}
