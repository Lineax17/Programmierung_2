package thd.game.utilities;

import thd.gameobjects.base.GameObject;

import java.util.LinkedList;

/**
 * Manages sorting of game objects.
 */
public class SortedGameObjectsList extends LinkedList<GameObject> {

    @Override
    public boolean add(GameObject toAdd) {
        int indexToSortIn = 0;
        for (GameObject gameObject : this) {
            if (gameObject.getDistanceToBackground() >= toAdd.getDistanceToBackground()) {
                break;
            }
            indexToSortIn++;
        }
        add(indexToSortIn, toAdd);
        return true;
    }
}
