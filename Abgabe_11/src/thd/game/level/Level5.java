package thd.game.level;

/**
 * The fifth level of the game.
 */
public class Level5 extends Level{
    /**
     * Initializes a new level.
     */
    public Level5() {
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
                WWWWW              WW              WWWWW\s
                WWWWWW             WW              WWWWW\s
                WWWWWWW                           WWWWWW\s
                WWWWWWWW                          WWWWWW\s
                WWWWWWWWW                          WWWWW\s
                WWWWWWWWWL                         WWWWW\s
                WWWWWWWWWW                        WWWWWW\s
                WWWWWWWWWW                        WWWWWW\s
                WWWWWWWWW          G               WWWWW\s
                WWWWWWWW                           WWWWW\s
                WWWWWWWW                          WWWWWW\s
                WWWWWWWWW                        WWWWWWW\s
                WWWWWWWWWW                       WWWWWWW\s
                WWWWWWWWWWW                       WWWWWW\s
                WWWWWWWWWWW         222            WWWWW\s
                WWWWWWWWWW           22             WWWW\s
                WWWWWWWWW           222              WWW\s
                WWWWWWWWWL                           WWW\s
                WWWWWWWWW                           WWWW\s
                WWWWWWWW                           WWWWW\s
                WWWWWWW                            WWWWW\s
                WWWWWW                             WWWWW\s
                WWWWW           F                  WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW    G         WW              WWWWW\s
                WWWWW              WWW             WWWWW\s
                WWWWW              WWW     S       WWWWW\s
                WWWWW             WWWW             WWWWW\s
                WWWWW             WWWW             WWWWW\s
                WWWWW            WWWW              WWWWW\s
                WWWWW            WWWW              WWWWW\s
                WWWWW            WWW               WWWWW\s
                WWWWW            WWW               WWWWW\s
                WWWWW     F       WWW              WWWWW\s
                WWWWW             WWW              WWWWW\s
                WWWWWW            WW               WWWWW\s
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
                WWWWWWWW                          WWWWWW\s
                WWWWWWW                            WWWWW\s
                WWWWWW         A                   WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW     WW                       WWWWW\s
                WWWWW     WW                       WWWWW\s
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
        number = 5;
        name = "Level 5";
        worldOffsetLines = world.split("\\R").length - 23;
        worldOffsetColumns = 0;
    }
}
