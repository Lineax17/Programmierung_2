package thd.game.managers;

import thd.game.utilities.GameView;
import thd.gameobjects.movable.*;
import thd.gameobjects.unmovable.Score;
import thd.gameobjects.unmovable.Wall;

public class GameWorldManager extends GamePlayManager{
    private String world;

    protected GameWorldManager(GameView gameView){
        super(gameView);
        world = """
                B   G  G    \s
                            \s
                            \s
                            \s
                            \s
                      X     \s
                L          R\s""";
        alien = new Alien(gameView, this);
        wall = new Wall(gameView, this);
        gem = new Gem(gameView, this, wall);
        score = new Score(gameView, this);
        xwing = new XWing(gameView, this);
        spaceFrog = new SpaceFrog(gameView, this);
        head = new Head(gameView, this);
        obstacle1 = new Obstacle(gameView, this);
        turretBig = new TurretBig(gameView, this);
        turretSmall = new TurretSmall(gameView, this);
        spawnGameObjects();
    }

    private void spawnGameObjects(){
        spawnGameObject(alien);
        spawnGameObject(gem);
        spawnGameObject(score);
        spawnGameObject(xwing);
        spawnGameObject(spaceFrog);
        spawnGameObject(head);
        spawnGameObject(obstacle1);
        spawnGameObject(turretBig);
        spawnGameObject(turretSmall);
        spawnGameObject(wall);
    }
}
