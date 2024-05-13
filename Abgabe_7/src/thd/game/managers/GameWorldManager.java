package thd.game.managers;

import thd.game.utilities.GameView;
import thd.gameobjects.movable.*;
import thd.gameobjects.unmovable.Score;

public class GameWorldManager extends GamePlayManager{
    private String world;

    protected GameWorldManager(GameView gameView){
        super(gameView);
        world = """
                W                     A                W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                        F             W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                  G                   W\s
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
        score = new Score(gameView, this);
        xwing = new XWing(gameView, this);
        //head = new Head(gameView, this);
        //obstacle1 = new Obstacle(gameView, this);
        //turretBig = new TurretBig(gameView, this);
        //turretSmall = new TurretSmall(gameView, this);
        spawnGameObjects();
        spawnGameObjectsFromWorldString();
    }

    private void spawnGameObjects(){
        spawnGameObject(score);
        //spawnGameObject(head);
        //spawnGameObject(obstacle1);
        //spawnGameObject(turretBig);
        //spawnGameObject(turretSmall);
        spawnGameObject(xwing);
    }

    void spawnGameObjectsFromWorldString(){
        String[] lines = world.split("\\R");

        for(int line = 0; line < lines.length; line++){
            for(int column = 0; column < lines[line].length(); column++){
                if(lines[line].charAt(column) == 'S'){
                    SpaceFrog spaceFrog = new SpaceFrog(gameView, this);
                    spaceFrog.getPosition().updateCoordinates(column*32, line*32);
                    spawnGameObject(spaceFrog);
                } else if(lines[line].charAt(column) == 'A'){
                    Alien alien = new Alien(gameView, this);
                    alien.getPosition().updateCoordinates(column*32, line*32);
                    spawnGameObject(alien);
                } else if(lines[line].charAt(column) == 'G'){
                    Gem gem = new Gem(gameView, this);
                    gem.getPosition().updateCoordinates(column*32, line*32);
                    spawnGameObject(gem);
                } else if(lines[line].charAt(column) == 'W'){
                    Wall wall = new Wall(gameView, this);
                    wall.getPosition().updateCoordinates(column*32, line*32);
                    spawnGameObject(wall);
                }
            }
        }
    }
}
