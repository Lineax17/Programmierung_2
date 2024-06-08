package thd.game.level;

/**
 * Unchecked exception that is thrown if the last level has loaded.
 */
public class NoMoreLevelsAvailableException extends RuntimeException {
    /**
     * Initializing the exception.
     *
     * @param message the message given by the exception.
     */
    public NoMoreLevelsAvailableException(String message) {
        super(message);
    }
}
