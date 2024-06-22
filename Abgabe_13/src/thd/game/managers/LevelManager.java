package thd.game.managers;

import thd.game.level.*;
import thd.game.utilities.GameView;

import java.util.List;

class LevelManager extends GameWorldManager {
    private List<Level> levels;
    private int index;
    private static final int STANDARDLIVES = 5;
    private static final int EASYLIVES = 50;


    protected LevelManager(GameView gameView) {
        super(gameView);
    }

    @Override
    protected void initializeLevel() {
        super.initializeLevel();
        initializeGameObjects();
    }

    private void initializeGameObjects() {
        //Hintergrund ändern
        //Lebensanzeige aktualisieren
        //Punktestand übernehmen
        //Einen Countdown neu starten
    }

    protected boolean hasNextLevel() {
        return levels.size() > index + 1;
    }

    protected void switchToNextLevel() {
        if (hasNextLevel()) {
            index++;
            super.level = levels.get(index);
        } else {
            throw new NoMoreLevelsAvailableException("No more levels available");
        }
    }

    protected void initializeGame() {
        index = 0;
        points = 0;
        levels = List.of(new Level10() ,new Level1(), new Level2());
        level = levels.get(0);
        //Difficulty
        if (Level.difficulty == Difficulty.EASY) {
            lives = EASYLIVES;
        } else {
            lives = STANDARDLIVES;
        }
    }

}
