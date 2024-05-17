package thd.game.level;

/**
 * Represents a level.
 */
public class Level {
    /**
     * The name of the level.
     */
    public String name;
    /**
     * The number of the level.
     */
    public int number;
    /**
     * The String representation of the element in the level.
     */
    public String world;
    /**
     * Describes the height of the Area that is out of the players view.
     */
    public int worldOffsetLines;
    /**
     * Describes the length of the Area that is out of the players view.
     */
    public int worldOffsetColumns;
}
