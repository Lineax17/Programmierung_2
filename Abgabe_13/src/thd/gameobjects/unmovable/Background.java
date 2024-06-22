package thd.gameobjects.unmovable;

import thd.game.managers.GamePlayManager;
import thd.game.utilities.GameView;
import thd.gameobjects.base.GameObject;
import thd.gameobjects.movable.SpaceFrog;

import javax.swing.plaf.nimbus.State;

public class Background extends GameObject {
    private String imageName;
    private StandardState standardState;

    /**
     * Initializes a new score.
     *
     * @param gameView        Instance of {@link GameView}.
     * @param gamePlayManager Instance of {@link GamePlayManager}.
     * @see GameView
     * @see GamePlayManager
     */
    public Background(GameView gameView, GamePlayManager gamePlayManager) {
        super(gameView, gamePlayManager);
        super.width = 1280;
        super.height = 720;
        position.updateCoordinates(0, 0);
        standardState = StandardState.STANDARD_1;
        distanceToBackground = 0;

    }

    /**
     * Returns a string.
     *
     * @return name of object and position.
     */
    @Override
    public String toString() {
        return "Score: " + position;
    }


    @Override
    public void addToCanvas() {
        gameView.addImageToCanvas(imageName, 0, 0, 1, 0);
    }

    @Override
    public void updateStatus() {
        imageName = standardState.display;
        if (gameView.timer(301000, this)) {
            standardState = StandardState.STANDARD_2;
        }
    }

    private enum StandardState {
        STANDARD_1("background_1.png"),
        STANDARD_2("background_2.png");

        private final String display;

        StandardState(String display) {
            this.display = display;
        }
    }

}
