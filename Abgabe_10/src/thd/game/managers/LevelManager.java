package thd.game.managers;

import thd.game.level.*;
import thd.game.utilities.GameView;

import java.util.List;

class LevelManager extends GameWorldManager {
    private List<Level> levels;
    int index;
    private static final int LIVES = 5;
    int levelNumber;


    protected LevelManager(GameView gameView) {
        super(gameView);
        levelNumber = index + 1;
    }

    @Override
    protected void initializeLevel() {
        super.initializeLevel();
        initializeGameObjects();
    }

    private void initializeGameObjects() {
        //Hintergrund ändern
        //Lebensanzeige aktualiesieren
        //Punktestand übernehmen
        //Einen Countdown neu starten
    }

    protected boolean hasNextLevel() {
        return levels.size() > index + 1;
    }

    protected void switchToNextLevel() {
        if (hasNextLevel()) {
            index++;
            levelNumber++;
            super.level = levels.get(index);
        } else {
            throw new NoMoreLevelsAvailableException("No more levels available");
        }
    }

    protected void initializeGame() {
        GameManager gameManager = new GameManager(gameView);
        index = 0;
        levels = List.of(new Level1(), new Level2(), new Level3());
        level = levels.get(0);
        //test if working properly
        if (gameManager.getDifficulty() == Difficulty.EASY) {
            lives = 30;
        } else {
            lives = LIVES;
        }
        points = 0;
    }
}
