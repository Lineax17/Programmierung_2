package thd.game.utilities;

import thd.gameobjects.base.GameObject;

import java.util.LinkedList;
import java.util.List;

public class SortedGameObjectsList extends LinkedList<GameObject> {
    private final List<GameObject> gameObjects;

    public SortedGameObjectsList(List<GameObject> gameObjects) {
        this.gameObjects = gameObjects;
    }


    @Override
    public void add(int index, GameObject toAdd) {
        int indexToSortIn = index;
        for (GameObject gameObject : gameObjects) {
            if (gameObject.getDistanceToBackground() >= toAdd.getDistanceToBackground()) {
                break;
            }
            indexToSortIn++;
        }
        gameObjects.add(indexToSortIn, toAdd);
    }
}
