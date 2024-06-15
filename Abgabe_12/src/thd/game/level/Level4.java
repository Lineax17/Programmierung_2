package thd.game.level;

/**
 * The fourth level of the game.
 */
public class Level4 extends Level {
    /**
     * Initializes the level.
     */
    public Level4() {
        super.world = """
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWWW                             WWWWW\s
                WWWWWWW                            WWWWW\s
                WWWWWWWW              G            WWWWW\s
                WWWWWWWWW                         WWWWWW\s
                WWWWWWWWWW                       WWWWWWW\s
                WWWWWWWWWWW                      WWWWWWW\s
                WWWWWWWWWWW                     WWWWWWWW\s
                WWWWWWWWWWWL                   WWWWWWWWW\s
                WWWWWWWWWWW       F            WWWWWWWWW\s
                WWWWWWWWWW                    RWWWWWWWWW\s
                WWWWWWWWW                      WWWWWWWWW\s
                WWWWWWWW                        WWWWWWWW\s
                WWWWWWWW                         WWWWWWW\s
                WWWWWWW                           WWWWWW\s
                WWWWWW         A                   WWWWW\s
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
                WWWWW              2HH             WWWWW\s
                WWWWW                2             WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW            WW                WWWWW\s
                WWWWW            WW                WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW          WW                  WWWWW\s
                WWWWW          WW                  WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                   WW         WWWWW\s
                WWWWW                   WW         WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                """;
        number = 4;
        name = "Level 4";
        worldOffsetLines = world.split("\\R").length - 23;
        worldOffsetColumns = 0;
    }
}
