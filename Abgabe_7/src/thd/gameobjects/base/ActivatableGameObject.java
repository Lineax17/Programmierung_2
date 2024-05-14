package thd.gameobjects.base;

/**
 * Is the interface for game objects which activate only if needed.
 *
 * @param <T> the type of object thats used to calculate activation.
 */
public interface ActivatableGameObject<T> {
    /**
     * Tells when to activate the game object.
     *
     * @param t1 Reference to another object to calculate spawn time.
     * @return true if the spawn condition is set, otherwise false.
     */
    boolean tryToActivate(T t1);
}
