package thd.game.managers;

import thd.game.utilities.GameView;
import thd.gameobjects.base.CollidingGameObject;
import thd.gameobjects.base.GameObject;
import thd.gameobjects.movable.*;
import thd.gameobjects.unmovable.Score;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class GameWorldManager extends GamePlayManager {
    private final String world;
    private final int worldOffsetLines;
    private final int worldOffsetColumns;
    private final List<CollidingGameObject> wallsForPathDecision;
    private final List<GameObject> activatableGameObjects;


    protected GameWorldManager(GameView gameView) {
        super(gameView);
        world = """
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W         F                            W\s
                W                                      W\s
                W                                      W\s
                W                         F            W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W         F                            W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                 A                    W\s
                W                                      W\s
                W                                      W\s
                W       G                              W\s
                W                             G        W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                WW                                   WWW\s
                WW                                    WW\s
                WWW                                   WW\s
                WWWW         G        A             WWWW\s
                WW                                    WW\s
                W                                      W\s
                WW             A                       W\s
                WWW                       F            W\s
                WW                                     W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s""";
        worldOffsetLines = world.split("\\R").length - 23;
        worldOffsetColumns = 0;
        activatableGameObjects = new LinkedList<>();
        wallsForPathDecision = new LinkedList<CollidingGameObject>();
        score = new Score(gameView, this);
        xwing = new XWing(gameView, this);
        //head = new Head(gameView, this);
        //obstacle1 = new Obstacle(gameView, this);
        //turretBig = new TurretBig(gameView, this);
        //turretSmall = new TurretSmall(gameView, this);
        spawnGameObjects();
        spawnGameObjectsFromWorldString();
    }

    private void spawnGameObjects() {
        spawnGameObject(score);
        //spawnGameObject(head);
        //spawnGameObject(obstacle1);
        //spawnGameObject(turretBig);
        //spawnGameObject(turretSmall);
        spawnGameObject(xwing);
    }

    private void spawnGameObjectsFromWorldString() {
        String[] lines = world.split("\\R");
        for (int line = 0; line < lines.length; line++) {
            for (int column = 0; column < lines[line].length(); column++) {
                char character = lines[line].charAt(column);
                if (character == 'W') {
                    Wall wall = new Wall(gameView, this);
                    double x = (column - worldOffsetColumns) * 32;
                    double y = (line - worldOffsetLines) * 32;
                    wall.getPosition().updateCoordinates(x, y);
                    spawnGameObject(wall);
                    wallsForPathDecision.add(wall);
                }
            }
        }

        for (int line = 0; line < lines.length; line++) {
            for (int column = 0; column < lines[line].length(); column++) {
                char character = lines[line].charAt(column);

                if (character == 'A') {
                    Alien alien = new Alien(gameView, this);
                    double x = (column - worldOffsetColumns) * 32;
                    double y = (line - worldOffsetLines) * 32;
                    alien.getPosition().updateCoordinates(x, y);
                    spawnGameObject(alien);
                } else if (character == 'G') {
                    Gem gem = new Gem(gameView, this);
                    double x = (column - worldOffsetColumns) * 32;
                    double y = (line - worldOffsetLines) * 32;
                    gem.getPosition().updateCoordinates(x, y);
                    gem.addWallsToCollisionList(wallsForPathDecision);
                    spawnGameObject(gem);
                } else if (character == 'F') {
                    SpaceFrog spaceFrog = new SpaceFrog(gameView, this);
                    double x = (column - worldOffsetColumns) * 32;
                    double y = (line - worldOffsetLines) * 32;
                    spaceFrog.getPosition().updateCoordinates(x, y);
                    spawnGameObject(spaceFrog);
                }
            }
        }
    }

    private void addActivatableGameObject(GameObject gameObject) {
        activatableGameObjects.add(gameObject);
        addToShiftableGameObjectsIfShiftable(gameObject);
    }

    @Override
    protected void gameLoopUpdate() {
        super.gameLoopUpdate();
        activateGameObjects();
    }

    private void activateGameObjects() {
        ListIterator<GameObject> iterator = activatableGameObjects.listIterator();
        while (iterator.hasNext()) {
            GameObject gameObject = iterator.next();
            if (gameObject instanceof SpaceFrog spaceFrog) {
                spaceFrog.tryToActivate(xwing);
            }
        }
    }
}
