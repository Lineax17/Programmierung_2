package thd.game.level;

/**
 * The fifth level of the game.
 */
public class Level9 extends Level{
    /**
     * Initializes a new level.
     */
    public Level9() {
        super.world = """
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                 WW           WWWWW\s
                WWWWW                 WW           WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW            WW                WWWWW\s
                WWWWW            WW                WWWWW\s
                WWWWW            WWW               WWWWW\s
                WWWWW            WWW      F        WWWWW\s
                WWWWW            WWW               WWWWW\s
                WWWWW            WWWW              WWWWW\s
                WWWWW            WWWW              WWWWW\s
                WWWWW            WWWW              WWWWW\s
                WWWWW            WWWW              WWWWW\s
                WWWWW             WWW              WWWWW\s
                WWWWW             WWW              WWWWW\s
                WWWWW             WWW              WWWWW\s
                WWWWW             WWWW             WWWWW\s
                WWWWW             WWWWW            WWWWW\s
                WWWWW              WWWW            WWWWW\s
                WWWWW              WWW             WWWWW\s
                WWWWW     F        WWW             WWWWW\s
                WWWWW              WWW             WWWWW\s
                WWWWW              WWW             WWWWW\s
                WWWWW              WW              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW      G                       WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                     G        WWWWW\s
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
                WWWWW                              WWWWW\s""";
        number = 9;
        name = "Level 9";
        worldOffsetLines = world.split("\\R").length - 23;
        worldOffsetColumns = 0;
    }
}
