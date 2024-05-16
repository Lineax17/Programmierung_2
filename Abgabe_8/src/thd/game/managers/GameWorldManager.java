package thd.game.managers;

import thd.game.utilities.GameView;
import thd.gameobjects.base.CollidingGameObject;
import thd.gameobjects.base.GameObject;
import thd.gameobjects.movable.Alien;
import thd.gameobjects.movable.Gem;
import thd.gameobjects.movable.SpaceFrog;
import thd.gameobjects.movable.XWing;
import thd.gameobjects.unmovable.*;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class GameWorldManager extends GamePlayManager {
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
                W              O                       W\s
                W              OOO                     W\s
                W               OO                     W\s
                W                                      W\s
                W                    H                 W\s
                W                                      W\s
                WW                                   WWW\s
                WW                                    WW\s
                WWW                                  BWW\s
                WWWW         G        A             WWWW\s
                WW                                    WW\s
                W                                      W\s
                WW             A                      SW\s
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
        spawnGameObjects();
        spawnGameObjectsFromWorldString();
    }

    private void spawnGameObjects() {
        spawnGameObject(score);
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
                    addActivatableGameObject(spaceFrog);
                    activateGameObjects();
                } else if (character == 'H') {
                    Head head = new Head(gameView, this);
                    double x = (column - worldOffsetColumns) * 32;
                    double y = (line - worldOffsetLines) * 32;
                    head.getPosition().updateCoordinates(x, y);
                    addActivatableGameObject(head);
                    activateGameObjects();
                } else if (character == 'O') {
                    Obstacle obstacle = new Obstacle(gameView, this);
                    double x = (column - worldOffsetColumns) * 32;
                    double y = (line - worldOffsetLines) * 32;
                    obstacle.getPosition().updateCoordinates(x, y);
                    addActivatableGameObject(obstacle);
                    activateGameObjects();
                } else if (character == 'B') {
                    TurretBig turretBig = new TurretBig(gameView, this);
                    double x = (column - worldOffsetColumns) * 32;
                    double y = (line - worldOffsetLines) * 32;
                    turretBig.getPosition().updateCoordinates(x, y);
                    addActivatableGameObject(turretBig);
                    activateGameObjects();
                } else if (character == 'S') {
                    TurretSmall turretSmall = new TurretSmall(gameView, this);
                    double x = (column - worldOffsetColumns) * 32;
                    double y = (line - worldOffsetLines) * 32;
                    turretSmall.getPosition().updateCoordinates(x, y);
                    addActivatableGameObject(turretSmall);
                    activateGameObjects();
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
                if (spaceFrog.tryToActivate(xwing)) {
                    spawnGameObject(spaceFrog);
                    iterator.remove();
                }
            } else if (gameObject instanceof Head head) {
                if (head.tryToActivate(xwing)) {
                    spawnGameObject(head);
                    iterator.remove();
                }
            } else if (gameObject instanceof Obstacle obstacle) {
                if (obstacle.tryToActivate(xwing)) {
                    spawnGameObject(obstacle);
                    iterator.remove();
                }
            } else if (gameObject instanceof TurretBig turretBig) {
                if (turretBig.tryToActivate(xwing)) {
                    spawnGameObject(turretBig);
                    iterator.remove();
                }
            } else if (gameObject instanceof TurretSmall turretSmall) {
                if (turretSmall.tryToActivate(xwing)) {
                    spawnGameObject(turretSmall);
                    iterator.remove();
                }
            } else if (gameObject instanceof Alien alien) {
                if (alien.tryToActivate(xwing)) {
                    spawnGameObject(alien);
                    iterator.remove();
                }
            } else if (gameObject instanceof Gem gem) {
                if (gem.tryToActivate(xwing)) {
                    spawnGameObject(gem);
                    iterator.remove();
                }
            }
        }
    }
}
