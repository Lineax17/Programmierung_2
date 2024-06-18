package thd.screens;

import thd.game.level.Difficulty;
import thd.game.utilities.GameView;

/**
 * Displays the StartScreen.
 */
public class StartScreen {
    private Difficulty selectedDifficulty;
    private final GameView gameView;

    /**
     * Initializes a new StartScreen.
     *
     * @param gameView Instance if {@link GameView}.
     */
    public StartScreen(GameView gameView) {
        this.gameView = gameView;
    }

    /**
     * Shows the StartScreen.
     *
     * @param preselectedDifficulty The difficulty that has been read.
     */
    public void showStartScreenWithPreselectedDifficulty(Difficulty preselectedDifficulty) {
        boolean easy = (preselectedDifficulty == Difficulty.EASY);
        String title = "Galg";
        String description = """
                \s
                'Galg' ist ein 2D-Arcade-Shooter, bei dem Spieler ein Raumschiff steuern \s
                und durch verschiedene Level navigieren müssen, um feindliche Gegner zu \s
                besiegen und Hindernissen auszuweichen. \s
                Steuerung: W A S D, Schuss: Leertaste \s
                """;
        boolean difficultySetToEasy = this.gameView.showSimpleStartScreen(title, description, easy);
        if (difficultySetToEasy) {
            this.selectedDifficulty = Difficulty.EASY;
        } else {
            this.selectedDifficulty = Difficulty.STANDARD;
        }
    }


    /**
     * Returns the difficulty the user selected.
     *
     * @return The difficulty thats been selected.
     */
    public Difficulty getSelectedDifficulty() {
        return selectedDifficulty;
    }
}
