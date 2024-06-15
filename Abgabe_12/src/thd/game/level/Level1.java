package thd.game.level;

/**
 * The first Level of the game.
 */
public class Level1 extends Level {
    /**
     * Initializes the level.
     */
    public Level1() {
        //Standard length = 140/2 = 70
        //Easy length = 110/2 = 55
        super.world = """
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWWW                             WWWWW\s
                WWWWWWW                            WWWWW\s
                WWWWWWWW                           WWWWW\s
                WWWWWWWWW                          WWWWW\s
                WWWWWWWWWW                         WWWWW\s
                WWWWWWWWWWW                       WWWWWW\s
                WWWWWWWWWWWW                     WWWWWWW\s
                WWWWWWWWWWWW       G            WWWWWWWW\s
                WWWWWWWWWWW                    WWWWWWWWW\s
                WWWWWWWWWW                    RWWWWWWWWW\s
                WWWWWWWWW            B         WWWWWWWWW\s
                WWWWWWWW                        WWWWWWWW\s
                WWWWWWWW   U                     WWWWWWW\s
                WWWWWWW                           WWWWWW\s
                WWWWWW                             WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                    B         WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                """;
        number = 1;
        name = "Level 1";
        worldOffsetLines = world.split("\\R").length - 23;
        worldOffsetColumns = 0;
    }
}
