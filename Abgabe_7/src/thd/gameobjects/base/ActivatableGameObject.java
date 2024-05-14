package thd.gameobjects.base;

/**
 * Is the interface for game objects which activate only if needed.
 */
public interface ActivatableGameObject {
    /**
     * Tells when to activate the game object.
     *
     * @param info Reference to another object to calculate spawn time.
     * @return true if the spawn condition is set, otherwise false.
     */
    boolean tryToActivate(Object info);
}
