package thd.game.managers;

import thd.game.level.*;
import thd.game.utilities.GameView;

import java.util.List;

class LevelManager extends GameWorldManager {
    private List<Level> levels;
    private int index;
    private static final int LIVES = 5;


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
        levels = List.of(new Level6() ,new Level1(), new Level2());
        level = levels.get(0);
        //test if working properly
        /*
        if (level.getDifficulty() == Difficulty.EASY) {
            lives = 30;
        } else {
            lives = LIVES;
        }
         */
        lives = LIVES;
    }
}
